@file:JsModule("csv-writer")
package js

import kotlin.js.Json
import kotlin.js.Promise

external class ObjectCsvWriter {
    fun writeRecords(r: Array<Json>): Promise<Unit>
}

external fun createObjectCsvWriter(a: Json): ObjectCsvWriter
