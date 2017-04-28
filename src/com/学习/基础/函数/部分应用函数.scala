package com.学习.基础.函数

import java.util.Date

/**
  * Created by Administrator on 2017/4/28.
  */
object 部分应用函数 {

  def main(args: Array[String]): Unit = {
    val date=new Date()
    val logWithDateBound=log(date,_:String)
    logWithDateBound("hello")
    logWithDateBound("world")
  }
  def log(date:Date,message:String)={
  println(date+":"+message)
  }
}
