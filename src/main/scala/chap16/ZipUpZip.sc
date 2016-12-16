val abcde = List('a', 'b', 'c', 'd', 'e')

abcde.indices zip abcde
val zipped = abcde zip List(1,2,3) // 길이가 다르면 길이가 긴 쪽의 남는 원소를 버린다

abcde.zipWithIndex
zipped.unzip