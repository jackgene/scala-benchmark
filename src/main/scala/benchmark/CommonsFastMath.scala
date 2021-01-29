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
  def asin: Double = FastMath.asin(E)

  @Benchmark
  def cbrt: Double = FastMath.cbrt(E)

  @Benchmark
  def ceil: Double = FastMath.ceil(E)

  @Benchmark
  def exp: Double = FastMath.exp(E)

  @Benchmark
  def floor: Double = FastMath.floor(E)

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
  def sqrt: Double = FastMath.sqrt(E)

  @Benchmark
  def toRadians: Double = FastMath.toDegrees(Pi)
}
