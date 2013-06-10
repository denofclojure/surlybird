(ns surlybird.core
  (:require [cheshire.core :as cheshire]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [compojure.response :as response]))

(defn get-coords [filename]
  (let [everything (cheshire/parse-string (slurp filename))
        coords-str (everything "coords")]
    (cheshire/parse-string coords-str)))

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
  (prn "coordinates from sample json --- \n" (get-coords "data/sample.json")))
