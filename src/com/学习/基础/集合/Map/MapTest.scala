package com.学习.基础.集合.Map

import scala.collection.mutable.Map

/**
  * Created by Administrator on 2017/4/20.
  */
object MapTest {
  def main(args: Array[String]): Unit = {
    val mapOne = Map[Int, String]()
    mapOne += (1->"zks")
    mapOne += (2->"kakk")
    println(mapOne(1))
  }
}
