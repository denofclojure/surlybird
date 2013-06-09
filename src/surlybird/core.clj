(ns surlybird.core
  (:require [cheshire.core :as cheshire]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [compojure.response :as response]))

(defn parse-sample-json [filename]
  (let [json (slurp filename)]
    (cheshire/parse-string json)))

(defroutes main-routes
  (GET "/" [] "Hello root")
  (route/resources "/")
  (route/not-found "Page not found"))

(def app
  (handler/site main-routes))

(defn -main []
  (prn "sample json --- \n" (parse-sample-json "data/sample.json")))
