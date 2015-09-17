name := "play2torial"

version := "1.0-SNAPSHOT"

libraryDependencies += "org.webjars" % "jquery" % "1.11.2"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings
