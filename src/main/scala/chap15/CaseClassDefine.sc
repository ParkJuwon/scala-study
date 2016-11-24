
abstract class Expr
case class Var(name : String) extends  Expr
case class Number(num : Double) extends Expr
case class UnOp(operator : String , arg : Expr) extends Expr
case class BinOp(operator : String , left : Expr, right : Expr) extends Expr

// 1. new 키워드 없이 사용가능
val v = Var("x")
val op = BinOp("+", Number(1), v)

// 2. 모든 클래스 파라미터에 암시적으로 val 접두사를 붙힘
v.name
op.left

// 3. toString, hashCode, equals 메소드의 자연스러운 구현을 추가
/*
	이런 메소드들은 케이스 클래스와 그 안의 모든 파라미터로 이뤄진 전체 트리를
	재귀적으로 문자열로 만들고 , 해시 계산, 비교한다.
	스칼라에서 == 를 사용한 비교는 항상 equals 메소드에 위임 하기 때문에
	케이스 클래스가 항상 전체를 구조적으로 서로 비교함
*/

println(op)
op.right == Var("x")

// 4. 컴파일러는 케이스 클래스에서 일부를 변경한 복사본을 생성하는 copy 메소드를 추가
op.copy(operator = "-")
