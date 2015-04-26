package chap14
import org.specs2.mutable._
import Element.elem
/**
 * Created by Real on 2015-04-26.
 */
class ElementSpecification extends Specification{
  "A UniformElement" should {
    "have a width equal to the passed value" in {
      val ele = elem('x', 2, 3)
      ele.width must be_==(2)
    }
    "have a height equal to the passed value" in {
      val ele = elem('x', 2, 3)
      ele.height must be_==(3)
    }
    "throw an IAE if passed a negative width" in {
      elem('x', -2, 3) must
      throwA[IllegalArgumentException]
    }
  }

}
