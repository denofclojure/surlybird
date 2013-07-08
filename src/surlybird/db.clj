(ns surlybird.db
  (:require [clojure.java.jdbc :as jdbc]))

(def db "postgresql://surlybird:surlybird@localhost:5432/surlybird")

(defn ping [db]
  (try
    (jdbc/with-connection db
      (jdbc/with-query-results results
        ["select 1"]
        true))
    (catch Exception ex
      false)))

