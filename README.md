# Clojure Exercises

A place to keep track of problems/solutions in Clojure.

The problems are from the [4clojure](https://4clojure.oxal.org).

## Workflow

1. Get [`just`](https://github.com/casey/just) (`brew install just`)
2. Run tests continuously in `--watch` mode
    ```bash
    $ just watch
    ```
3. Write empty solution method :arrow_right: write the test(s) :arrow_right: implement solution :repeat:
    ```bash
    # e.g. create q017.clj and q017_test.clj
    $ just create 017
    ```

### Linting / formatting

```bash
# lint code
$ just lint

# format code
$ just format
```

## TODO

- [ ] Lint with [babashka](https://babashka.org) for quicker startup time?
