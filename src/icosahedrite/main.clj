(ns icosahedrite.main
  (:require [icosahedrite.core :as stelae])
  (:require [icosahedrite.Lithophone :as megalith])
  (:gen-class))


(defn -main [& arguments]
  (if (= nil (first arguments))
    (do
      (prn)
      (megalith/compendium)
      (megalith/catalogue)
      (prn))
    (if (contains? stelae/monograph (first arguments))
      (do
        (prn)
        (megalith/eadgbe (first arguments))
        (prn))
      (megalith/catalogue))))


