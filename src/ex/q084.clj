;; https://4clojure.oxal.org/#/problem/084
 
(ns ex.q084)

(defn link? [a b] (= (second a) (first b)))
(defn link [a b] [(first a) (second b)])
(defn links
  [coll]
  (loop [start (first coll) tail (rest coll) conns (set coll)]
    (if (nil? start)
      conns
      (recur (first tail) (rest tail) (into conns (map #(link start %) (filter #(link? start %) coll)))))))

(defn ans
  "Problem 84, Transitive Closure"
  [coll]
  (loop [accum coll conns nil]
    (if (= accum conns)
      conns
      (recur (links accum) accum))))