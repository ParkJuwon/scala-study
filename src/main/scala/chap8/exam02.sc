// 클로저

var more = 1
val addMore = (x : Int) => x + more
addMore(10)

more = 9999
addMore(10)

val someNumbers = List(-11, -10, -5, 0, 5, 10)
var sum = 0
someNumbers.foreach(sum += _)
sum

def makeIncreaser(more : Int) = (x : Int) => x + more

val inc1 = makeIncreaser(1)
val inc9999 = makeIncreaser(9999)

inc1(10)
inc9999(10)

// 특별한 형태의 함수 호출
def echo(args : String*) = for (arg <- args) println(arg)

echo()
echo("one")
echo("hello", "world!")

val arr = Array("What's", "up", "doc?")
echo(arr : _*)

def speed(distance : Float, time : Float) : Float =
distance / time

speed(100,10)
speed(distance = 100, time = 10)
speed(time = 10, distance = 100)

def printTime(out : java.io.PrintStream = Console.out) =
out.println("time = " + System.currentTimeMillis())

println(Console.err)

def printTime2(out : java.io.PrintStream = Console.out, divisor : Int = 1) =
out.println("time = " + System.currentTimeMillis() / divisor)

printTime2(out = Console.err)
printTime2(divisor = 1000)

