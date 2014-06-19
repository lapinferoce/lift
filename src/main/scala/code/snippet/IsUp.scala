package code.snippet

import java.util.Date

import code.lib._
import net.liftweb.common._
import net.liftweb.util.Helpers._
import net.liftweb.util._
import net.liftweb.http.{TransientRequestVar, SHtml}
import net.liftweb.http.js.JE.JsRaw
import net.liftweb.http.js.JsCmd
import java.beans.Transient
import code.model.{PonyService, Pony}


class IsUp {
  //object pony extends TransientRequestVar[Pony]
/*  lazy val date: Box[Date] = DependencyFactory.inject[Date] // inject the date

  // replace the contents of the element with id "time" with the date
  def howdy = "#time *" #> date.map(_.toString)
*/
  object pony extends TransientRequestVar[Pony](dflt = PonyService.getRandomPony.openOrThrowException("problem getting pony"))

  def URLS=List("http://www.google.fr","http://yahoo.com")
  def list = "#list" #> URLS.map(_.toString)

  def renderText = "p *"#> "Twilight Sparkle is the best pony"
  def renderImage = "img [src]"#> "images/Twilight-Sparkle.jpg" &
                    "img [atl]" #> "Twilight Sparkle "

  def renderButton = "button [onclick]" #> SHtml.ajaxInvoke( () => JsRaw(
    """
      |$('#ponyid').show();
    """.stripMargin).cmd)

  def renderButton2 = "button [onclick]" #> SHtml.ajaxInvoke(() => theBigReveal)

  def theBigReveal:JsCmd = {
   JsRaw(
     """
       |var div = $('#ponyid');
       |div.show()
       |div.find('p').text('%s is best pony');
       |div.find('img').attr('src','%s')
     """.stripMargin.format(pony.name,pony.imageUrl)).cmd
 }
}
