(ns doo-repro.a-sample-test
 (:require
   [cljs.test :refer-macros [deftest testing async]]))

(deftest sample
  (testing "A test that never completes"
    (async done)))