package uk.co.devproltd.dummy_service

import cats.effect.ExitCode.Success
import cats.effect._
import cats.implicits._
import fs2.Stream
import org.http4s.implicits._
import org.http4s.server.blaze.BlazeServerBuilder
import uk.co.devproltd.dummy_service.DummyService.dummyService

object Main extends IOApp {

  def stream[F[_]: ConcurrentEffect](implicit T: Timer[F], C: ContextShift[F]): Stream[F, Nothing] =
    BlazeServerBuilder[F].bindHttp(9090, "0.0.0.0").withHttpApp(dummyService[F].orNotFound).serve.drain

  def run(args: List[String]): IO[ExitCode] =
    stream[IO].compile.drain.as(Success)

}
