
/**
 * Created by Real on 2015-03-29.
 */
/**
 * 4. 숨겨진 패키지 이름에 접근하기
 */
package bobsrockets {
  package navigation {

  package launch {
        class Booster1
    }
    class MissionControl {
      val booster1 = new launch.Booster1
      val booster2 = new bobsrockets.launch.Booster2

      // 스칼라는 사용자가 작성한 모든 패키지 외부에 존재하는 _root_ 패키지를 제공
      // 모든 최상위 패키지는 _root_ 패키지의 맴버로 취급한다
      val booster3 = new  _root_.launch.Booster3
    }
  }
  package launch {
    class Booster2
  }
}

