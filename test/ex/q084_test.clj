;; https://4clojure.oxal.org/#/problem/084
 
(ns ex.q084-test
  (:require [clojure.test :as t]
            [ex.q084 :as sut]))

(t/deftest test-q84
  (t/testing "Problem 84, Transitive Closure"
    (t/is (= #{[4 2] [8 4] [8 2] [9 3] [27 9] [27 3]}
             (sut/ans #{[8 4] [9 3] [4 2] [27 9]})))
    (t/is (= #{["cat" "man"] ["cat" "snake"] ["man" "snake"]
               ["spider" "cat"] ["spider" "man"] ["spider" "snake"]}
             (sut/ans #{["cat" "man"] ["man" "snake"] ["spider" "cat"]})))
    (t/is (= #{["father" "son"] ["father" "grandson"]
               ["uncle" "cousin"] ["son" "grandson"]}
             (sut/ans #{["father" "son"] ["uncle" "cousin"] ["son" "grandson"]})))))