package uk.co.devproltd.dummy_service

import cats.Monad
import cats.data.ValidatedNel
import io.circe.Encoder
import io.circe.Encoder.encodeString
import io.circe.generic.JsonCodec
import io.circe.syntax._
import org.http4s.circe._
import org.http4s.dsl.Http4sDsl
import org.http4s.{ParseFailure, Response}

abstract class BaseService {

  sealed trait ErrorType
  case object Client extends ErrorType
  case object Server extends ErrorType
  object ErrorType {
    implicit val jsonEncoder: Encoder[ErrorType] = encodeString.contramap(_.toString.toUpperCase())
  }

  @JsonCodec(encodeOnly = true)
  case class StandardErrorResponse(errorType: ErrorType, message: String)

  protected class MyServiceDsl[F[_]: Monad] extends Http4sDsl[F] {

    implicit class ValidatedOps[T](val vT: ValidatedNel[ParseFailure, T]) {
      def whenValid(f: T => F[Response[F]]): F[Response[F]] =
        (vT.fold[F[Response[F]]] _).curried { parseFailures =>
          BadRequest(
            StandardErrorResponse(
              errorType = Client,
              message = s"Bad request: ${parseFailures.toList.map(_.details).mkString("; ")}"
            ).asJson
          )
        }(f)
    }

  }

}
