;; https://4clojure.oxal.org/#/problem/067
 
(ns ex.q067)

(defn ans
  "Problem 67, Prime Numbers"
  [y]
  (letfn [(prime? [x]
            (cond
              (< x 2) false
              (= x 2) true
              (even? x) false
              :else (not-any? zero? (map #(mod x %) (range 3 (inc (Math/sqrt x)) 2)))))]
    (take y (filter prime? (range)))))