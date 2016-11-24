// 타입소거
/*
	스칼라는 자바와 마찬가지로 제네릭에서 타입소거 모델을 사용
	이는 런타임에 타입 인자에 대한 정보를 유지하지 않는 다는 뜻
	결과적으로, 실행 시에는 어떤 맵 객체를 두 Int 타입을 타입 인자로 받아서 생성한 것인지
	다른 타입들을 받아서 생성한 것인지 알 방법이 없다.
*/

def isIntIntMap(x : Any) = x match {
	case m : Map[Int, Int] => true
	case _ => false
}
isIntIntMap(Map(1->1))
isIntIntMap(Map("abc"->"abc"))

/*
	유일한 예외는 배열
 */
def isStringArray(x : Any) = x match {
	case a: Array[String] => "yes"
	case _ => "no"
}
val as = Array("abc")
isStringArray(as)
val ai = Array(1,2,3)
isStringArray(ai)
isStringArray(Array(1))
