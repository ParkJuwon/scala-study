package chap10

/**
 * Created by john.p on 15. 2. 16..
 */
class LineElement (s : String) extends Element {
//class LineElement extends ArrayElement {
    val contents = Array(s)
    override def width = s.length
    override def height = 1

  override def demo() {

    println("LineElement's implementation invoked")
  }

}