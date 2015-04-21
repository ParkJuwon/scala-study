package chap9

/**
 * Created by john.p on 15. 2. 9..
 */
object FileMatcher {
  private def fileHere = (new java.io.File(".")).listFiles

//  def filesMatching(query : String, matcher : (String, String) => Boolean) = {
  def filesMatching(matcher : String => Boolean) = {
//    for (file <- fileHere; if matcher(file.getName, query)) yield file
    for (file <- fileHere; if matcher(file.getName)) yield file
  }

  def filesEnding(query : String) =
  //    for(file <- fileHere; if file.getName.endsWith(query)) yield file
  //    filesMatching(query, _.endsWith(_)) // fileName.endWith(query)
    filesMatching(_.endsWith(query))

  def fileContaining(query : String) =
  //    for(file <- fileHere; if file.getName.contains(query)) yield file
  //    filesMatching(query, _.contains(_)) // fileName.contains(query)
    filesMatching(_.contains(query))

  def filesRegex(query : String) =
  //    for(file <- fileHere; if file.getName.matches(query)) yield file
  //    filesMatching(query, _.matches(_)) // fileName.matches(query)
    filesMatching(_.matches(query))
}
