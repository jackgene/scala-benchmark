package benchmark

import java.util.concurrent.TimeUnit

import org.apache.commons.math3.util.FastMath
import org.openjdk.jmh.annotations._

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
class Maths {
  private val E = math.E
  private val Pi = math.Pi

  @Benchmark
  def scalaMathPow: Double = math.pow(E, Pi)

  @Benchmark
  def commonsFastMathPow: Double = FastMath.pow(E, Pi)
}
