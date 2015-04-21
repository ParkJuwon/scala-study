package chap13

//import bobsdelights.Fruit
import chap13.bobsdelight.showFruit

/**
 * Created by Real on 2015-03-29.
 */
object PrintMenu {
  def main(args : Array[String]): Unit = {
    for(fruit <- Fruit.menu) {
      showFruit(fruit)
    }
  }
}
