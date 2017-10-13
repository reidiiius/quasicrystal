(ns icosahedrite.test.main
  (:use [icosahedrite.main :as atrium])
  (:use [clojure.test]))


(deftest main
    (testing "main"
      (is (= nil (atrium/-main )))
      (is (= nil (atrium/-main "$")))
      (is (= nil (atrium/-main "?")))
      (is (= nil (atrium/-main "n0")))
      (is (= nil (atrium/-main 'j3 'j6)))
      (is (= nil (atrium/-main 'j36 'z8)))
      (is (= nil (atrium/-main 'z8)))))


