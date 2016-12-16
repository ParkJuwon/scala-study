// 원소로부터 리스트 만들기 : List.apply
List.apply(1, 2, 3)

// 수의 범위를 리스트로 만들기 : List.range
List.range(1, 5)
List.range(1, 9, 2)
List.range(9, 1, -3)

// 균일한 리스트 생성 : List.fill
List.fill(5)('a')
List.fill(3)("hello")
// 다차원 리스트 생성
List.fill(2, 3)('b')
// case class 도 되는것인가
case class data (val a:Int = 1, val b:Int =2, val c:Int =3)
val listdata = List.fill(3)(data())
listdata.foreach(d => println(d.a))


// 함수 도표화 : List.tabulate
// 첫번째 인자 목록은 생성할 리스트의 차원
// 두번째 인자는 리스트의 원소를 묘사. 다만, 어떤 정해진 원소 대신 함수를 가지고 원소를 계산한다는 점
val squares = List.tabulate(5)(n => n * n)
val multiplication = List.tabulate(5, 5)( _ * _)

// 여러 리스트 연결하기 : List.concat
List.concat(List('a', 'b'), List('c'))
List.concat(List(), List('b'), List('c'))
List.concat()



