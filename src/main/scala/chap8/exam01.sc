// 1급 계층 함수
(x : Int ) => x + 1

var increase = (x : Int) => x + 1
increase(10)

increase = (x :Int) => x + 9999
increase(10)

increase = (x : Int) => {
  println("We")
  println("are")
  println("here!")
  x + 1
}
increase(10)

val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.foreach((x : Int) => println(x))

// 간단한 형태의 함수 리터럴
someNumbers.filter((x : Int) => x > 0)
someNumbers.filter((x) => x > 0)
someNumbers.filter(x => x > 0)

// 위치 표시자 문법
someNumbers.filter(_ > 0)


val f = (_ : Int) + (_ : Int)
f(5, 10)

someNumbers.foreach(x => println(x))

// 부분 적용한 함수
someNumbers.foreach(println _)

def sum(a : Int, b : Int, c : Int) = a + b + c
sum(1, 2, 3)

val a = sum _
a(1, 2, 3)
a.apply(1, 2, 3)

val b = sum(1, _ : Int, 3)
b(2)
b(4)

someNumbers.foreach(println)
