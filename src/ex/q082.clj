;; https://4clojure.oxal.org/#/problem/082
 
(ns ex.q082)

(defn ans
  "Problem 82, Word Chains"
  [words]
  (letfn [(tail [w] (->> w rest (apply str)))
          (lev
            [a b]
            (cond
              (= 0 (count b)) (count a)
              (= 0 (count a)) (count b)
              (= (first a) (first b)) (lev (tail a) (tail b))
              :else (+ 1 (min (lev (tail a) b) (lev a (tail b)) (lev (tail a) (tail b))))))
          (link? [a b] (<= (lev a b) 1))
          (chain
            [[word :as curr-chain] remaining]
            (if (empty? remaining)
              [curr-chain]
              (apply concat (keep #(when (or (nil? word) (link? word %))
                                     (chain (cons % curr-chain) (disj remaining %))) remaining))))]
    (boolean (some #(= % words) (map set (chain () words))))))