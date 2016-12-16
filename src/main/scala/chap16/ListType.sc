// Nothing 이 스칼라의 클래스 계층구조의 맨 아래에 있는 타입이다
// 리스트는 Covariant 하므로 서브타입을 가질수 있다.

val empty : List[Nothing] = List()

// List()는 List[String] 타입이기도 하다.
val xs : List[String] = List()