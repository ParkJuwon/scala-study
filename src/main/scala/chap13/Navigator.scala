package chap13



/**
 * Created by Real on 2015-03-29.
 */

/**
 * 1. 패키지 안에 코드 작성하기
 */
// 모든 파일을 한 패키지 않에 넣기
/*
  package bobsrockets.navigation
  class Navigator
*/

// 패키징(packaging)
/*
  package bobsrockets.navigation {
    class Navigator
  }
*/

//  한 파일 안에 여러 패키지 넣기
/*
  package bobsrckets {
    package navigation {
      // bobsrckets.navigation 패키지 안쪽
      class Navigator

      package tests {
        // bobsrckets.navigation.tests 패키지 안쪽
        class NavigatorSuit
      }
    }
  }
 */

/**
 * 2. 관련 코드에 간결하게 접근하기
 */
// 클래스와 패키지에 간결하게 접근하기
/*
package bobsrockets {
  package navigation {
    class Navigator {
      // bobsrockets.navigation.StarMap 을 쓸 필요가 없다
      val map = new StarMap
    }
    class StarMap
  }
  class Ship {
    // bobsrockets.navigation.Navigator 를 쓸 필요가 없다
    val nav = new navigation.Navigator
  }

  package fleets {
    class Fleet {
      // bobsrckets.Ship 을 쓸 필요가 없다.
      def addShip() { new Ship }
    }
  }
}
*/

//상위 패키지 안에 있는 기호를 그냥 사용할 수는 없다
/*
package bobsrockets {
  class Ship
}
package bobsrockets.fleets {
  class Fleet {
    // 컴파일할 수 없다 ! 이 스코프에는 Ship이 안들어 있다.
    def addShip() { new Ship }
  }
}
*/