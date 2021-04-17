;; This Source Code Form is subject to the terms of the Mozilla Public
;; License, v. 2.0. If a copy of the MPL was not distributed with this
;; file, You can obtain one at https://mozilla.org/MPL/2.0/.


(ns clj.new.helins-lib-cljc
  
  "Template."

  {:author "Adam Helinski"}

  (:require [clojure.java.io]
            [clj.new.templates]))


;;;;;;;;;;


(defn helins-lib-cljc

  ""

  [project-name]

  (let [data   (clj.new.templates/project-data project-name)
        name   "helins-lib-cljc"
        raw    (clj.new.templates/raw-resourcer name)
        render (clj.new.templates/renderer name)]
    (println "Generating new CLJC library")
    (clj.new.templates/->files data
                               [".gitignore"
                                (raw ".gitignore")]
                               ["CHANGELOG.md"
                                (render "CHANGELOG.md"
                                        data)]
                               ["cljs/index.html"
                                (raw "cljs/index.html")]
                               ["deps.edn"
                                (render "deps.edn"
                                        data)]
                               ["kaocha.edn"
                                (raw "kaocha.edn")]
                               ["LICENSE"
                                (raw "LICENSE")]
                               ["pom.xml"
                                (render "pom.xml"
                                        data)]
                               ["shadow-cljs.edn"
                                (render "shadow-cljs.edn"
                                        data)]
                               ["src/dev/user.clj"
                                (render "src/dev/user.clj"
                                        data)]
                               ["src/dev/{{ group }}/{{ name }}/dev.cljc"
                                (render "src/dev/dev.cljc"
                                        data)]
                               ["src/main/{{ group }}/{{ name }}.cljc"
                                (render "src/main/core.cljc"
                                        data)]
                               ["src/test/{{ group }}/{{ name }}/test.cljc"
                                (render "src/test/test.cljc"
                                        data)]
                               ["README.md"
                                (render "README.md"
                                        data)])))
