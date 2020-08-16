(defproject vafer/notif "0.1.1"
  :description  "A super tiny library to generate toast notification base on Bulma notification component"
  :url "https://github.com/vafer11/notif"
  :license {:name "EPL-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :plugins [[lein-cljsbuild "1.1.8"]]
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.764"]
                 [reagent "1.0.0-alpha2"]]
  :source-paths ["src/clj" "src/cljs"]
  :cljsbuild {
              :builds [{
                        :source-paths ["src/cljs"]
                        :compiler {
                                   :output-to "resources/public/notif.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]})
