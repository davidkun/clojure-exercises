;; https://4clojure.oxal.org/#/problem/058
 
(ns ex.q058)

(defn ans
  "Problem 58, Function Composition. restrictions: comp"
  ([] identity)
  ([f] f)
  ([f g]
   (fn
     ([] (f (g)))
     ([x] (f (g x)))
     ([x y] (f (g x y)))
     ([x y & args] (f (apply g x y args)))))
  ([f g & fs]
   (apply ans (ans f g) fs)))