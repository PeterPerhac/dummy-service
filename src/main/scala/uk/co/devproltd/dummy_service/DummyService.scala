package uk.co.devproltd.dummy_service

import cats.effect._
import io.circe.generic.JsonCodec
import io.circe.syntax._
import org.http4s.HttpRoutes
import org.http4s.circe._

object DummyService extends BaseService {

  @JsonCodec
  case class Book(name: String, author: String, year: Int)

  def dummyService[F[_]: Sync]: HttpRoutes[F] = {
    val dsl = new MyServiceDsl[F] {}
    import dsl._

    val Api = Root / "dummy-service" / "api"
    HttpRoutes.of[F] {
      case GET -> Api / "books" => Ok(Book("Book 1", "Author 1", 2020).asJson)
    }
  }

}
