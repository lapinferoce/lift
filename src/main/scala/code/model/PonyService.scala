package code.model

/**
 * Created by lapinferoce on 6/19/14.
 */
import scala.util.Random
import net.liftweb.common.{Box, Full}

object PonyService {
  private val ponies = Set(
    Pony("Apple jack", "/images/apple-jack.jpg"),
    Pony("Pinky pie", "/images/Pinkie-Pie.jpg"),
    Pony("Twilight Sparkle", "/images/Twilight-Sparkle.jpg"),
    Pony("Rainbow Dash", "/images/Rainbow-Dash.jpg"),
    Pony("Fluttershy", "/images/Fluttershy.jpg")

  )

  def getRandomPony: Box[Pony] = Full(Random.shuffle(ponies.toList).head)
}

case class Pony(name: String, imageUrl: String)