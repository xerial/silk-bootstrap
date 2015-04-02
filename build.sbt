
resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

packSettings

val silkVersion = "1.0-SNAPSHOT"

scalaVersion in Global := "2.11.6"

libraryDependencies += "org.xerial.silk" % "silk-core" % silkVersion
