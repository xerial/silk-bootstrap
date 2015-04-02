// Change this package name as you wish
package xerial.silk.bootstrap

// Import Silk functionality
import xerial.silk.Silk._

class SampleWorkflow {

  def files = c"ls file".lines

  def wc(f:String) = c"wc -l ${f}".lines.head

  def main = files.map(wc)
}


