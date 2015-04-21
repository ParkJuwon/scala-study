package chap7

/**
 * For 표현식
 * Created by Real on 2015-02-01.
 */
object ForExpression extends App{
  def fileLoop = {
    val fileHere = (new java.io.File(".")).listFiles
    for(file <- fileHere) {
      println(file)
    }
  }

  def filterLoop = {
    val fileHere = (new java.io.File(".")).listFiles
    for (file <- fileHere if file.getName.endsWith(".scala"))
      println(file)
  }

  def manyFilterLoop = {
    val fileHere = (new java.io.File(".")).listFiles
    for (
      file <- fileHere
      if file.isFile
      if file.getName.endsWith(".scala")
    ) println(file)
  }


  val fileHere = (new java.io.File("./src/chap7")).listFiles
  def fileLines(file : java.io.File) = scala.io.Source.fromFile(file).getLines.toList

  def fileGrep = {
    def grep(pattern : String) =
      for(
        file <-fileHere;
        if file.getName.endsWith(".scala");
        line <- fileLines(file)
        if line.trim.matches(pattern)
      ) println(file + " : " + line.trim)
    grep(".*gcd.*")
  }

  def forBinding = {

    def grep(pattern : String) =
    for {
      file <- fileHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } println(file + " : " + trimmed)
    grep(".*gcd.*")
  }

  def scalaFiles = for {
    file <- fileHere
    if file.getName.endsWith(".scala")
  } yield file

//  for (file <- fileHere if file.getName.endsWith(".scala")) yield file

  val forLineLengths =
  for {
    file <- fileHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")
  } yield trimmed.length

  forLineLengths.foreach(println)



}
