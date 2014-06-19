package code.rest

import net.liftweb.http._
import net.liftweb.http.rest._
import code.model.PonyService
import net.liftweb.json.Extraction


/**
 * Created by lapinferoce on 6/19/14.
 */
object RestPony extends RestHelper{
  serve {
    case Req("api" :: "pony" :: "best" :: Nil, _, GetRequest) =>
      PonyService.getRandomPony.map(pony => Extraction.decompose(pony))
  }
}
