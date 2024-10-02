;; https://4clojure.oxal.org/#/problem/079
 
(ns ex.q079)

(defn ans
  "Problem 79, Triangle Minimal Path"
  ([coll]
   (ans coll 0))
  ([coll idx]
   (let [curr (nth (first coll) idx)
         next-rows (rest coll)]
     (if (empty? next-rows)
       curr
       (let [left (ans next-rows idx)
             right (ans next-rows (inc idx))]
         (+ curr (min left right)))))))