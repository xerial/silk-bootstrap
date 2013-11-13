// Change this package name as you wish
package xerial.silk.bootstrap

// Import Silk functionality
import xerial.silk.Silk._

/**
 * An example of Silk workflow
 */
class HelloSilk {
   def hello = c"echo Hello Silk!!"

   def lineCount(f:File) = loadFile(f).lines.size
   def wordCount(f:File) = loadFile(f).lines.map(_.split("\\s+")).map(_.size).sum
}
