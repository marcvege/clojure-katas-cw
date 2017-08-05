(ns multiples.multiples-test
  (:require [clojure.test :refer :all]
            [multiples.multiples :refer [solution]]))

(deftest test-multiples-of-3-and-5
  (is (= 23 (solution 10))))

(deftest test-multiples-of-3-and-5
  (is (= 0 (solution 0))))

(deftest test-multiples-of-3-and-5
  (is (= 0 (solution 1))))

(deftest test-multiples-of-3-and-5
  (is (= 0 (solution 2))))

(deftest test-multiples-of-3-and-5
  (is (= 0 (solution 3))))

(deftest test-multiples-of-3-and-5
  (is (= 3 (solution 4))))

(deftest test-multiples-of-3-and-5
  (is (= 3 (solution 5))))

(deftest test-multiples-of-3-and-5
  (is (= 8 (solution 6))))