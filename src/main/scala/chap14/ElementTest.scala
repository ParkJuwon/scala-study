package chap14
import org.testng.annotations.Test
import org.testng.Assert.assertEquals
import Element.elem

/**
 * Created by Real on 2015-04-26.
 */
class ElementTest {
  @Test def verifyUniformElement() {
    val ele = elem('x', 2, 3)
    assertEquals(ele.width, 2)
    assertEquals(ele.height, 3)
  }
  @Test(
    expectedExceptions =
      Array(classOf[IllegalArgumentException])
  )
  def elemShouldTrowIAE(){ elem('x', -2, 3)}
}
