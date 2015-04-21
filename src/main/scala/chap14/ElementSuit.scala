package chap14

import org.scalatest.{FunSuite, Suite}
import Element.elem

/**
 * Created by Real on 2015-04-21.
 */
// Suite를 확장해 테스트 메소드 작성하기
/*
class ElementSuit extends Suite{
  def testUniformElement(): Unit = {
    val ele = elem('x', 2 ,3)
    assert(ele.width == 2)
  }
}
*/

// FunSuite로 테스트 함수 작성하기
class ElementSuit extends FunSuite {

  test("elem result should have passed width") {
    val ele = elem('x', 2, 3)
    assert(ele.width == 2)
  }
}