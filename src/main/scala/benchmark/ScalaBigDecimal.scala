package benchmark

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
class ScalaBigDecimal {
  private val E: BigDecimal = math.E
  private val Pi: BigDecimal = math.Pi

  @Benchmark
  def add: BigDecimal = E + Pi

  @Benchmark
  def multiply: BigDecimal = E * Pi
}
