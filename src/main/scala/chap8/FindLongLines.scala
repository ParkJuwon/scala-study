package chap8

/**
 * Created by john.p on 15. 2. 5..
 */
// 꼬리 재귀
object FindLongLines {
  def main(args : Array[String]) {
    val width = args(0).toInt
    for(arg <- args.drop(1))
      LongLines.processFile(arg, width)
  }
}
