package com.spark.test
import org.apache.spark.{SparkConf, SparkContext}

object sparkwordcount {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setMaster("local")
    conf.setAppName("Word Count")
    val sc = new SparkContext(conf)
    val counter=sc.textFile("/Users/sanju/Documents/sparkwordcount.rtf")
    println(counter.count())
  }
}
