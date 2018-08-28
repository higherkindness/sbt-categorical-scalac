import sbt.ScriptedPlugin.{ autoImport => ScriptedKeys }

lazy val root = (project in file("."))
  .enablePlugins(ScriptedPlugin)
  .settings(
    organization := "io.higherkindness",
  )
  .settings(
    ScriptedKeys.scriptedBufferLog := false,
    ScriptedKeys.scriptedLaunchOpts := {
      ScriptedKeys.scriptedLaunchOpts.value ++
      Seq("-Xmx2048M", "-Dplugin.version=" + Keys.version.value)
    })
  .settings(name := "sbt-categorical-scalac")
  .settings(sbtPlugin := true)
