package com.学习.基础.函数

/**
  * Created by Administrator on 2017/4/19.
  */
object 函数 {
  def main(args: Array[String]): Unit = {
    println(max(2,3))
     val list=List(1,2,4,5)

    /**
      * 1 temp后面的类型可以省去
      * 2 如果函数字面量只有一行语句并只带一个参数 ，那么可以省略参数 list.foreach((println)
      */
      list.foreach((temp:Int)=>println(temp))
  }

  /**
    *1 有时候函数需要明确此函数返回结果的类型，如递归函数，大部分情况都不需要制定函数返回类型，会自动推断类型
    *
    * 如果函数里只有一句话 则可以省略花括号 def max(x:Int,y:Int)=if(x>y) x else y
    * @param x
    * @param y
    * @return
    */
  def  max(x:Int,y:Int): Int ={
    if(x>y){
       x
    }else{
      return y
    }
  }
}
