import java.io.{PrintWriter, File}
import java.util.Date

def twice(op : Double => Double, x : Double) = op(op(x))
twice(_ + 1, 5)

def withPrintWriter(file : File, op : PrintWriter => Unit) {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally
  writer.close()
}

withPrintWriter(
new File("date.txt"),
writer => writer.println(new java.util.Date)
)

println("Hello, world!")

println {"Hello, world!"}

def withPrintWriterCurring(file : File)(op : PrintWriter => Unit): Unit = {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close()
  }
}

val file = new File("date.txt")

// 이름에 의한 호출 파라미터
withPrintWriterCurring(file) {
  writer => writer.println(new Date())
}