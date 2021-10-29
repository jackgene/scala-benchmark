package benchmark

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
class ScalaDouble {
  private val E: Double = math.E
  private val Pi: Double = math.Pi

  @Benchmark
  def add: Double = E + Pi

  @Benchmark
  def multiply: Double = E * Pi
}
