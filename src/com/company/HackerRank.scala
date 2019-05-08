package com.company

object HackerRank {
  def hackerrankInString(s: String): String = {


    val h = "hackerrank"
    var count = 0

    for(i <- 0 until s.length) {
      if(count<10) {
        if (h(count) == s(i)) {
          count += 1
        }
      }
    }

    if (count==10) "YES" else "NO"
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn


    val q = stdin.readLine.trim.toInt

    for (qItr <- 1 to q) {
      val s = stdin.readLine

      val result = hackerrankInString(s)
      println(result)
    }

  }
}
