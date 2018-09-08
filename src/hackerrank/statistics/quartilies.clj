; https://www.hackerrank.com/challenges/s10-quartiles/problem

(ns hackerrank.statistics.quartilies)

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
  (let [middle (quot n 2)]
    (if (odd? n)
      (nth xs middle)
      (mean [(nth xs (dec middle)) (nth xs middle)] 2))))

(defn quartilies
  [xs n]
  (let [xs (sort xs)
        middle (median xs n)
        left   (take-while #(<  % middle) xs)
        right  (drop-while #(<= % middle) xs)]
    [(median left  (count left)) middle (median right (count right))]))

(comment
  (let [q (quartilies X N)]
    (println (nth q 0))
    (println (nth q 1))
    (println (nth q 2))))
