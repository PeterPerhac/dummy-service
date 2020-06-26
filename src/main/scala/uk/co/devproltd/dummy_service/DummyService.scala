package uk.co.devproltd.dummy_service

import cats.effect._
import cats.implicits._
import io.circe.syntax._
import org.http4s.circe._
import org.http4s.dsl.impl.{OptionalValidatingQueryParamDecoderMatcher, ValidatingQueryParamDecoderMatcher}
import org.http4s.{HttpRoutes, ParseFailure, QueryParamDecoder}
import uk.co.devproltd.dummy_service.Books.books

object DummyService extends BaseService {

  final case class PageSize(size: Int)

  implicit val pageSizeQueryParamDecoder: QueryParamDecoder[PageSize] =
    QueryParamDecoder[Int].emap(
      num =>
        Either.cond(
          num > 0 && num <= 100,
          PageSize(num),
          ParseFailure(s"Invalid pageSize", "Allowable range 1..100")
        )
    )

  object PageSizeParamMatcher extends ValidatingQueryParamDecoderMatcher[PageSize]("pageSize")

  object AfterParamMatcher extends OptionalValidatingQueryParamDecoderMatcher[Long]("after")
  QueryParamDecoder.longQueryParamDecoder

  def dummyService[F[_]: Sync]: HttpRoutes[F] = {
    val dsl = new MyServiceDsl[F] {}
    import dsl._

    def booksPaged(after: Option[Long], pageSize: PageSize): Vector[Book] =
      after.fold(books)(a => books.dropWhile(_.id != a)).slice(1, pageSize.size + 1)

    val Api = Root / "dummy-service" / "api"
    HttpRoutes.of[F] {
      case GET -> Api / "books" :? AfterParamMatcher(a) +& PageSizeParamMatcher(ps) =>
        (a.sequence, ps).mapN((after, pageSize) => Ok(booksPaged(after, pageSize).asJson)).leftMap(badRequest).merge
    }
  }

}
