name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala$"

enablePlugins(JavaAppPackaging)

lazy val versions = new {
  val finatra        = "2.1.6"
  val guice          = "4.0"
  val logback        = "1.1.7"
  val mockito        = "1.9.5"
  val scalatest      = "2.2.6"
  val junitInterface = "0.11"
}

libraryDependencies ++= Seq(
  "com.twitter.finatra"          %% "finatra-http"       % versions.finatra,
  "com.twitter.finatra"          %% "finatra-httpclient" % versions.finatra,
  "ch.qos.logback"               % "logback-classic"     % versions.logback,
  "com.twitter.finatra"          %% "finatra-http"       % versions.finatra % "test",
  "com.twitter.finatra"          %% "finatra-jackson"    % versions.finatra % "test",
  "com.twitter.inject"           %% "inject-server"      % versions.finatra % "test",
  "com.twitter.inject"           %% "inject-app"         % versions.finatra % "test",
  "com.twitter.inject"           %% "inject-core"        % versions.finatra % "test",
  "com.twitter.inject"           %% "inject-modules"     % versions.finatra % "test",
  "com.google.inject.extensions" % "guice-testlib"       % versions.guice % "test",
  "com.twitter.finatra"          %% "finatra-http"       % versions.finatra % "test" classifier "tests",
  "com.twitter.finatra"          %% "finatra-jackson"    % versions.finatra % "test" classifier "tests",
  "com.twitter.inject"           %% "inject-server"      % versions.finatra % "test" classifier "tests",
  "com.twitter.inject"           %% "inject-app"         % versions.finatra % "test" classifier "tests",
  "com.twitter.inject"           %% "inject-core"        % versions.finatra % "test" classifier "tests",
  "com.twitter.inject"           %% "inject-modules"     % versions.finatra % "test" classifier "tests",
  "org.mockito"                  % "mockito-core"        % versions.mockito % "test",
  "org.scalatest"                %% "scalatest"          % versions.scalatest % "test",
  "com.novocode"                 % "junit-interface"     % versions.junitInterface % "test"
)

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-feature",
  "-language:implicitConversions",
  "-language:existentials",
  "-language:higherKinds",
  "-language:postfixOps",
  "-unchecked",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Xfuture",
  "-target:jvm-1.7"
)
