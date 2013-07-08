(ns surlybird.test.db
  (:require [clojure.test :refer :all]
            [surlybird.db :refer :all]))

(def bad-db "postgresql://surlyturd:surlyturd@localhost:5432/surlyturd")

(deftest test-ping
  (testing (str "demonstrates that you can properly connect to the db"
                " and bad connection strings don't work.")
    (is (= true (ping db)))
    (is (= false (ping bad-db)))))
