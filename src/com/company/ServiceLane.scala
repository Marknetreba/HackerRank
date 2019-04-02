package com.company

import scala.collection.mutable.ListBuffer

object ServiceLane {

  // Complete the serviceLane function below.
  def serviceLane(n: Int, cases: Array[Array[Int]], width: Array[Int]): Array[Int] = {
    val ans = new ListBuffer[Int]()

    cases.foreach(x => {
      val size = x.toSeq
      val min = width.toList.slice(size.head,size(1)+1).min
      ans += min
    })

    ans.toArray
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val nt = stdin.readLine.split(" ")

    val n = nt(0).trim.toInt

    val t = nt(1).trim.toInt

    val width = stdin.readLine.split(" ").map(_.trim.toInt)

    val cases = Array.ofDim[Int](t, 2)

    for (i <- 0 until t) {
      cases(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }

    val result = serviceLane(n, cases, width)

  }

}
