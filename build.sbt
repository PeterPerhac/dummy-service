val Http4sVersion = "0.21.0-M5"
val CirceVersion = "0.12.3"

lazy val root = (project in file("."))
  .settings(
    organization := "uk.co.devproltd",
    name := "dummy-service",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.13.1",
    libraryDependencies ++= Seq(
      "org.http4s"     %% "http4s-blaze-server" % Http4sVersion,
      "org.http4s"     %% "http4s-circe"        % Http4sVersion,
      "org.http4s"     %% "http4s-dsl"          % Http4sVersion,
      "io.circe"       %% "circe-generic"       % CirceVersion,
      "commons-codec"  % "commons-codec"        % "1.13",
      "ch.qos.logback" % "logback-classic"      % "1.2.3"
    )
  )

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-language:higherKinds",
  "-language:postfixOps",
  "-feature",
  "-Ymacro-annotations"
  /* "-Xfatal-warnings" */
)

enablePlugins(SbtProguard)
proguardOptions in Proguard ++= Seq("-dontnote", "-dontwarn", "-ignorewarnings")
proguardOptions in Proguard += ProguardOptions.keepMain("uk.co.devproltd.dummy_service.Main")
Proguard / proguard / javaOptions := Seq("-Xmx4g")
