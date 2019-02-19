package com.sparkprograms.examples

import org.apache.spark.sql.SparkSession

object sampleSparkDF {

  def sparkDfCreate(spark: SparkSession) = {
    import spark.implicits._

  val ds = spark.createDataset(Seq(1,2,3,4,5))
  val df = spark.sparkContext.parallelize(Seq(1,2,3,4,5)).toDF()
    df
  }
}
