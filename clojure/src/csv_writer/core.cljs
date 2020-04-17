(ns csv_writer.core
  (:require [csv-writer :as csv]))

(def writer
  (csv/createObjectCsvWriter
    (clj->js {:path "__languages.csv"
              :header [{:id "name" :title "NAME"}
                       {:id "lang" :title "LANGUAGE"}]})))

(def records (clj->js [{:name "Bob"  :lang "French, English"},
                       {:name "Mary" :lang "English"}]))

(.writeRecords writer records)
