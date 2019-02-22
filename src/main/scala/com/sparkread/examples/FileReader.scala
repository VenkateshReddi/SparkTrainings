package com.sparkread.examples

import org.apache.spark.sql.{DataFrame, SparkSession}

trait FileReader {
  def CSVReader(spark: SparkSession)(parms: Map[String, String]): DataFrame = {
    spark.read.option("delimiter" , parms("delimiter")).csv(parms("path"))

  }

  def TextReader(spark: SparkSession)(parms: Map[String, String]): DataFrame = {
    spark.read.text(parms("path"))

  }

}
