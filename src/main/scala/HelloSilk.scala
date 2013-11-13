// Change this package name as you wish
package xerial.silk.bootstrap

// Import Silk functionality
import xerial.silk.Silk._
import java.io.File

/**
 * An example of Silk workflow
 */
class HelloSilk {
   def hello = c"echo Hello Silk!!"

   def lineCount(file:String) = loadFile(file).lines.size
   def wordCount(file:String) = loadFile(file).lines.map(_.split("\\s+")).map(_.size).sum
}
