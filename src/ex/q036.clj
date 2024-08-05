;; https://4clojure.oxal.org/#/problem/036
 
(ns ex.q036)

(defn ans
  "Problem 36, Let it Be"
  []
  (let [x 7, y 3, z 1]
    [(+ x y) (+ y z) z]))