package Assignments

import java.io.File
import scala.io.Source

object ExamDataProblem extends App {
  val filePath = "src/main/resources/ExamData.txt"
  val file = new File(filePath)

  val scalaFileContents = Source.fromFile(file).getLines()
  scalaFileContents.foreach(x => isCompletable(x))

  def isCompletable (data: String): Unit = {
    val k = data.split(", ")
    println(if (k(0).toInt * k(1).toInt <= k(2).toInt) "YES" else "NO")
  }
}
