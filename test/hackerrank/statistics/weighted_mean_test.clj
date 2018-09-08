(ns hackerrank.statistics.weighted-mean-test
  (:require [clojure.test :refer :all]
            [hackerrank.statistics.weighted-mean :refer :all]))

(deftest weighted-mean-test
  (let [X [10 40 30 50 20]
        W [1 2 3 4 5]]
    (is (= 32.0 (double (weighted-mean X W))))))
