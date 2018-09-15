; https://www.hackerrank.com/challenges/s10-standard-deviation/problem

(ns hackerrank.statistics.standard-deviation)

(defn mean
  [xs n]
  (/ (reduce + xs) n))

(defn standard-deviation
  [xs n]
  (let [mean-value (mean xs n)
        variance (->> xs
                      (map #(Math/pow (- % mean-value) 2))
                      (reduce +))]
    (Math/sqrt (/ variance n))))

(comment
  (def N (-> (read-line) clojure.string/trim Integer/parseInt))

  (def X
    (->> (clojure.string/split (read-line) #" ")
         (map #(Integer/parseInt %))
         (vec)))

  (println (format "%.1f" (standard-deviation X N))))
