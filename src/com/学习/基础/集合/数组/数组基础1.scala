package com.学习.基础.集合.数组

/**
  * Created by Administrator on 2017/4/20.
  */
object 数组基础1 {
  def main(args: Array[String]): Unit = {
    //定义数组
    val greetStrings = new Array[String](3)
    //此种定义方式类似 Array.apply(1,2,3);
    val array2=Array(1,2,3)
    println(array2(0))
    greetStrings(0) = "hello"
    greetStrings(1) = "worl"
    greetStrings(2) = "d"
    for (i <- 0 to 2) {
      println(greetStrings(i))
    }
    println("xx")
  }
}
