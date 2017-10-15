(ns icosahedrite.test.Lithophone
  (:use [icosahedrite.Lithophone :as megalith])
  (:use [clojure.test]))


(deftest Lithophone
  (let [db megalith/accidentals, qp (last db)]
    (testing "utility receptacles"
      (is (= clojure.lang.ArraySeq (type db)))
      (is (= 83 (count db)))
      (is (< 12 (count megalith/horologium)))
      (is (= java.lang.String (type megalith/horologium))))
    (testing "menu layout"
      (is (= nil (megalith/catalogue db)))
      (is (= 9 (count (megalith/catahoula-cur #".\d" db))))
      (is (= clojure.lang.LazySeq (type (megalith/catahoula-cur #".\d" db)))))
    (testing "headstock methods"
      (is (= 60 (count (megalith/Bj qp))))
      (is (= 60 (count (megalith/Fn qp))))
      (is (= 60 (count (megalith/Cn qp))))
      (is (= 60 (count (megalith/Gn qp))))
      (is (= 60 (count (megalith/Dn qp))))
      (is (= 60 (count (megalith/An qp))))
      (is (= 60 (count (megalith/En qp))))
      (is (= 60 (count (megalith/Bn qp))))
      (is (= 60 (count (megalith/Fk qp)))))
    (testing "tuning methods"
      (is (= nil (megalith/fingerboard [""])))
      (is (= nil (megalith/beadgcf qp)))
      (is (= nil (megalith/bfbfb   qp)))
      (is (= nil (megalith/cgdae   qp)))
      (is (= nil (megalith/dadgad  qp)))
      (is (= nil (megalith/dgdgbd  qp)))
      (is (= nil (megalith/eadgbe  qp)))
      (is (= nil (megalith/fkbjdn  qp))))
    (testing "browse pagewise"
      (is (= nil (megalith/compendium))))))


