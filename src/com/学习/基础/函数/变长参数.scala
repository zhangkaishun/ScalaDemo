package com.学习.基础.函数

/**
  * Created by Administrator on 2017/4/28.
  */
object 变长参数 {
  def main(args:Array[String]): Unit ={
    pr(1,2)
    pr(1 to 5 :_*) //此处使用 :_* 告诉编译器希望把这个参数当作序列处理
   println("sum:"+sum(1,2,3))
  }

  /**
    * 注意 参数为args:String* 代表接收可变长参数列表
    * @param args
    */
  def pr(args:Int*): Unit ={
    for(arg<-args){
      println(arg)
    }
  }

  /**
    * 递归
    * @param args
    * @return
    */
  def sum(args:Int*):Int={
    if(args.length==0)
       0
    else
    // 序列的head是参数args的首个元素，而tail是所有其它的元素序列，这是个Seq，需要用 _*将它转为参数序列。
      args.head+sum(args.tail:_*)

  }
}
