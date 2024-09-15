;; https://4clojure.oxal.org/#/problem/071
 
(ns ex.q071)

(defn ans
  "Problem 71, Rearranging Code: ->"
  []
  (-> [2 5 4 1 3 6]
      reverse
      rest
      sort
      last))