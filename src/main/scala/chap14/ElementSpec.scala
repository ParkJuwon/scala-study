package chap14

import org.scalatest.prop.Checkers
import org.scalacheck.Prop._
import org.scalatest.{WordSpec, FlatSpec}
import org.scalatest.matchers.ShouldMatchers
import Element.elem

/**
 * Created by Real on 2015-04-26.
 */
/*
class ElementSpec extends FlatSpec with ShouldMatchers{
  "A UniformElement" should
    "have a width equal to the passed value" in {
    val ele = elem('x', 2, 3)
    ele.width should be (2)
  }
  it should "have a height equal to the passed value" in {
    val ele = elem('x', 2, 3)
    ele.height should be (3)
  }
  it should "throw an IAE if passed a negative width" in {
    evaluating{
      elem('x', -2, 3)
    } should produce [IllegalArgumentException]
  }
}
*/

// ScalaCheck 로 프로퍼티 기반 테스트 작성하기
class ElementSpec extends WordSpec with Checkers {

  "elem result" must {
    "have passed width" in {
//      check((w : Int) => w > 0 ==> (elem('x', w, 3).width == w))
    }
    "have passed height" in {
//      check((h: Int) => h > 0 ==> (elem('x', 2, h).height == h))
    }
  }
}