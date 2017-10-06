(ns icosahedrite.test.core
  (:use [icosahedrite.core :as stelae])
  (:use [clojure.test]))


(deftest core
    (testing "monograph"
      (is (= 83 (count stelae/monograph)))))


