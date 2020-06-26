package uk.co.devproltd.dummy_service

import java.util.concurrent.Executors

import cats.effect.ExitCode.Success
import cats.effect._
import cats.implicits._
import fs2.Stream
import org.http4s.implicits._
import org.http4s.server.blaze.BlazeServerBuilder
import org.http4s.server.middleware.Logger
import uk.co.devproltd.dummy_service.DummyService.dummyService

import scala.concurrent.ExecutionContext

object Main extends IOApp {

  val blockingEc: ExecutionContext =
    ExecutionContext.fromExecutorService(Executors.newFixedThreadPool(4))

  implicit val blocker: Blocker = Blocker.liftExecutionContext(blockingEc)

  def stream[F[_]: ConcurrentEffect](implicit T: Timer[F], C: ContextShift[F]): Stream[F, Nothing] =
    BlazeServerBuilder[F]
      .bindHttp(9090, "0.0.0.0")
      .withHttpApp(Logger.httpApp(logHeaders = true, logBody = false)(dummyService[F].orNotFound))
      .serve
      .drain

  def run(args: List[String]): IO[ExitCode] =
    stream[IO].compile.drain.as(Success)

}
