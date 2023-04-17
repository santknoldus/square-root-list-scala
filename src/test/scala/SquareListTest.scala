package com.knoldus.squarelist

import org.scalatest.funsuite.AnyFunSuite
import scala.util.Success

class SquareListTest extends AnyFunSuite {

  val squareRootList = new SquareList

  test("squareOfListUsingMap should return square-root of all element in list") {
    val list = List(4, 16, 25, 36)
    val expectedList = Success(List(2, 4, 5, 6))
    assert(squareRootList.squareOfListUsingMap(list) === expectedList)
  }

  test("squareOfListUsingMap should be failed") {
    val list = List(4, -1)
    assert(squareRootList.squareOfListUsingMap(list).isFailure)
  }

  test("squareOfListUsingRecursion should return square-root of all element in list") {
    val list = List(4, 16, 25, 36)
    val expectedList = Success(List(2, 4, 5, 6))
    assert(squareRootList.squareOfListUsingRecursion(list) === expectedList)
  }

  test("squareOfListUsingRecursion should be failed") {
    val list = List(4, -1)
    assert(squareRootList.squareOfListUsingRecursion(list).isFailure)
  }
}