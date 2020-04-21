import {createObjectCsvWriter} from 'csv-writer'

const params = {
  path: '__languages.csv',
  header: [
    {id: 'name', title: 'NAME'},
    {id: 'lang', title: 'LANGUAGE'}
  ]
}
const records = [
  {name: 'Bob', lang: 'French, English'},
  {name: 'Mary', lang: 'English'}
]

createObjectCsvWriter(params).writeRecords(records)
