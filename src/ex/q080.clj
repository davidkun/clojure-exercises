;; https://4clojure.oxal.org/#/problem/080
 
(ns ex.q080)

(defn ans
  "Problem 80, Perfect Numbers"
  [x]
  (letfn [(divisors [y] (->> (range 1 y) (filter #(zero? (mod y %)))))]
    (= x (apply + (divisors x)))))