package com.学习.基础.函数

/**柯里化(Currying)指的是将原来接受两个参数的函数变成新的接受一个参数的函数的过程。新的函数返回一个以原有第二个参数为参数的函数。
  * Created by hasee on 2017/5/3.
  */
object 柯里化 {
  def main(args: Array[String]): Unit = {
    println(sum(2,3))
    println(sum2(2)(3))
  }

  def sum(a:Int,b:Int): Int={
    a+b
  }

  /**
    * sum 返回一个匿名函数
    * @param a
    * @return
    */
  def sum2(a:Int)=(b:Int)=>a+b
}
