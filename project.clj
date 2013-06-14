(defproject surlybird "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [cheshire "5.2.0"]
                 [ring "1.1.8"]
                 [compojure "1.1.5"]
                 [org.clojure/java.jdbc "0.3.0-alpha4"]
                 [postgresql/postgresql "8.4-702.jdbc4"]]
  :plugins [[lein-ring "0.8.5"]]
  :ring {:handler surlybird.core/app}
  :main surlybird.core)
