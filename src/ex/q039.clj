;; https://4clojure.oxal.org/#/problem/039
 
(ns ex.q039)

(defn ans
  "Problem 39, Interleave Two Seqs. restriction: interleave"
  [coll1 coll2]
  (let [c1 (seq coll1) c2 (seq coll2)]
    (if (and c1 c2)
      (cons (first c1) (cons (first c2) (ans (rest c1) (rest c2))))
      [])))