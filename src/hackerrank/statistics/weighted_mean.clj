; https://www.hackerrank.com/challenges/s10-weighted-mean/problem

(ns hackerrank.statistics.weighted-mean)

(comment
  (def N (-> (read-line) clojure.string/trim Integer/parseInt))

  (def X
    (->> (clojure.string/split (read-line) #" ")
         (map #(Integer/parseInt %))
         (vec)))

  (def W
    (->> (clojure.string/split (read-line) #" ")
         (map #(Integer/parseInt %))
         (vec))))

(defn weighted-mean
  [values weights]
  (/ (reduce + (map * values weights))
     (reduce + weights)))

(comment
  (println (format "%.1f" (float (weighted-mean X W)))))
