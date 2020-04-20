const moduleCsvWriter = require('csv-writer')

exports.createObjectCsvWriter = moduleCsvWriter.createObjectCsvWriter

exports._writeRecords = writer => records => () => writer.writeRecords(records)
