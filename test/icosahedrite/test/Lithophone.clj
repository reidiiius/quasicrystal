(ns icosahedrite.test.Lithophone
  (:use [icosahedrite.Lithophone :as megalith])
  (:use [clojure.test]))


(deftest Lithophone
  (let [qp "n0"]
    (testing "accidentals"
      (is (= 83 (count megalith/accidentals))))
    (testing "catalogue"
      (is (= nil (megalith/catalogue))))
    (testing "horologium"
      (is (= java.lang.String (type megalith/horologium))))
    (testing "headstock"
      (is (= 60 (count (megalith/Bj qp))))
      (is (= 60 (count (megalith/Fn qp))))
      (is (= 60 (count (megalith/Cn qp))))
      (is (= 60 (count (megalith/Gn qp))))
      (is (= 60 (count (megalith/Dn qp))))
      (is (= 60 (count (megalith/An qp))))
      (is (= 60 (count (megalith/En qp))))
      (is (= 60 (count (megalith/Bn qp))))
      (is (= 60 (count (megalith/Fk qp)))))
    (testing "tuning"
      (is (= nil (megalith/fingerboard [""])))
      (is (= nil (megalith/beadgcf qp)))
      (is (= nil (megalith/bfbfb   qp)))
      (is (= nil (megalith/cgdae   qp)))
      (is (= nil (megalith/dadgad  qp)))
      (is (= nil (megalith/dgdgbd  qp)))
      (is (= nil (megalith/eadgbe  qp)))
      (is (= nil (megalith/fkbjdn  qp))))))


