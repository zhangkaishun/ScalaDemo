package com.学习.基础.函数

/**
  * Created by Administrator on 2017/4/21.
  */
object 函数字面量 {
  def main(args: Array[String]): Unit = {
    /**
      * (x:Int)=>x+1  函数字面量
      */
    var hanshu=(x:Int)=>x+1
    println(hanshu(2))
    /**
      * 函数字面量包含多条语句时，可用花括号包住函数体，一行放一条语句，组成函数代码块
      * 函数的返回值就是最后一行产生的结果
      */
    var hanshu2=(x:Int)=>{
      println(x)
      println(x+1)
      println(x+2)
      x+3
    }
   println( hanshu2(5)+"ddd")

    val list=List("fff","ddd")
    list.foreach((x:String)=>println(x))
  }

}
