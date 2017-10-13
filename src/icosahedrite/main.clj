(ns icosahedrite.main
  (:require [icosahedrite.core :as stelae])
  (:require [icosahedrite.Lithophone :as megalith])
  (:gen-class))


(defn -main [& arguments]
  (when (= nil arguments)
    (prn)
    (megalith/compendium)
    (megalith/catalogue)
    (prn))
  (when (= clojure.lang.ArraySeq (type arguments))
    (cond
      (= "$" (first arguments))
        (do
          (prn)
          (megalith/compendium)
          (prn))
      (= "?" (first arguments))
        (do
          (prn)
          (megalith/catalogue)
          (prn))
      :otherwise
        (do
          (prn)
          (doseq [signat arguments]
            (if (contains? stelae/monograph (str signat))
              (megalith/eadgbe (str signat))
              (do
                (if (< 1 (count arguments))
                  (printf "\n\t%s %s\n\n" signat "?")
                  (megalith/catalogue)))))
          (prn)))))


