module Main where

import Prelude

import Effect (Effect)
import Effect.Class (liftEffect)
import Effect.Aff (launchAff_)
import Effect.Console (log)
import Foreign.Csv (createObjectCsvWriter, writeRecords)

main :: Effect Unit
main = launchAff_ do
  writeRecords (createObjectCsvWriter {path: "__languages.csv", header: header}) records
  liftEffect $ log "🍝"

header :: Array {id :: String, title :: String}
header = [{id: "name", title: "NAME"},
          {id: "lang", title: "LANGUAGE"}]

records :: Array {name :: String, lang :: String}
records = [{name: "Bob",  lang: "French, English"},
           {name: "Mary", lang: "English"}]
