(ns surlybird.core
  (:require [cheshire.core :as json]
            [clojure.java.io :refer [reader file]]
            [clojure.pprint :refer [pprint]]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [compojure.response :as response]))

(def db
  {:subprotocol "postgresql"
   :subname "//127.0.0.1:5432/devspect-api"})

(defn get-coords [filename]
  (let [everything (json/parse-stream (reader (file filename)) true)
        coords-str (everything :coords)]
    (json/decode coords-str true)))

(defroutes main-routes
  (GET "/" [] "Hello root")
  (GET "/coords" []
    (prn "GET /coords")
    (str (get-coords "data/sample.json")))
  (route/resources "/")
  (route/not-found "Page not found"))

(def app
  (handler/site main-routes))

(defn -main []
  (println "coordinates from sample json ---")
  (pprint (get-coords "data/sample.json")))
