(ns doo-repro.doo-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [doo-repro.a-sample-test]))

(doo-tests 'doo-repro.a-sample-test)
