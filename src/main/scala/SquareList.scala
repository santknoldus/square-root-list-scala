package com.knoldus.squarelist

import scala.annotation.tailrec
import scala.util.Try

class SquareList {

  //using map function
  def squareOfListUsingMap(list: List[Int]): Try[List[Int]] = Try {
    list.map(number => if (number >= 0) Math.sqrt(number).toInt else throw new IllegalArgumentException())
  }

  //using tail recursion
  def squareOfListUsingRecursion(list: List[Int]): Try[List[Int]] = Try {
    @tailrec
    def helper(accumulator: List[Int], list: List[Int]): List[Int] = list match {
      case Nil => accumulator
      case head :: tail if (head >= 0) => helper(accumulator :+ Math.sqrt(head).toInt, tail)
      case _ => throw new IllegalArgumentException()
    }

    helper(List(), list)
  }
}