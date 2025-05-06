ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.5"

lazy val root = (project in file("."))
  .settings(
    name := "scalaAssignments"
  )

libraryDependencies += "com.lihaoyi" %% "os-lib" % "0.11.4"
