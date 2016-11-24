val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

for ((country, city) <- capitals)
	println(s"The capital of ${country} is ${city}")

val results = List(Some("apple"), None, Some("orange"))
// 패턴과 일치 하지 않는 값은 버린다
for (Some(fruit) <- results) println(fruit)
