

name := """visitation"""
organization := "com.kodeinc"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"

lazy val postgresversion = "9.4-1201-jdbc41"
libraryDependencies ++= Seq(
  jdbc,
  guice,
  evolutions,
  javaJpa,
  ws,
  caffeine,
  "org.hibernate" % "hibernate-core" % "5.4.9.Final",
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41",
  "org.scalactic" %% "scalactic" % "3.2.2",
  "com.typesafe.slick" %% "slick" % "3.3.2",
  "com.typesafe.slick" %% "slick-testkit" % "3.3.3" % "test",
  "com.typesafe.play" %% "play-json" % "2.8.0-M5",
  "com.typesafe.slick" %% "slick" % "3.2.1",
  "com.typesafe.play" %% "play-slick" % "4.0.2",
  "org.scalactic" %% "scalactic" % "3.2.0",
  "com.typesafe.slick" %% "slick-codegen" % "3.3.2",
  "com.github.tminglei" %% "slick-pg" % "0.19.3",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.3.2",

  "org.scalatest" %% "scalatest-flatspec" % "3.2.0" % "test",
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % "test",
  "org.scalatestplus" %% "mockito-3-4" % "3.2.2.0" % "test",

  //Adding JWT TOkens
  "com.nimbusds" % "nimbus-jose-jwt" % "8.20.2",

  // Adding akka actors
  "com.typesafe.akka" %% "akka-actor" % "2.6.3",

  "org.seleniumhq.selenium" % "selenium-java"            % "3.141.59",
  "commons-io"              % "commons-io"               % "2.8.0",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2",
  "org.scalatest"          %% "scalatest"                % "3.2.8" % "Test",
  "org.scalamock"          %% "scalamock"                % "5.1.0" % "Test"
, "org.typelevel" %%"cats-core"%"2.7.0"
)

scalacOptions ++=Seq(
  "-Xfatal-warnings"
)



//CQRS/Event Sourcing architecture