(ns icosahedrite.core (:gen-class))

(load-file "src/icosahedrite/Lithophone.clj")

(defn -main [& arguments]
  (if (= nil (first arguments))
    (do
      (prn)
      (icosahedrite.Lithophone/compendium)
      (icosahedrite.Lithophone/catalogue)
      (prn))
    (if (contains? icosahedrite.Lithophone/monograph (first arguments))
      (do
        (prn)
        (icosahedrite.Lithophone/eadgbe (first arguments))
        (prn))
      (icosahedrite.Lithophone/catalogue))))


;; comment out for leiningen
(-main (first *command-line-args*))


