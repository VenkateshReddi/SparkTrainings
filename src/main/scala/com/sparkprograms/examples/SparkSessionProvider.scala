package com.sparkprograms.examples

import org.apache.spark.sql.SparkSession

trait SparkSessionProvider {

  val spark = SparkSession.builder().appName("TestSpark").master("local[*]").getOrCreate()

}
