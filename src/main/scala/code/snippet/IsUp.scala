package code.snippet

import java.util.Date

import code.lib._
import net.liftweb.common._
import net.liftweb.util.Helpers._
import net.liftweb.util._

class IsUp {
/*  lazy val date: Box[Date] = DependencyFactory.inject[Date] // inject the date

  // replace the contents of the element with id "time" with the date
  def howdy = "#time *" #> date.map(_.toString)
*/
  def URLS=List("http://www.google.fr","http://yahoo.com")
  def list = "#list" #> URLS.map(_.toString)


}
