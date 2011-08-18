import sbt._
import Keys._

object JUnitInterfaceBuild extends Build {
  val buildSettings: scala.Seq[sbt.Project.Setting[_]] = Defaults.defaultSettings ++ scala.Seq[sbt.Project.Setting[_]](
    name := "junit-interface",
    organization := "com.novocode",
    version := "0.7",
    javacOptions ++= Seq("-target", "1.5"),
    libraryDependencies ++= Seq(
      "junit" % "junit" % "4.8.2",
      "org.scala-tools.testing" % "test-interface" % "0.5"
    ),
    retrieveManaged := true
  )

  lazy val junitInterface = Project("junit-interface", file("."), settings = buildSettings)
}