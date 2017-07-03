import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DCanvas._
import doodle.backend.StandardInterpreter._

object Example {
  (circle(100) fillColor Color.paleGoldenrod lineColor Color.indianRed).draw
}

object Dot {
  (circle(100) fillColor (Color.red desaturate 0.6.normalized)).draw
}

object Boop {
  (circle(350) fillColor Color.red).draw
}

object Hola {
  val hi = "Hi!"
}

object Bonjour {
  val good = "Good"
  {
    val morning = "good" ++ " morning"
    val toYou = "morning" ++ " to you"
  }
  val day = "good" ++ " day, sir!"
}

object Line {
(
  Image.rectangle(40, 40).
    lineWidth(5.0).
    lineColor(Color.royalBlue.spin(30.degrees)).
    fillColor(Color.royalBlue) beside
  Image.rectangle(40, 40).
    lineWidth(5.0).
    lineColor(Color.royalBlue.spin(30.degrees)).
    fillColor(Color.royalBlue) beside
  Image.rectangle(40, 40).
    lineWidth(5.0).
    lineColor(Color.royalBlue.spin(30.degrees)).
    fillColor(Color.royalBlue) beside
  Image.rectangle(40, 40).
    lineWidth(5.0).
    lineColor(Color.royalBlue.spin(30.degrees)).
    fillColor(Color.royalBlue) beside
  Image.rectangle(40, 40).
    lineWidth(5.0).
    lineColor(Color.royalBlue.spin(30.degrees)).
    fillColor(Color.royalBlue)
)
}

object Meow {
  val box =
  Image.rectangle(40, 40).
    lineWidth(5.0).
    lineColor(Color.royalBlue.spin(30.degrees)).
    fillColor(Color.royalBlue).draw
}

object Archery {
  val coloredTarget =
    (Image.circle(10).fillColor(Color.red) on
      Image.circle(20).fillColor(Color.white) on
      Image.circle(30).fillColor(Color.red)
  )

val stand =
  (Image.rectangle(6, 20) above Image.rectangle(20, 6).fillColor(Color.brown))

val ground =
  (Image.rectangle(80, 25).lineWidth(0).fillColor(Color.green))

val image = (coloredTarget above stand above ground).draw
}


object Houses {
  val roof = Image.triangle(50, 30) fillColor Color.brown

val frontDoor =
  (Image.rectangle(50, 15) fillColor Color.red) above (
    (Image.rectangle(10, 25) fillColor Color.black) on
    (Image.rectangle(50, 25) fillColor Color.red)
  )

val house = roof above frontDoor

val tree =
  (
    (Image.circle(25) fillColor Color.green) above
    (Image.rectangle(10, 20) fillColor Color.brown)
  )

val streetSegment =
  (
    (Image.rectangle(30, 3) fillColor Color.yellow) beside
    (Image.rectangle(15, 3) fillColor Color.black) above
    (Image.rectangle(45, 7) fillColor Color.black)
  )

val street = streetSegment beside streetSegment beside streetSegment

val houseAndGarden =
  (house beside tree) above street

val image = ((
  houseAndGarden beside
  houseAndGarden beside
  houseAndGarden
) lineWidth 0).draw
}
