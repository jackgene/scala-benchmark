package benchmark

import java.util.concurrent.TimeUnit

import org.apache.commons.math3.util.FastMath
import org.openjdk.jmh.annotations._

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
class CommonsFastMath {
  private val E = math.E
  private val Pi = math.Pi

  @Benchmark
  def abs: Double = FastMath.abs(E)

  @Benchmark
  def acos: Double = FastMath.acos(E)

  @Benchmark
  def asin: Double = FastMath.asin(E)

  @Benchmark
  def atan: Double = FastMath.atan(E)

  @Benchmark
  def atan2: Double = FastMath.atan2(E, Pi)

  @Benchmark
  def cbrt: Double = FastMath.cbrt(E)

  @Benchmark
  def ceil: Double = FastMath.ceil(E)

  @Benchmark
  def cos: Double = FastMath.cos(E)

  @Benchmark
  def cosh: Double = FastMath.cosh(E)

  @Benchmark
  def exp: Double = FastMath.exp(E)

  @Benchmark
  def floor: Double = FastMath.floor(E)

  @Benchmark
  def hypot: Double = FastMath.hypot(E, Pi)

  @Benchmark
  def log: Double = FastMath.log(E)

  @Benchmark
  def max: Double = FastMath.max(E, Pi)

  @Benchmark
  def min: Double = FastMath.min(E, Pi)

  @Benchmark
  def pow: Double = FastMath.pow(E, Pi)

  @Benchmark
  def round: Double = FastMath.round(E)

  @Benchmark
  def sin: Double = FastMath.sin(E)

  @Benchmark
  def sinh: Double = FastMath.sinh(E)

  @Benchmark
  def sqrt: Double = FastMath.sqrt(E)

  @Benchmark
  def tan: Double = FastMath.tan(E)

  @Benchmark
  def tanh: Double = FastMath.tanh(E)

  @Benchmark
  def toRadians: Double = FastMath.toDegrees(Pi)
}
