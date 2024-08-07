;; https://4clojure.oxal.org/#/problem/040
 
(ns ex.q040)

(defn ans
  "Problem 40, Interpose a Seq. restriction: interpose"
  [val coll]
  (pop (reduce #(conj %1 %2 val) [] coll)))