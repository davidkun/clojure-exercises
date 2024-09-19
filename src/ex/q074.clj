;; https://4clojure.oxal.org/#/problem/074

(ns ex.q074)

(defn ans
  "Problem 74, Filter Perfect Squares"
  [s]
  (letfn [(square? [x]
            (cond
              (< x 1) false
              (let [y (int (Math/sqrt x))] (= (* y y) x)) true))]
    (->> s
         (re-seq #"\d+")
         (map #(Integer/parseInt %))
         (filter square?)
         (interpose ",")
         (apply str))))