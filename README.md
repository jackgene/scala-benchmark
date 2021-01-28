## Running the benchmark
```
#export JAVA_HOME=(JVM to benchmark with)
./sbt clean jmh:clean "jmh:run -i 10 -wi 10 -f1 -t1"
```
