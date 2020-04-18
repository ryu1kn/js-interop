package csv_writer

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.annotation.JSImport.Namespace
import scala.scalajs.js.annotation.{JSExportAll, JSImport}

@JSImport("csv-writer", Namespace)
@js.native
object csv_writer extends CsvWriter

@js.native
trait CsvWriter extends js.Object {
  def createObjectCsvWriter(options: ObjectCsvWriterOption): ObjectCsvWriter = js.native
}

@js.native
trait ObjectCsvWriter extends js.Object {
  def writeRecords(records: js.Array[js.Dictionary[String]]): js.Promise[Unit] = js.native
}

object CsvRecords {
  implicit val toJs = (_: List[Map[String, String]]).map(_.toJSDictionary).toJSArray
}

@JSExportAll
case class ObjectCsvWriterOption(
  path: String,
  header: js.Array[js.Dictionary[String]],
  append: js.UndefOr[Boolean] = js.undefined
)
