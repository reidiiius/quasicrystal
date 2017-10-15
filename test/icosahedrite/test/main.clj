(ns icosahedrite.test.main
  (:use [icosahedrite.main :as atrium])
  (:use [clojure.test]))


(deftest main
    (testing "atrium entryway"
      (is (= nil (atrium/-main )))
      (is (= nil (atrium/-main "$")))
      (is (= nil (atrium/-main "?")))
      (is (= nil (atrium/-main "j")))
      (is (= nil (atrium/-main "jk")))
      (is (= nil (atrium/-main "k")))
      (is (= nil (atrium/-main "kj")))
      (is (= nil (atrium/-main "n")))
      (is (= nil (atrium/-main "x")))
      (is (= nil (atrium/-main "y")))
      (is (= nil (atrium/-main "n0")))
      (is (= nil (atrium/-main 'j3 'j6)))
      (is (= nil (atrium/-main 'j36 'z8)))
      (is (= nil (atrium/-main 'z8)))))


