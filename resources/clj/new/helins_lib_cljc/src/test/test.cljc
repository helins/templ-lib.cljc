;; This Source Code Form is subject to the terms of the Mozilla Public
;; License, v. 2.0. If a copy of the MPL was not distributed with this
;; file, You can obtain one at https://mozilla.org/MPL/2.0/.


(ns {{ group }}.{{ name }}.test

  "Testing core features."

  {:author "{{ developer }}"}

  (:require [clojure.test           :as t]
            [{{ group }}.{{ name }} :as {{ name }}]))


;;;;;;;;;;


(t/deftest main

  (t/is (true? true)))
