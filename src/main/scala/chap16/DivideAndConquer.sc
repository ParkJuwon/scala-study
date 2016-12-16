def append[T] (xs : List[T], ys : List[T]) : List[T] =
xs match {
	case List() => ys
	case x :: xsl => x :: append(xsl, ys)
}