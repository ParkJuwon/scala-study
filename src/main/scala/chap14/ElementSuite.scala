package chap14

import org.scalatest.junit.JUnit3Suite
import org.scalatest.testng.TestNGSuite
import org.scalatest.{FunSuite, Suite}
import Element.elem
import org.testng.annotations.Test

/**
 * Created by Real on 2015-04-21.
 */
// Suite를 확장해 테스트 메소드 작성하기
// 리플렉션을 지원 하므로 test 접두어로 표기
/*
class ElementSuite extends Suite{
  def testUniformElement(): Unit = {
    val ele = elem('x', 2 ,3)
    assert(ele.width == 2)
  }
}
*/

// FunSuite로 테스트 함수 작성하기
/*
class ElementSuite extends FunSuite {

  val ele = elem('x', 2, 3)
  test("elem result should have passed width") {
    assert(ele.width === 2)
  }
  expect(2) {
    ele.width
  }

  intercept[IllegalArgumentException] {
    elem('x', -2, 3)
  }
}
*/

// Junit3Suite로 JUnit 테스트 작성하기
/*
class ElementSuite extends JUnit3Suite {
  def testUniformElement() {
    val ele = elem('x', 2, 3)
    assert(ele.width === 2)
    expect(3) { ele.height }
    intercept[IllegalArgumentException] {
      elem('x', -2, 3)
    }
  }
}
*/

// TestNGSuite 로 TestNG 테스트 작성하기
class ElementSuite extends TestNGSuite {
  @Test def verifyUniformElement() {
    val ele = elem('x', 2, 3)
    assert(ele.width === 2)
    expect(3) { ele.height }
    intercept[IllegalArgumentException] {
      elem('x', -2, 3)
    }
  }
}