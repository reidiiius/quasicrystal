(ns icosahedrite.test.core
  (:use [icosahedrite.core :as stelae])
  (:use [clojure.test]))


(deftest core
    (testing "data store"
      (is (= clojure.lang.PersistentHashMap (type stelae/monograph)))
      (is (= java.lang.String
        (type (stelae/monograph (last (keys stelae/monograph))))))
      (is (= 60
        (count (stelae/monograph (last (keys stelae/monograph))))))
      (is (= 83 (count stelae/monograph)))))


