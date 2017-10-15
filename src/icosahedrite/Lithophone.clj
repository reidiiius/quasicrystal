(ns icosahedrite.Lithophone
  (:require [icosahedrite.core :as stelae]))


;; utility receptacles

(def accidentals (sort (keys stelae/monograph)))

(def horologium (str (System/currentTimeMillis)))


;; menu layout

(defn catahoula-cur [scent swamp]
  (filter string?
    (map (fn [qp] (re-matches scent qp)) swamp)))

(defn catalogue [specie]
  (newline)
  (doseq [ndx (range (count specie))]
    (if (zero? (mod (inc ndx) 7))
      (println (str "\t" (nth specie ndx)))
      (print (str "\t" (nth specie ndx)))))
  (println "\n"))


;; headstock methods

(defn chromograph [qp ndx]
  (str
    (subs (get stelae/monograph (str qp)) ndx 60)
    (subs (get stelae/monograph (str qp)) 0 ndx)))

(defn Bj [qp]
  (chromograph qp 50))

(defn Fn [qp]
  (chromograph qp 25))

(defn Cn [qp]
  (get stelae/monograph (str qp)))

(defn Gn [qp]
  (chromograph qp 35))

(defn Dn [qp]
  (chromograph qp 10))

(defn An [qp]
  (chromograph qp 45))

(defn En [qp]
  (chromograph qp 20))

(defn Bn [qp]
  (chromograph qp 55))

(defn Fk [qp]
  (chromograph qp 30))


;; tuning methods

(def fingerboard (fn [pegs]
  (doseq [pitch (range (count pegs))]
    (printf "\t%s\n" (pegs pitch)))))

(defn beadgcf [qp]
  (newline)
  (printf "\t%s%s%s\n" qp "-beadgcf-sv" horologium)
  (try
    (let [headstock [(Fn qp) (Cn qp) (Gn qp) (Dn qp) (An qp) (En qp) (Bn qp)]]
      (fingerboard headstock))
  (catch Exception _ (catalogue accidentals)))
  (prn))

(defn bfbfb [qp]
  (newline)
  (printf "\t%s%s%s\n" qp "-bfbfb-sv" horologium)
  (try
    (let [headstock [(Bn qp) (Fn qp) (Bn qp) (Fn qp) (Bn qp)]]
      (fingerboard headstock))
  (catch Exception _ (catalogue accidentals)))
  (prn))

(defn cgdae [qp]
  (newline)
  (printf "\t%s%s%s\n" qp "-cgdae-sv" horologium)
  (try
    (let [headstock [(En qp) (An qp) (Dn qp) (Gn qp) (Cn qp)]]
      (fingerboard headstock))
  (catch Exception _ (catalogue accidentals)))
  (prn))

(defn dadgad [qp]
  (newline)
  (printf "\t%s%s%s\n" qp "-dadgad-sv" horologium)
  (try
    (let [headstock [(Dn qp) (An qp) (Gn qp) (Dn qp) (An qp) (Dn qp)]]
      (fingerboard headstock))
  (catch Exception _ (catalogue accidentals)))
  (prn))

(defn dgdgbd [qp]
  (newline)
  (printf "\t%s%s%s\n" qp "-dgdgbd-sv" horologium)
  (try
    (let [headstock [(Dn qp) (Bn qp) (Gn qp) (Dn qp) (Gn qp) (Dn qp)]]
      (fingerboard headstock))
  (catch Exception _ (catalogue accidentals)))
  (prn))

(defn eadgbe [qp]
  (newline)
  (printf "\t%s%s%s\n" qp "-eadgbe-sv" horologium)
  (try
    (let [headstock [(En qp) (Bn qp) (Gn qp) (Dn qp) (An qp) (En qp)]]
      (fingerboard headstock))
  (catch Exception _ (catalogue accidentals)))
  (prn))

(defn fkbjdn [qp]
  (newline)
  (printf "\t%s%s%s\n" qp "-fkbjdn-sv" horologium)
  (try
    (let [headstock [(Dn qp) (Bj qp) (Fk qp) (Dn qp) (Bj qp) (Fk qp)]]
      (fingerboard headstock))
  (catch Exception _ (catalogue accidentals)))
  (prn))


;; browse pagewise

(defn compendium []
  (doseq [clave accidentals]
    (eadgbe clave)))


