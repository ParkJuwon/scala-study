// zipped 메소드는 모든 리스트 중 가장 짧은 리스트의 원소 개수만큼만 순서쌍을 만들어낸다.
(List(10, 20), List(3, 4, 5)).zipped.map(_ * _)

// exists와 forall도 zipped한 함수가 있다.
// 한 리스트 대신 여러 리스트에서 가져온 원소의 순서쌍에 작용한다는 점을 제외 하면 한 리스트만 처리하는 버전과 거의 같음
(List("abc", "de"), List(3, 2)).zipped.forall(_.length == _)
(List("abc", "de"), List(3, 2)).zipped.exists(_.length != _)


