# Template for CLJC libraries

## Usage

Template for [clj-new](https://github.com/seancorfield/clj-new) for creating
CLJC libraries.

Provides a workflow adapted for working in Clojure and Clojurescript at the
same time. Based around [deps](https://clojure.org/reference/deps_and_cli), the
Clojurescript parts being handled by
[Shadow-CLJS](https://github.com/thheller/shadow-cljs).

Testing is done via [Kaocha](https://github.com/lambdaisland/kaocha) on the JVM,
[Kaocha-CLJS](https://github.com/lambdaisland/kaocha-cljs) for Clojurescript on
Node, and [Chui](https://github.com/lambdaisland/chui) in the browser (with
advanced compilation if needed).

The `./extra` folder contains scripts and resources the user might want to use
(currently part of the template.

## License

Copyright © 2021 Adam Helinski and Contributors

Licensed under the term of the Mozilla Public License 2.0, see LICENSE.
