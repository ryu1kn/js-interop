@file:JsModule("csv-writer")
package jspackage

import kotlin.js.Promise

external class ObjectCsvWriter {
    fun writeRecords(r: Array<dynamic>): Promise<Unit>
}

external fun createObjectCsvWriter(a: dynamic): ObjectCsvWriter
