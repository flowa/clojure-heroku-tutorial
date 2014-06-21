(ns flowa-movie-search.views.layout
  (:require [hiccup.page :refer [html5 include-css]])
  (:require [hiccup.form :refer [form-to]]))

(defn- custom-input [type name placeholder]
  [:div
   [:input {:type type :name name :placeholder placeholder :style "float:left"}]])

(defn- submit-btn [text]
  [:button {:id "submit" :class "btn btn-primary"} text])

(defn- movie-list [{entries :Search}]
  [:div
   [:h4 "Found:"]
   (for [{title :Title year :Year} entries]
     [:div (str title " (" year ")")])])

(defn common [& body]
  (html5
    [:head
     [:title "Flowa Heroku demo"]
     (include-css "bootstrap.min.css")]
    [:body body]))

(defn search-page [& [results]]
  [:div
   [:div {:class "well"}
    [:h4 "The amazing Flowa movie search"]
    (form-to [:post "/"]
             (custom-input "text" "search-string" "Movie title")
             (submit-btn "Search"))]
    (if results
     (movie-list results))])
