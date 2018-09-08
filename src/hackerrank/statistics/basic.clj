; https://www.hackerrank.com/challenges/s10-basic-statistics/problem

(ns hackerrank.statistics.basic)

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

(defn mode
  [xs]
  (->> xs frequencies sort reverse (apply max-key val) key))

(comment
  (println (format "%.1f" (double (mean X N))))
  (println (format "%.1f" (double (median X N))))
  (println (mode X)))
