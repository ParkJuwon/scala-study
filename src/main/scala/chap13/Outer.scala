package chap13

/**
 * Created by Real on 2015-03-29.
 */
/**
 * 비공개 맴버
 */
class Outer {
  class Inner {
    private def f() { println("f") }
    class InnerMost {
      f() // 문제 없음
    }
  }
  //(new Inner).f() // 오류 : f를 찾을 수 없음
  // 자바였다면, 외부 클래스가 자신의 내부 클래스에 있는 비공개 맴버에 접근 가능하기 때문에, 두 접근 모두 가능
}
