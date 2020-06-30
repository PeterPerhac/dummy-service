package uk.co.devproltd.dummy_service

import cats.effect.ExitCode.Success
import cats.effect._
import cats.implicits._
import org.http4s.implicits._
import org.http4s.server.blaze.{BlazeServerBuilder => Server}
import uk.co.devproltd.dummy_service.DummyService.service

object Main extends IOApp {

  def run(args: List[String]): IO[ExitCode] =
    Server[IO].bindHttp(9090, "0.0.0.0").withHttpApp(service[IO].orNotFound).serve.compile.drain.as(Success)

}
