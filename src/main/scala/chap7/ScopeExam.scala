package chap7

/**
 * 변수 스코프
 * Created by Real on 2015-02-02.
 */
object ScopeExam extends App {
  def printMultiTable(): Unit = {
    var i = 1
    // i 만이 스코프 안에 있다.
    while ( i <= 10 ) {
      var j = 1
      // 여기서는 i와 j가 스코프 안에 있다.

      while( j <= 10 ) {
        val prod = (i * j).toString
        // i, j, prod가 스코프 안에 있다.

        var k = prod.length
        // i, j, prod, k가 모두 스코프 안에 있다

        while(k < 4) {
          print(" ")
          k += 1
        }

        print(prod)
        j += 1
      }
      // i와 j는 여전히 스코프 안이지만, prod와 k는 스코프를 벗어난다.
      println()
      i += 1
    }
    // i는 여전히 스코프 안이지만, i, prod, k는 스코프를 벗어난다
  }

  printMultiTable()

  val a = 1;
  {
    val a = 2 // 컴파일 할 수 있다.
    println(a)
  }
  println(a)

  /**
   * 명령형 스타일 코드 리팩토링
   */
  // 하나의 열을 시퀀스로 반환
  def makeRowSeq(row : Int) =
  for (col <- 1 to 10) yield {
    val prod = (row * col).toString
    val padding = " " * (4 - prod.length)
    padding + prod
  }

  // 하나의 열을 문자열로 반환
  def makeRow(row : Int) = makeRowSeq(row).mkString

  // 표를 한 줄에 한 열의 내용을 담고 있는 문자열로 반환
  def multiTable() = {
    val tableSeq = // 한 열에 해당하는 문자열의 시퀸스
    for(row <- 1 to 10)
      yield makeRow(row)

    tableSeq.mkString("\n")
  }

  println(multiTable)
}
