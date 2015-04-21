package chap10

/**
 * Created by john.p on 15. 2. 16..
 */
/*
class ArrayElement(conts : Array[String]) extends Element{
//  def contents: Array[String] = conts
  val contents: Array[String] = conts
}
*/
class ArrayElement(
                    val contents: Array[String]
                    ) extends Element {

  override def demo() {
    println("ArrayElement's implementation invoked")
  }

}