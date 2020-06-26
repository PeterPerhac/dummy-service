package uk.co.devproltd.dummy_service

import cats.Monad
import cats.data.{NonEmptyList, ValidatedNel}
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

    def badRequest(parseFailures: NonEmptyList[ParseFailure]): F[Response[F]] = BadRequest(
      StandardErrorResponse(
        errorType = Client,
        message = s"Bad request: ${parseFailures.toList.map(_.message).mkString("; ")}"
      ).asJson
    )

    implicit class ValidatedOps[T](val vT: ValidatedNel[ParseFailure, T]) {
      def whenValid(f: T => F[Response[F]]): F[Response[F]] =
        vT.fold[F[Response[F]]](badRequest, f)
    }

  }

}
