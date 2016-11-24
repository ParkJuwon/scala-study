name := "scala-study"

version := "1.0"

scalaVersion := "2.11.6"
//scalaVersion := "2.11.x"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.4",
  "junit" % "junit" % "4.12" % "test",
  "org.testng" % "testng" % "6.8.21",
  "org.scalacheck" %% "scalacheck" % "1.12.0",
  "org.specs2" % "specs2_2.10" % "1.13"
)
