package com.zks.wordcount

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by Administrator on 2017/4/28.
  */
object WordCount {
  def main(args: Array[String]): Unit = {
    val conf=new SparkConf()
    conf.setAppName("My FirstSpark") //设置程序名字
    conf.setMaster("local");  //此时程序本地运行，无需安装spark 集群
    /**
      * 第二步:创建SparkContext对象
      * SparkContext是Spark程序所有功能的唯一入口，无论是采用Scala，Java，Python等都必须有一个SparkContext
      * SparkContext核心作用：初始化Spark应用程序运行所需要的核心组件，包括DAGScheduler，TaskScheduler，Scheduler
      * 同时还会负责Spark程序往Master注册程序等
      * SparkContext是整个Spark应用程序中最为至关重要的一个对象。
      */
    val sc=new SparkContext(conf)
    /**
      * 第三步:根据具体的数据来源（HDFS，HBase，Local FS（本地文件系统） ，DB，S3（云上）等）通过SparkContext来创建RDD
      * RDD的创建基本有三种方式，根据外部的数据来源（例如HDFS），根据Scala集合，由其他的RDD操作产生
      * 数据会被RDD划分成为一系列的Partitions，分配到每个Partition的数据属于一个Task的处理范畴
      */

    //文件的路径，最小并行度（根据机器数量来决定）
    val lines=sc.textFile("F:\\softwore\\spark-2.1.0-bin-hadoop2.7\\spark-2.1.0-bin-hadoop2.7\\README.md",1)
    /**
      * 第四步:对初始的RDD进行Transformation级别的处理，例如map，filter等高阶函数等的编程，来进行具体的数据计算
      *    4.1:将每一行的字符串拆分成单个的单词
      *    4.2:在单词拆分的基础上对每个单词的实例计数为1，也就是word =>(word,1)
      *    4.3:在每个单词实例计数为1基础之上统计每个单词在文件出现的总次数
      */

    //对每一行的字符串进行单词的拆分并把所有行的拆分结果通过flat合并成为一个大的单词集合
    val words=lines.flatMap(line=>line.split(" "))
    val pairs=words.map(word=>(word,1))
    val wordCount=pairs.reduceByKey(_+_);//对相同的key，进行value的累加（包括Local和Reducer级别同时Reduce）
    wordCount.foreach(wordNumberPair=>println(wordNumberPair._1+":"+wordNumberPair._2))
    sc.stop() //注意一定要将SparkContext的对象停止，因为SparkContext运行时会创建很多的对象

    /*这个程序运行之后一定会有一个错误，因为 没有hadoop环境，这个不是程序错误，也不影响任何功能*/
  }
}
