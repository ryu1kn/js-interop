enablePlugins(ScalaJSPlugin)
enablePlugins(ScalaJSBundlerPlugin)

name := "csv-writer"
organization := "io.ryuichi"
scalaVersion := "2.13.1"

scalaJSUseMainModuleInitializer := true
npmDependencies in Compile += "csv-writer" -> "1.6.0"
