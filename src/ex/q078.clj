;; https://4clojure.oxal.org/#/problem/078
 
(ns ex.q078)

(defn ans
  "Problem 78, Reimplement Trampoline"
  [f & xs]
  (loop [fn-or-val (apply f xs)]
    (if (fn? fn-or-val) (recur (fn-or-val)) fn-or-val)))