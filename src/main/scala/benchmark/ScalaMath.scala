package benchmark

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
class ScalaMath {
  private val E = math.E
  private val Pi = math.Pi

  @Benchmark
  def abs: Double = math.abs(E)

  @Benchmark
  def asin: Double = math.asin(E)

  @Benchmark
  def cbrt: Double = math.cbrt(E)

  @Benchmark
  def ceil: Double = math.ceil(E)

  @Benchmark
  def exp: Double = math.exp(E)

  @Benchmark
  def floor: Double = math.floor(E)

  @Benchmark
  def log: Double = math.log(E)

  @Benchmark
  def max: Double = math.max(E, Pi)

  @Benchmark
  def min: Double = math.min(E, Pi)

  @Benchmark
  def pow: Double = math.pow(E, Pi)

  @Benchmark
  def round: Double = math.round(E)

  @Benchmark
  def sqrt: Double = math.sqrt(E)

  @Benchmark
  def toRadians: Double = math.toDegrees(Pi)
}
