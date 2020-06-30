package uk.co.devproltd.dummy_service

import cats.effect._
import cats.implicits._
import io.circe.syntax._
import org.http4s.HttpRoutes
import org.http4s.circe._
import org.http4s.dsl.impl.{OptionalValidatingQueryParamDecoderMatcher, ValidatingQueryParamDecoderMatcher}
import uk.co.devproltd.dummy_service.Books.books

object DummyService extends BaseService {

  object PageSizeParamMatcher extends ValidatingQueryParamDecoderMatcher[PageSize]("pageSize")
  object AfterParamMatcher extends OptionalValidatingQueryParamDecoderMatcher[Long]("after")

  def service[F[_]: Sync]: HttpRoutes[F] = {
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
