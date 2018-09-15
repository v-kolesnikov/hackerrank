; https://www.hackerrank.com/challenges/s10-standard-deviation/problem

(ns hackerrank.statistics.standard-deviation)

(defn mean
  [xs n]
  (/ (reduce + xs) n))

(defn standard-deviation
  [xs n]
  (let [m (mean xs n)]
    (Math/sqrt (/ (->> xs
                       (map #(Math/pow (- % m) 2))
                       (reduce +))
                  n))))
(comment
  (def N (-> (read-line) clojure.string/trim Integer/parseInt))

  (def X
    (->> (clojure.string/split (read-line) #" ")
         (map #(Integer/parseInt %))
         (vec)))
  (println (format "%.1f" (standard-deviation X N))))
