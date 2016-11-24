val second : List[Int] => Int = {
	case x :: y :: _ => y
}

second(List(5, 6, 7))
//second(List()) // 빈 리스트를 넘기면 실패한다

// 부분 함수가 정의 되었는지 체크하기 원한다면
// 우선 컴파일러에게 부분 함수를 가지고 작업한다는 사실을 알려야함
val second2 : PartialFunction[List[Int], Int] = {
	case x :: y :: _ => y
}
// 부분 함수에는 isDefinedAt이라는 메소드가 있음
// isDefinedAt 메소드는 부분 함수가 어떤 값에 대해 결과 값을 정의하고 있는지 알려준다.
second2.isDefinedAt(List(5, 6, 7))
second2.isDefinedAt(List())
