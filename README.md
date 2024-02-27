# bazel-java-header-compilation-bug

Compile with bazel (failure):

```sh
bazel build //example/consumer
```

```
example/consumer/src/main/java/com/example/consumer/Consumer.java:8: error: getUser() in ActualUser cannot override getUser() in User
    public Pair<String, String> getUser() {
                                ^
  return type com.example.library2.Pair<String,String> is not compatible with com.example.library1.Pair<String,String>
example/consumer/src/main/java/com/example/consumer/Consumer.java:7: error: method does not override or implement a method from a supertype
    @Override
    ^
Target //example/consumer:consumer failed to build
```

Compile with bazel (workaround):

```sh
bazel build //example/consumer --nojava_header_compilation
```
