(ns app (:require ["@nextjournal/clojure-mode" :as clj-mode]))

(defn init! []
  (js/console.log clj-mode/language_support))
