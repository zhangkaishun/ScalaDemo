package com.学习.基础.文件

import scala.io.Source

/**
  * Created by Administrator on 2017/4/20.
  */
object 文件基础1 {
  def main(args: Array[String]): Unit = {
    val lines=Source.fromFile("C:\\Users\\Administrator\\Desktop\\linux命令.txt").getLines().toList
    for (line <- lines) {
      println(line)
    }
  }
}
