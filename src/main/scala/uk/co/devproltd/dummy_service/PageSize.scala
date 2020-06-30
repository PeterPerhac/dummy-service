package uk.co.devproltd.dummy_service

import org.http4s.{ParseFailure, QueryParamDecoder}

final case class PageSize(size: Int)
object PageSize {
  implicit val pageSizeQueryParamDecoder: QueryParamDecoder[PageSize] =
    QueryParamDecoder[Int].emap(
      num =>
        Either.cond(
          num > 0 && num <= 100,
          PageSize(num),
          ParseFailure(s"Invalid pageSize", "Allowable range 1..100")
        )
    )
}
