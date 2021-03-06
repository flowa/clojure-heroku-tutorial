(defproject flowa-movie-search "1.0.0-SNAPSHOT"
  :description "Clojure Heroku tutorial source code"
  :url "http://flowa.fi"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]
                 [ring/ring-jetty-adapter "1.2.2"]
                 [ring/ring-devel "1.2.2"]
                 [ring-basic-authentication "1.0.5"]
                 [environ "0.5.0"]
                 [com.cemerick/drawbridge "0.0.6"]
                 [hiccup "1.0.5"]
                 [clj-http "0.9.1"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "flowa-movie-search-standalone.jar"
  :profiles {:production {:env {:production true}}})
