package chap13

/**
 * Created by Real on 2015-03-29.
 */
class Super {
    protected def f() {println("f")}
  }
  class Sub extends Super {
    f()
  }

  class Other {
    //(new Super).f() // 오류 : f에 접근할 수 없다
    // 자바는 같은 패키지 안에 있는 다른 클래스들도 접근할 수 있다.
  }
