# Template for CLJC libraries

Template for [clj-new](https://github.com/seancorfield/clj-new) aimed at creating
CLJC libraries.

Provides a workflow adapted for working in Clojure and Clojurescript at the
same time. Based around [deps](https://clojure.org/reference/deps_and_cli), the
Clojurescript parts being handled by
[Shadow-CLJS](https://github.com/thheller/shadow-cljs).

Testing is done via [Kaocha](https://github.com/lambdaisland/kaocha) on the JVM
and Shadow-CLJS for Clojurescript.

The `./extra` folder contains scripts suited for this organization (eg.
launching tests, a dev environment, ...) the user might want to copy.


## Usage

Add the following alias to your `~/.clojure/deps.edn` file with the latest SHA,
similarly to:

```clojure
{:alias
 {:new-lib-cljc
  {:extra-deps {helins-lib-cljc/clj-template {:git/url "https://github.com/helins-io/helins-lib-cljc"
                                              :sha     "5a09c4ecaaa6ae7cbc098df3789f3ed9c3128f14"}
                seancorfield/clj-new         {:mvn/version "1.1.243"}}
   :exec-args  {:template helins-lib-cljc}
   :exec-fn    clj-new/create}}}
```

Creating a new project:

```shell
$ clj -X:new-lib-cljc :name your-group/project-name
```


## License

Copyright © 2021 Adam Helinski and Contributors

Licensed under the term of the Mozilla Public License 2.0, see LICENSE.
