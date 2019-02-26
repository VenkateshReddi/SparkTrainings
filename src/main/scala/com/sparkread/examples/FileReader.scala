package com.sparkread.examples

import org.apache.spark.sql.{DataFrame, SparkSession}

trait FileReader {
  //Map("delimiter" -> ";", "path" -> "user/sample/test.csv")
  def CSVReader(spark: SparkSession)(parmsMap: Map[String, String]): DataFrame = {
    spark.read.option("delimiter" , parmsMap("delimiter")).csv(parmsMap("path"))

  }

  def TextReader(spark: SparkSession)(parms: Map[String, String]): DataFrame = {
    spark.read.text(parms("path"))

  }

}
