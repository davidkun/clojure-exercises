;; https://4clojure.oxal.org/#/problem/086
 
(ns ex.q086)

(defn ans
  "Problem 86, Happy numbers"
  [n]
  (letfn [(digits
            [n]
            (loop [x n coll '()]
              (if (< x 10) (conj coll x) (recur (quot x 10) (conj coll (rem x 10))))))
          (sumsq [dig] (reduce #(+ %1 (* %2 %2)) 0 dig))]
    (loop [x n seen #{}]
      (cond
        (= 1 x) true
        (contains? seen x) false
        :else (recur (sumsq (digits x)) (conj seen x))))))