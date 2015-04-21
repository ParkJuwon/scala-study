/**
 * 1. 배열 사용
 * 2. 리스트 사용
 * 3. 튜플 사용
 */

val big = new java.math.BigInteger("12345")

val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world\n"

for(i <- 0 to 2)
  print(greetStrings(i))

val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + "were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list")

val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)

val oneTwoThreeTest = 1 :: 2 :: 3 :: Nil
println(oneTwoThreeTest)

val pair = (99, "Luftballons")
println(pair._1)
println(pair._2)

