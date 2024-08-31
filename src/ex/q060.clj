;; https://4clojure.oxal.org/#/problem/060
;; Write a function which behaves like reduce, but returns
;; each intermediate value of the reduction. Your function
;; must accept either two or three arguments, and the return
;; sequence must be lazy.

(ns ex.q060)

(defn ans
  "Problem 60, Sequence Reductions. restriction: reductions"
  ([f coll]
   (lazy-seq
    (if-let [s (seq coll)]
      (ans f (first s) (rest s))
      (list (f)))))
  ([f val coll]
   (cons val
         (lazy-seq
          (when-let [s (seq coll)]
            (ans f (f val (first s)) (rest s)))))))