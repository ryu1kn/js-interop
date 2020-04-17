package io.ryuichi

import csv_writer.{ObjectCsvWriterOption, csv_writer}

import scala.scalajs.js.JSConverters._

object Application {
  val records = List(
    Map("name" -> "Bob", "lang" -> "French, English"),
    Map("name" -> "Mary", "lang" -> "English")
  )

  def main(args: Array[String]): Unit = {
    val header = List(
      Map("id" -> "name", "title" -> "NAME"),
      Map("id" -> "lang", "title" -> "LANGUAGE")
    )
    val params = ObjectCsvWriterOption("__languages.csv", toJs(header))
    val writer = csv_writer.createObjectCsvWriter(params)
    writer.writeRecords(toJs(records))
  }

  private val toJs = (_: List[Map[String,String]]).map(_.toJSDictionary).toJSArray
}
