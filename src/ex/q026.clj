;; https://4clojure.oxal.org/#/problem/026
 
(ns ex.q026)

(defn -penultimate
  "Return penultimate element or 0 if not enough elements"
  [coll]
  (if (> (count coll) 1)
    (->> coll reverse second)
    0))

(defn ans
  "Problem 26, Fibonacci Sequence"
  [n]
  (loop [cnt 1 fib [1]]
    (if (>= cnt n)
      fib
      (recur (inc cnt) (conj fib (+ (last fib) (-penultimate fib)))))))