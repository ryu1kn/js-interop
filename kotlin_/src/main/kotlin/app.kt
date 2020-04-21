import jspackage.createObjectCsvWriter

fun main() {
    val records = js("""[{name: 'Bob', lang: 'French, English'}, {name: 'Mary', lang: 'English'}]""")
    val writer = createObjectCsvWriter(toJs(emptyList()))
    writer.writeRecords(records)
}

fun toJs(records: List<Map<String, String>>): dynamic {
    return js("""{path: '__languages.csv', header: [{id:'name',title:'NAME'},{id:'lang',title:'LANGUAGE'}]}""")
}
