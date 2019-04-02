package com.company

object ChocolateFeast {

  // Complete the chocolateFeast function below.
  def chocolateFeast(n: Int, c: Int, m: Int): Int = {

    var wrappers = n/c
    var chocos = wrappers

    while(wrappers >= m) {
      wrappers -= m
      wrappers += 1
      chocos += 1
    }

    chocos
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val t = stdin.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val ncm = stdin.readLine.split(" ")

      val n = ncm(0).trim.toInt

      val c = ncm(1).trim.toInt

      val m = ncm(2).trim.toInt

      val result = chocolateFeast(n, c, m)

    }
  }

}
