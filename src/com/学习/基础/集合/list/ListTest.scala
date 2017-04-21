package com.学习.基础.集合.list

/**
  * Created by Administrator on 2017/4/20.
  */
object ListTest {

  def main(args: Array[String]): Unit = {
    val listOne = List(1, 2, 3)
    val listTwo = List(7, 8, 9)
    /**
      *::: 此方法实现两个list叠加功能，新生成一个list
      */
    val listThree = listOne ::: listTwo
    println(listThree)
    /**
      * ::此方法用于把新元素组合到现有列表的最前端，返回新列表
      * ::是左操作数listTwo的方法，类似于listTwo.::(7)
      */
    val listFour=7::listTwo
    println(listFour)


  }
}
