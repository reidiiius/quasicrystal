(ns icosahedrite.core)

(load-file "src/icosahedrite/Lithophone.clj")

(defn -main [arguments]
  (if (= 0 (count arguments))
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


(-main *command-line-args*)


