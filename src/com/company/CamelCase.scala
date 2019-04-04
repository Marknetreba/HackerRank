package com.company

object CamelCase {

  def camelcase(s: String): Int = {

    s.split("[A-Z]").toSeq.size
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val s = stdin.readLine

    val result = camelcase(s)
  }

}
