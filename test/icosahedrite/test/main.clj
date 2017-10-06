(ns icosahedrite.test.main
  (:use [icosahedrite.main :as khatyrkite])
  (:use [clojure.test]))


(deftest main
    (testing "main"
      (is (= nil (khatyrkite/-main )))
      (is (= nil (khatyrkite/-main "?")))
      (is (= nil (khatyrkite/-main "n0")))))


