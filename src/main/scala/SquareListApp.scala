package com.knoldus.squarelist

object SquareListApp extends App {

  val list = List(4, 16, 25, 36)

  private val squareList = new SquareList
  private val resultUsingMapFun = squareList.squareOfListUsingMap(list)
  private val resultUsingRecursiveFun = squareList.squareOfListUsingRecursion(list)

  println(resultUsingMapFun)
  println(resultUsingRecursiveFun)
}
