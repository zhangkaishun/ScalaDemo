package com.学习.基础.函数

/**高阶函数主要有两种：一种是将一个函数当做另外一个函数的参数（即函数参数）；另外一种是返回值是函数的函数
  * Created by hasee on 2017/5/3.
  */
object 高阶函数 {
  def main(args: Array[String]): Unit = {
      println(once(x=>x+1,2))
      println(once(_ +1,2))
  }
  def once(cp:Double=>Double,x:Double)={
    cp(x)
  }

}
