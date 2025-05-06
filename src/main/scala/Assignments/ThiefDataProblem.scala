package Assignments

import scala.annotation.tailrec

object ThiefDataProblem extends App {

  val filePath = "src/main/resources/ExamData.txt"
  val path: os.Path = os.root / "usr" / "share" / "dict" / "words"
  val content: String = os.read(path)

  def getMinCount(data: String, length: Int): Unit = {
    @tailrec
    def getMin(index: Int , count: Int): Int = {
      if(index == length && data.charAt(index-1) == '0') count + 1
      else if(index == length && data.charAt(index-1) == '1') count
      else if(data.charAt(index - 1)=='0' && data.charAt(index)=='1') getMin(index+1 , count+2)
      else getMin(index+1 , count)
    }

    println(getMin(1 , 0))
  }

  val s = "111010100111000111000111001111010110011011001110"
  getMinCount(s , s.length)
}
