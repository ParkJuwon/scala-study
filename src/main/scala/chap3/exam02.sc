/**
 * 4. 집합 사용
 * 5. 맵 사용
 */

var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))

val movieSet = scala.collection.mutable.Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)

import scala.collection.immutable.HashSet
val hashSet = HashSet("Tomatoes", "Chilies")
println(hashSet + "Coriander")

val tresureMap = collection.mutable.Map[Int, String]()
tresureMap += (1 -> "Go to island.")
tresureMap += (2 -> "Find big x on ground.")
tresureMap += (3 -> "Dig.")
println(tresureMap(2))

val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
println(romanNumeral(4))

