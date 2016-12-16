val abcde = List('a', 'b', 'c', 'd', 'e')

abcde mkString ("[", "," , "]")

abcde mkString ""

abcde mkString ("List(", "," ,")")


val buf = new StringBuilder
abcde addString(buf, "(", ";", ")")

val arr = abcde.toArray
arr.toList

