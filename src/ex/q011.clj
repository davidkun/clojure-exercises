;; https://4clojure.oxal.org/#/problem/011
 
(ns ex.q011)

(defn ans
  "Problem 11, conj on maps"
  []
  (conj {:a 1} {:b 2} [:c 3]))