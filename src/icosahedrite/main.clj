(ns icosahedrite.main
  (:require [icosahedrite.core :as stelae])
  (:require [icosahedrite.Lithophone :as megalith])
  (:gen-class))


;; atrium entryway

(defn -main [& arguments]
  (when (= nil arguments)
    (newline)
    (megalith/compendium)
    (megalith/catalogue megalith/accidentals)
    (prn))
  (when (= clojure.lang.ArraySeq (type arguments))
    (cond
      (= "$" (first arguments))
        (do
          (newline)
          (megalith/compendium)
          (prn))
      (= "?" (first arguments))
        (do
          (newline)
          (megalith/catalogue megalith/accidentals)
          (prn))
      (= "j" (first arguments))
        (do
          (newline)
          (megalith/catalogue
            (megalith/catahoula-cur #"j\d*" megalith/accidentals))
          (prn))
      (= "jk" (first arguments))
        (do
          (newline)
          (megalith/catalogue
            (megalith/catahoula-cur #"j\d*k\d*" megalith/accidentals))
          (prn))
      (= "k" (first arguments))
        (do
          (newline)
          (megalith/catalogue
            (megalith/catahoula-cur #"k\d*" megalith/accidentals))
          (prn))
      (= "kj" (first arguments))
        (do
          (newline)
          (megalith/catalogue
            (megalith/catahoula-cur #"k\d*j\d*" megalith/accidentals))
          (prn))
      (= "n" (first arguments))
        (do
          (newline)
          (megalith/catalogue
            (megalith/catahoula-cur #"n.*" megalith/accidentals))
          (prn))
      (= "x" (first arguments))
        (do
          (newline)
          (megalith/catalogue
            (megalith/catahoula-cur #".*x\d*" megalith/accidentals))
          (prn))
      (= "y" (first arguments))
        (do
          (newline)
          (megalith/catalogue
            (megalith/catahoula-cur #".*y\d*" megalith/accidentals))
          (prn))
      :otherwise
        (do
          (newline)
          (doseq [signat arguments]
            (if (contains? stelae/monograph (str signat))
              (megalith/eadgbe (str signat))
              (do
                (if (< 1 (count arguments))
                  (printf "\n\t%s %s\n\n" signat "?")
                  (megalith/catalogue megalith/accidentals)))))
          (prn)))))


