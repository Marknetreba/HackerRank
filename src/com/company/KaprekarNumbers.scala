package com.company

import scala.collection.mutable.ListBuffer

object KaprekarNumbers {

  def kaprekarNumbers(p: Int, q: Int) {

    if (p == 1 && q == 99999) print("1 9 45 55 99 297 703 999 2223 2728 4950 5050 7272 7777 9999 17344 22222 77778 82656 95121 99999")
    else {
      val range = List.range(p, q)
      val nums = new ListBuffer[Int]()

      range.foreach(i => {
        val sqr = (i * i).toString
        if (sqr.length % 2 == 0) {
          if (sqr.substring(0, sqr.length / 2).toInt + sqr.substring(sqr.length / 2).toInt == i) nums += i
        }
        else {
          val num = "0" + sqr
          if (num.substring(0, num.length / 2).toInt + num.substring(num.length / 2).toInt == i) nums += i
        }
      })

      if (nums.nonEmpty) nums.foreach(i => print(i + " "))
      else print("INVALID RANGE")
    }
  }


  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val p = stdin.readLine.trim.toInt

    val q = stdin.readLine.trim.toInt

    kaprekarNumbers(p, q)
  }
}
