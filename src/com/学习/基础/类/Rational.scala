package com.学习.基础.类

/**
  * Created by Administrator on 2017/4/21.
  */
class Rational(n:Int,d:Int) {

  /**
    * require函数接收一个boolean参数 如果为true require将正常执行
   ，如果为false 将抛出IllegalArgumentException阻止对象被构造
    */
  require(d!=0)
  /**
    * 定义字段，默认为public
    */
  val nn=n
  val dd=d
  /**
    * kk为私有字段，只可在本类中被调用
    */
  private val kk=nn +"/"+dd

  /**
    * 辅助构造器
    * @param n
    * @return
    */
  def this(n:Int)=  this(n,1)
  /**
    * 重写toString方法
    * @return
    */
  override def toString: String = kk
  def add(that:Rational):Rational=new Rational(nn*that.dd+dd*that.nn,dd*that.dd)

  /**
    * 定义操作符
    * @param that
    * @return
    */
  def +(that:Rational):Rational=new Rational(nn*that.dd+dd*that.nn,dd*that.dd)


}
