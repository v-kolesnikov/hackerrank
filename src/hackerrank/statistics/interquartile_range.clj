; https://www.hackerrank.com/challenges/s10-basic-statistics/problem

(ns hackerrank.statistics.interquartile-range)

(comment
  (def N (-> (read-line) clojure.string/trim Integer/parseInt))

  (def X
    (->> (clojure.string/split (read-line) #" ")
         (map #(Integer/parseInt %))
         (vec)))

  (def F
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

(defn quartilies
  [xs n]
  (let [xs (sort xs)
        mid (quot n 2)
        left (take mid xs)
        right (take-last mid xs)]
    [(median left (count left))
     (median xs n)
     (median right (count right))]))

(defn frequencies->list
  [xs freqs]
  (vec (mapcat repeat freqs xs)))

(defn interquartile-range
  [xs]
  (let [[q1 _ q3] (quartilies xs (count xs))]
    (- q3 q1)))

(comment
  (println (interquartile-range (frequencies->list X F))))
