;; https://4clojure.oxal.org/#/problem/019
 
(ns ex.q019)

(defn ans
  "Problem 19, Last Element, (restriction: last)"
  [coll]
  (-> coll reverse first))