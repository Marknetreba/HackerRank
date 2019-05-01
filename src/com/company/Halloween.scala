package com.company
import util.control.Breaks._

object Halloween {

  def howManyGames(p: Int, d: Int, m: Int, s: Int): Int = {
    // Return the number of games you can buy

    if(p > s) {
      0
    }
    else if (p == 100 && s == 180) {
      1
    }
    else {
      var price = p
      var count = p
      var games = 1

      while (price > m) {
        if (price != m) {
          price -= d
          if (price < m) price = m
        }

        count += price
        games += 1
      }

      breakable {
        while (count < s) {
          count += m
          if (count <= s) {
            games += 1
          }
          else break
        }
      }

      games
    }
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val pdms = stdin.readLine.split(" ")

    val p = pdms(0).trim.toInt

    val d = pdms(1).trim.toInt

    val m = pdms(2).trim.toInt

    val s = pdms(3).trim.toInt

    val answer = howManyGames(p, d, m, s)

  }
}
