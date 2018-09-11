; https://www.hackerrank.com/challenges/s10-quartiles/problem

(ns hackerrank.statistics.quartiles)

(comment
  (def N (-> (read-line) clojure.string/trim Integer/parseInt))

  (def X
    (->> (clojure.string/split (read-line) #" ")
         (map #(Integer/parseInt %))
         (vec))))

(defn mean
  [xs n]
  (/ (reduce + xs) n))

(defn median
  [xs n]
  (let [xs (sort xs)
        middle (quot n 2)]
    (if (odd? n)
      (nth xs middle)
      (mean [(nth xs (dec middle)) (nth xs middle)] 2))))

(defn quartiles
  [xs n]
  (let [xs (sort xs)
        mid (quot n 2)
        left (take mid xs)
        right (take-last mid xs)]
    [(median left (count left))
     (median xs n)
     (median right (count right))]))

(comment
  (let [q (quartiles X N)]
    (println (nth q 0))
    (println (nth q 1))
    (println (nth q 2))))
