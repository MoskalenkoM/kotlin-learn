const val MAX_POINTS: Int = 5000 // Compile-time constant

fun main() {

  var gamePoint = 100 // Number variable
  var strTemplate = "Play" // String variable
  val playerName = "Maxi" // String constant

  gamePoint+=25
  strTemplate += "er"

  println("$strTemplate $playerName has $gamePoint points of max points $MAX_POINTS")
  println(strTemplate.reversed())

}