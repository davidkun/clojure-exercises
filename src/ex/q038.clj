;; https://4clojure.oxal.org/#/problem/038
 
(ns ex.q038)

(defn ans
  "Problem 38, Maximum value. (restriction: max,max-key)"
  [& args]
  (reduce #(if (> %1 %2) %1 %2) args))