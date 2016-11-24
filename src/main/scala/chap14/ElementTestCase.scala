package chap14

/**
import junit.framework.TestCase
import junit.framework.Assert.assertEquals
import junit.framework.Assert.fail
import Element.elem
/**
 * Created by Real on 2015-04-26.
 */
class ElementTestCase extends TestCase {
  def testUniformElement() {
    val ele = elem('x', 2, 3)
    assertEquals(2, ele.width)
    assertEquals(3, ele.height)
    try {
      elem('x', -2, 3)
      fail()
    }
    catch {
      case e : IllegalArgumentException => // 발생하리라 예상
    }
  }
}
**/