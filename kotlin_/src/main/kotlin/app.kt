import jspackage.createObjectCsvWriter

fun main() {
    val records = js("""
        [
          {name: 'Bob', lang: 'French, English'},
          {name: 'Mary', lang: 'English'}
        ]""")
    val writer = createObjectCsvWriter(js("""
        {
          path: '__languages.csv',
          header: [
            {id: 'name', title: 'NAME'},
            {id: 'lang', title: 'LANGUAGE'}
          ]
        }"""))
    writer.writeRecords(records)
}
