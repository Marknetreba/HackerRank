package com.company

import scala.collection.mutable.{ListBuffer, Queue}

object Rotation {

  def circularArrayRotation(a: Array[Int], k: Int, queries: Array[Int]): Array[Int] = {

    var arr = new ListBuffer[Int]
    val size = a.length
    val (first, last) = a.splitAt(size - (k % size))
    val sum = last ++ first
    for (x <- queries) {
      arr.append(sum(x))
    }

    arr.toArray

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val nkq = stdin.readLine.split(" ")

    val n = nkq(0).trim.toInt

    val k = nkq(1).trim.toInt

    val q = nkq(2).trim.toInt

    val a: Array[Int] = stdin.readLine.split(" ").map(_.trim.toInt)

    val queries = Array.ofDim[Int](q)

    for (i <- 0 until q) {
      val queriesItem = stdin.readLine.trim.toInt
      queries(i) = queriesItem}

    val result = circularArrayRotation(a, k, queries)

  }

}
