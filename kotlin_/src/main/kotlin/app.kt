import jspackage.createObjectCsvWriter
import kotlin.js.json

fun main() {
    val records = arrayOf(
        json("name" to "Bob", "lang" to "French, English"),
        json("name" to "Mary", "lang" to "English")
    )
    val params = json(
        "path" to "__languages.csv",
        "header" to arrayOf(
            json("id" to "name", "title" to "NAME"),
            json("id" to "lang", "title" to "LANGUAGE")
        )
    )
    createObjectCsvWriter(params).writeRecords(records)
}
