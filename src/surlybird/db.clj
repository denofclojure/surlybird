(ns surlybird.core
  (:require [clojure.java.jdbc :as jdbc]
            [clojure.java.jdbc.sql :as sql]))

(def db {:classname "org.postgresql.Driver"
         :subprotocol "postgres"
         :subname "//localhost:5432/surlybird"
         :user "surlybird"
         :password "surlybird"})

(defn ping [db]
    (jdbc/query db
                (sql/select * :fruit)))
