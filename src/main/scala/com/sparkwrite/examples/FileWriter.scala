package com.sparkwrite.examples

import org.apache.spark.sql.{DataFrame, SparkSession}

trait FileWriter {
  //csvWrite(outputdf)(Map(

  def CSVWriter(spark: SparkSession)(output: DataFrame)(parms: Map[String, String]) {
    output.write.csv(parms("path"))

  }

  def TextWriter(spark: SparkSession)(output: DataFrame)(parms: Map[String, String]) = {
    output.write.text(parms("path"))

  }

}
