(ns icosahedrite.core)

(load-file "src/icosahedrite/Lithophone.clj")

(def arguments *command-line-args*)

(if (= 0 (count arguments))
  ((fn []
    (prn)
    (icosahedrite.Lithophone/compendium)
    (icosahedrite.Lithophone/catalogue)
    (prn)))
  (if (contains? icosahedrite.Lithophone/monograph (first arguments))
    ((fn []
      (prn)
      (icosahedrite.Lithophone/eadgbe (first arguments))
      (prn)))
    (icosahedrite.Lithophone/catalogue)))


