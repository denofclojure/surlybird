(ns surlybird.core
  (:require [clojure.java.jdbc :as jdbc]))

(def db "postgresql://surlybird:surlybird@localhost:5432/surlybird")

(defn ping [db]
  (jdbc/with-connection db
    (jdbc/with-query-results results
      ["select * from fruit"]
      (into [] results))))

;; (ping db)
