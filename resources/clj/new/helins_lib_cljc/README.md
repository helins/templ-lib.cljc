# {{ group }}/{{ name }}

[![Clojars](https://img.shields.io/clojars/v/{{ group }}/{{ artifact }}.svg)](https://clojars.org/{{ group }}/{{ artifact }})

[![Cljdoc](https://cljdoc.org/badge/{{ group }}/{{ artifact }})](https://cljdoc.org/d/{{ group }}/{{ artifact }})

Making dreams come true.


## Usage

Coming soon.


## Running tests

Depending on hardware, tests usually takes a few minutes to run.

On the JVM, using [Kaocha](https://github.com/lambdaisland/kaocha):

```bash
$ ./bin/test/jvm/run
```
On NodeJS, using [Shadow-CLJS](https://github.com/thheller/shadow-cljs):

```bash
$ ./bin/test/node/run

# Or testing an advanced build:
$ ./bin/test/node/advanced
```


## Development

Starting in Clojure JVM mode, mentioning an additional Deps alias (here, a local
setup of NREPL):
```bash
$ ./bin/dev/clojure :nrepl
```

Starting in CLJS mode using [Shadow-CLJS](https://github.com/thheller/shadow-cljs):
```bash
$ ./bin/dev/cljs
# Then open ./cljs/index.html
```


## License

Copyright © {{ year }} {{ developer }}

Licensed under the term of the Mozilla Public License 2.0, see LICENSE.
