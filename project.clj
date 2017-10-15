(defproject quasicrystal "0.0.5"
  :description "Tonality"
  :url "https://github.com/reidiiius/quasicrystal"
  :license {
    :name "The MIT License"
    :url "https://opensource.org/licenses/MIT"
  }
  :source-paths ["src/icosahedrite"]
  :test-paths ["src/test/icosahedrite"]
  :dependencies [
    [org.clojure/clojure "1.4.0"]
  ]
  :min-lein-version "1.7.1"
  :main icosahedrite.main
  :aot [icosahedrite.main])


