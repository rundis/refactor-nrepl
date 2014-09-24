(def VERSION "0.1.0-SNAPSHOT")

(defproject refactor-nrepl VERSION
  :description "nREPL middleware to support editor agnostic refactoring"
  :url "http://github.com/clojure-emacs/refactor-nrepl"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 ^:source-dep [org.clojure/tools.namespace "0.2.5"]
                 ^:source-dep [org.clojure/tools.reader "0.8.5"]
                 ^:source-dep [org.clojure/tools.analyzer.jvm "0.5.4"]
                 [clj-http "0.9.2"]
                 [org.clojure/tools.nrepl "0.2.3"]]
  :plugins [[thomasa/mranderson "0.2.1"]]
  :filespecs [{:type :bytes :path "refactor-nrepl/refactor-nrepl/project.clj" :bytes ~(slurp "project.clj")}]
  :profiles {:test {:dependencies [[print-foo "0.5.3"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0-master-SNAPSHOT"]]}
             :dev {:plugins [[jonase/eastwood "0.1.4"]]
                   :repositories [["snapshots" "http://oss.sonatype.org/content/repositories/snapshots"]]}})
