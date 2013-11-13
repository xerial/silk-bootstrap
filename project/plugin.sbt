
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.2")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.7.1")

addSbtPlugin("org.xerial.sbt" % "sbt-pack" % "0.3.6")

addSbtPlugin("org.xerial.sbt" % "silk-sbt" % "1.0-SNAPSHOT")

scalacOptions ++= Seq("-deprecation", "-feature")
