;; https://4clojure.oxal.org/#/problem/062
 
(ns ex.q062)

(defn ans
  "Problem 62, Re-implement Iteration. restriction: iterate"
  [f x]
  (lazy-seq (cons x (ans f (f x)))))