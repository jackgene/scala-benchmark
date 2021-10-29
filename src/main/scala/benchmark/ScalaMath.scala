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
  def acos: Double = math.acos(E)

  @Benchmark
  def asin: Double = math.asin(E)

  @Benchmark
  def atan: Double = math.atan(E)

  @Benchmark
  def atan2: Double = math.atan2(E, Pi)

  @Benchmark
  def cbrt: Double = math.cbrt(E)

  @Benchmark
  def ceil: Double = math.ceil(E)

  @Benchmark
  def cos: Double = math.cos(E)

  @Benchmark
  def cosh: Double = math.cosh(E)

  @Benchmark
  def exp: Double = math.exp(E)

  @Benchmark
  def floor: Double = math.floor(E)

  @Benchmark
  def hypot: Double = math.hypot(E, Pi)

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
  def sin: Double = math.sin(E)

  @Benchmark
  def sinh: Double = math.sinh(E)

  @Benchmark
  def sqrt: Double = math.sqrt(E)

  @Benchmark
  def tan: Double = math.tan(E)

  @Benchmark
  def tanh: Double = math.tanh(E)

  @Benchmark
  def toRadians: Double = math.toDegrees(Pi)
}
