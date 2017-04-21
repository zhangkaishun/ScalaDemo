package com.学习.基础.集合.元祖

/**元祖中可包含不同的数据类型
  * Created by Administrator on 2017/4/20.
  */
object 元祖测试 {
  def main(args: Array[String]): Unit = {
    val pair=(1,"zks")
    println(pair._1) //注意访问元祖的方式
    println(pair._2)
  }
}
