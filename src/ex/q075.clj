;; https://4clojure.oxal.org/#/problem/075
 
(ns ex.q075)

(defn ans
  "Problem 75, Euler's Totient Function"
  [x]
  (letfn [(gcd [x y]
            (loop [x x y y]
              (if (= x y) x (recur (- (max x y) (min x y)) (min x y)))))
          (coprime? [x y] (= 1 (gcd x y)))
          (coprimes [y] (filter #(coprime? y %) (range 1 y)))]
    (if (< x 2) 1 (count (coprimes x)))))