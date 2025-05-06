package Assignments

import java.io.File
import scala.annotation.tailrec
import scala.io.Source
import scala.math.BigInt

object CoreDigit extends App {
  def generateCoreDigit(data: String): Int = {
    @tailrec
    def generateCore(number: String, index: Int, acc: BigInt): Int = {
      if(number.length == 1) Integer.parseInt(number)
      else if (index < 0) generateCore(acc.toString() , acc.toString().length -1 , BigInt(0))
      else generateCore(number, index - 1 , acc + number.charAt(index).asDigit)
    }

    generateCore(data, data.length - 1, BigInt(0))
  }

  def generateNumber(num: String): BigInt = {
    @tailrec
    def generate(number: String, index: Int, acc: BigInt): BigInt = {
      if (index < 0) acc
      else generate(number, index - 1, acc + number.charAt(index).asDigit)
    }

    generate(num, num.length - 1, BigInt(0))
  }
  //println(generateNumber("99999999998"))


  val filePath = "src/main/resources/CoreData.txt"
  val file = new File(filePath)

  val scalaFileContents = Source.fromFile(file).getLines()
  var data = scalaFileContents.next()
  //var data = "9785 2"
  var Number = (generateNumber(data.split(" ")(0)) * Integer.parseInt(data.split(" ")(1))).toString
  println(generateCoreDigit(Number.toString))

}
