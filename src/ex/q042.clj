;; https://4clojure.oxal.org/#/problem/042
 
(ns ex.q042)

(defn ans
  "Problem 42, Factorial Fun. using recursion"
  [n]
  (loop [i n fac 1]
    (if (< i 2) fac (recur (dec i) (* i fac)))))

(defn ans2
  "Problem 42, Factorial Fun. using reduce"
  [n]
  (reduce * 1 (range 1 (inc n))))