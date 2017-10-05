(ns icosahedrite.test.core
  (:use [icosahedrite.core])
  (:use [clojure.test]))


(deftest lithophone
  (let [qp "n0"]
  (testing "monograph accidentals"
    (is (= 83 (count icosahedrite.Lithophone/monograph)))
    (is (= 83 (count icosahedrite.Lithophone/accidentals))))
  (testing "headstock"
    (is (= 60 (count (icosahedrite.Lithophone/Bj qp))))
    (is (= 60 (count (icosahedrite.Lithophone/Fn qp))))
    (is (= 60 (count (icosahedrite.Lithophone/Cn qp))))
    (is (= 60 (count (icosahedrite.Lithophone/Gn qp))))
    (is (= 60 (count (icosahedrite.Lithophone/Dn qp))))
    (is (= 60 (count (icosahedrite.Lithophone/An qp))))
    (is (= 60 (count (icosahedrite.Lithophone/En qp))))
    (is (= 60 (count (icosahedrite.Lithophone/Bn qp))))
    (is (= 60 (count (icosahedrite.Lithophone/Fk qp)))))
 (testing "tuning"
    (is (= nil (icosahedrite.Lithophone/finger-board [""])))
    (is (= nil (icosahedrite.Lithophone/beadgcf qp)))
    (is (= nil (icosahedrite.Lithophone/bfbfb   qp)))
    (is (= nil (icosahedrite.Lithophone/cgdae   qp)))
    (is (= nil (icosahedrite.Lithophone/dadgad  qp)))
    (is (= nil (icosahedrite.Lithophone/dgdgbd  qp)))
    (is (= nil (icosahedrite.Lithophone/eadgbe  qp)))
    (is (= nil (icosahedrite.Lithophone/fkbjdn  qp))))
  (testing "catalogue"
    (is (= nil (icosahedrite.Lithophone/catalogue))))
  (testing "horologium"
    (is (= java.lang.Long (type icosahedrite.Lithophone/horologium))))))
 
 
