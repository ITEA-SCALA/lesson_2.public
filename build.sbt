import Dependencies._

ThisBuild / scalaVersion     := "2.12.10"
ThisBuild / version          := "0.2.0-SNAPSHOT"
ThisBuild / organization     := "com.itea"
ThisBuild / organizationName := "itea"

lazy val root = (project in file("."))
  .settings(
    name := "Lesson-2.public",
    libraryDependencies += scalaTest % Test
  )
