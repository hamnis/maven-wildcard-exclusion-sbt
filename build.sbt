organization := "net.hamnaberg"

name := "exclustion-test"

resolvers += "Local Repository" at ((Path.userHome / ".m2" / "repository").toURI.toString)

libraryDependencies += "net.hamnaberg" % "hbase-0.94-clean" % "1.0-SNAPSHOT"

