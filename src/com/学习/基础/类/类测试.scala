package com.学习.基础.类

/**
  * Created by Administrator on 2017/4/21.
  */
object 类Rational测试 {
  def main(args: Array[String]): Unit = {
    val rational1=new Rational(1,2)
    val rational2=new Rational(3,4)
    //测试加法
    println(rational1.add(rational2))
    //测试辅助构造器
    println(new Rational(3))
    //测试操作符
    println(rational1 + rational2)
  }
}
