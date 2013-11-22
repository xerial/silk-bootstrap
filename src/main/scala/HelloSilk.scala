// Change this package name as you wish
package xerial.silk.bootstrap

// Import Silk functionality
import xerial.lens.cui.{command, option}
import xerial.silk.{Silk, SilkEnv}
import xerial.core.log.Logger
import scala.util.Random
import xerial.silk.weaver.RangePartitioner

case class Person(id:Int, name:String) {
  def toTSV : String = s"$id\t$name"
}

object Person {
  implicit object PersonOrdering extends Ordering[Person] {
    def compare(x: Person, y: Person) = {
      val diff = x.id - y.id
      if(diff != 0)
        diff
      else
        x.name.compareTo(y.name)
    }
  }

  def randomName = {
    val s = new StringBuilder
    for(i <- 0 to 3 +Random.nextInt(7)) s.append(('a' + Random.nextInt(25)).toChar)
    s.result
  }
}

class Sort(env:SilkEnv) extends Logger {

  implicit val e = env

  @command(description = "Sort objects")
  def objectSort(@option(prefix = "-N", description = "num entries")
                 N: Int = 1000 * 1000,
                 @option(prefix = "-m", description = "num mappers")
                 M: Int = 20,
                 @option(prefix = "-r", description = "num reducers")
                 R: Int = 10,
                 forceEval : Boolean = true) = {

    // Create a random Int sequence
    info("Preparing random data")

    // Block size
    val B = (N.toDouble / M).ceil.toInt

    info(f"N=$N%,d, B=$B%,d, M=$M")
    val seed = Silk.scatter((0 until M).toIndexedSeq, M)
    val seedf = if(forceEval) seed.forceEval else seed

    val input = seedf.fMap{s =>
      val numElems = if(s == (M-1) && (N % B != 0)) N % B else B
      (0 until numElems).map(x => new Person(Random.nextInt(N), Person.randomName))
    }
    val sorted = input.sorted(new RangePartitioner(R, input))
    sorted.size
  }

}


