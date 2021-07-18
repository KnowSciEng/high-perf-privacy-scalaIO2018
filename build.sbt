name := "high-perf"


organization := "com.github.scala.io.talk"

scalaVersion := "2.12.14"

val matryoshkaVersion = "0.21.3"
val sparkVersion = "3.1.2"

libraryDependencies ++= Seq(
	"org.apache.spark" %% "spark-core" % sparkVersion,
	"org.apache.spark" %% "spark-sql" % sparkVersion,
	"com.slamdata" %% "matryoshka-core" % matryoshkaVersion
) ++ Seq(
	"org.scalactic" %% "scalactic" % "3.0.5",
	"org.scalatest" %% "scalatest" % "3.0.5" % "test"
)


scalacOptions += "-Ypartial-unification"

resolvers += Resolver.sonatypeRepo("releases")

//addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.13.0")
addCompilerPlugin("org.typelevel" % "kind-projector" % "0.13.0" cross CrossVersion.full)

scalafmtOnCompile := true
