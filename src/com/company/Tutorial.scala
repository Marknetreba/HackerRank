package com.company

object Tutorial {
  def introTutorial(V: Int, arr: Array[Int]): Int = {
    arr.indexOf(V)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val V = stdin.readLine.trim.toInt

    val n = stdin.readLine.trim.toInt

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = introTutorial(V, arr)

  }
}
