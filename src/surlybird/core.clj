(ns surlybird.core
  (:require [cheshire.core :as cheshire]))

(defn parse-sample-json [filename]
  (let [json (slurp filename)]
    (cheshire/parse-string json)))

(defn -main []
  (prn "sample json --- \n" (parse-sample-json "data/sample.json")))

