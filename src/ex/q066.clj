;; https://4clojure.oxal.org/#/problem/066
 
(ns ex.q066)

(defn ans
  "Problem 66, Greatest Common Divisor"
  [x y]
  (some #(when (= 0 (rem x %) (rem y %)) %) (range (min x y) 0 -1)))

(defn ans2
  "Problem 66, using Euclid's algorithm,
  https://en.wikipedia.org/wiki/Greatest_common_divisor#Euclid's_algorithm"
  [x y]
  (loop [x x y y]
    (if (= x y) x (recur (- (max x y) (min x y)) (min x y)))))