package bobsrockets

/**
  * Created by Real on 2015-03-29.
 */
/**
  * 공개 맴버
 */
class Public

// 접근 지정자를 사용해 보호 영역을 유연하게 설정하기
// 보호 스코프
package navigation {
  private[bobsrockets] class Navigator { // bobsrockets 패키지 내부에 있는 모든 객체와 클래스에서 Navigator 접근 가능
    protected[navigation] def userStartChart() {}
    class LegOfJourney{
      private[Navigator] val distance = 100
    }

    private[this] var speed = 200 // 객체 전용 제한자
  }
}

package launch {

import navigation._

object Vehicle {
  private[launch] val guide = new Navigator // bobsrockets 패키지 밖에 있는 모든 코드는 접근 불가가
}

}
