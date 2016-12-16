val words = List("the", "quick", "brown", "fox")

List(1, -3, 4, 2, 6) sortWith ( _ < _ )
words sortWith(_.length > _.length)
