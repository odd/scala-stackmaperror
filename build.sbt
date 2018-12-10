scalaVersion in ThisBuild := "2.13.0-M5"
val failures = project.
  enablePlugins(JmhPlugin)
val successes = project.
  enablePlugins(JmhPlugin)
