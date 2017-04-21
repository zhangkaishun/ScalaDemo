package com.学习.基础.类

import java.io.FileNotFoundException
import java.io.IOException
/**
  * Created by Administrator on 2017/4/21.
  */
object RationalTest {
  def main(args: Array[String]): Unit = {
    try {
      val rational1 = new Rational(1, 2)
      val rational2 = new Rational(3, 4)
      //测试加法
      println(rational1.add(rational2))
      //测试辅助构造器
      println(new Rational(3))
      //测试操作符
      println(rational1 + rational2)

      val mat="frient"
      val matt=
        mat match {
          case "kkk"=>"ffkkk"
          case "frient"=>"fffrient"
          case  _=> "缺省值"
        }
      println(matt)
      //抛出异常
      throw new FileNotFoundException("not found file")
    }catch {
      case ex:FileNotFoundException =>
        println("FileNotFoundException")
       case ex:IOException =>
         println("IOException")
    }finally {
      println("执行finally")
    }
  }
}
