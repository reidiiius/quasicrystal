(ns icosahedrite.Lithophone
  (:require [icosahedrite.core :as stelae]))


(def accidentals (keys (sort stelae/monograph)))

(def horologium (str (System/currentTimeMillis)))


;; menu layout
(defn catalogue []
  (prn)
  (doseq [clave (range (count accidentals))]
    (if (zero? (mod (inc clave) 7))
      (println (str "\t" (nth accidentals clave)))
      (print (str "\t" (nth accidentals clave)))))
  (println "\n"))


;; headstock methods

(defn Bj [qp]
  (str (subs (get stelae/monograph qp) 50 60) (subs (get stelae/monograph qp) 0 50)))

(defn Fn [qp]
  (str (subs (get stelae/monograph qp) 25 60) (subs (get stelae/monograph qp) 0 25)))

(defn Cn [qp]
  (get stelae/monograph qp))

(defn Gn [qp]
  (str (subs (get stelae/monograph qp) 35 60) (subs (get stelae/monograph qp) 0 35)))

(defn Dn [qp]
  (str (subs (get stelae/monograph qp) 10 60) (subs (get stelae/monograph qp) 0 10)))

(defn An [qp]
  (str (subs (get stelae/monograph qp) 45 60) (subs (get stelae/monograph qp) 0 45)))

(defn En [qp]
  (str (subs (get stelae/monograph qp) 20 60) (subs (get stelae/monograph qp) 0 20)))

(defn Bn [qp]
  (str (subs (get stelae/monograph qp) 55 60) (subs (get stelae/monograph qp) 0 55)))

(defn Fk [qp]
  (str (subs (get stelae/monograph qp) 30 60) (subs (get stelae/monograph qp) 0 30)))


;; tuning methods

(def fingerboard (fn [pegs]
  (doseq [pitch (range (count pegs))]
    (printf "\t%s\n" (pegs pitch)))))

(defn beadgcf [qp]
  (prn)
  (printf "\t%s%s%s\n" qp "-beadgcf-sv" horologium)
  (try
    (let [headstock [(Fn qp) (Cn qp) (Gn qp) (Dn qp) (An qp) (En qp) (Bn qp)]]
      (fingerboard headstock))
  (catch Exception _ (catalogue)))
  (prn))

(defn bfbfb [qp]
  (prn)
  (printf "\t%s%s%s\n" qp "-bfbfb-sv" horologium)
  (try
    (let [headstock [(Bn qp) (Fn qp) (Bn qp) (Fn qp) (Bn qp)]]
      (fingerboard headstock))
  (catch Exception _ (catalogue)))
  (prn))

(defn cgdae [qp]
  (prn)
  (printf "\t%s%s%s\n" qp "-cgdae-sv" horologium)
  (try
    (let [headstock [(En qp) (An qp) (Dn qp) (Gn qp) (Cn qp)]]
      (fingerboard headstock))
  (catch Exception _ (catalogue)))
  (prn))

(defn dadgad [qp]
  (prn)
  (printf "\t%s%s%s\n" qp "-dadgad-sv" horologium)
  (try
    (let [headstock [(Dn qp) (An qp) (Gn qp) (Dn qp) (An qp) (Dn qp)]]
      (fingerboard headstock))
  (catch Exception _ (catalogue)))
  (prn))

(defn dgdgbd [qp]
  (prn)
  (printf "\t%s%s%s\n" qp "-dgdgbd-sv" horologium)
  (try
    (let [headstock [(Dn qp) (Bn qp) (Gn qp) (Dn qp) (Gn qp) (Dn qp)]]
      (fingerboard headstock))
  (catch Exception _ (catalogue)))
  (prn))

(defn eadgbe [qp]
  (prn)
  (printf "\t%s%s%s\n" qp "-eadgbe-sv" horologium)
  (try
    (let [headstock [(En qp) (Bn qp) (Gn qp) (Dn qp) (An qp) (En qp)]]
      (fingerboard headstock))
  (catch Exception _ (catalogue)))
  (prn))

(defn fkbjdn [qp]
  (prn)
  (printf "\t%s%s%s\n" qp "-fkbjdn-sv" horologium)
  (try
    (let [headstock [(Dn qp) (Bj qp) (Fk qp) (Dn qp) (Bj qp) (Fk qp)]]
      (fingerboard headstock))
  (catch Exception _ (catalogue)))
  (prn))


;; browse pagewise
(defn compendium []
  (doseq [clave accidentals]
    (eadgbe clave)))


