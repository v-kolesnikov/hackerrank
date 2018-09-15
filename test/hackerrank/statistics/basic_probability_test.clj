(ns hackerrank.statistics.basic-probability-test
  (:require [clojure.test :refer :all]
            [hackerrank.statistics.basic-probability :refer :all]))

(deftest probability-of-sum-at-most-test
  (is (= 5/6 (probability-of-sum-at-most 9))))

(deftest probability-of-difference-with-sum-test
  (is (= 1/9 (probability-of-difference-with-sum 6))))
