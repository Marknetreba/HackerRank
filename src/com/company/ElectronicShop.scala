package com.company

import scala.collection.mutable.ListBuffer

object ElectronicShop {

  def getMoneySpent(keyboards: Array[Int], drives: Array[Int], b: Int): Int = {
    /*
     * Write your code here.
     */

    var res = new ListBuffer[Int]()

    keyboards.foreach(k => {
      drives.map(i => b-(i+k)).sorted.map(x => res+=x)
    })

    res = res.filter(x => x>=0).sorted

    if (res.nonEmpty) b-res.head else -1
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val bnm = stdin.readLine.split(" ")

    val b = bnm(0).trim.toInt

    val n = bnm(1).trim.toInt

    val m = bnm(2).trim.toInt

    val keyboards = stdin.readLine.split(" ").map(_.trim.toInt)

    val drives = stdin.readLine.split(" ").map(_.trim.toInt)
    /*
     * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
     */

    val moneySpent = getMoneySpent(keyboards, drives, b)

  }

}
