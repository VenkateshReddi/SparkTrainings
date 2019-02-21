package com.sparkprograms.examples

import org.apache.spark.sql.SparkSession

object sampleSparkDF {

  def sparkDfCreate(s: SparkSession) = {
    import s.implicits._

  val ds = s.createDataset(Seq(1,2,3,4,5))
  val df = s.sparkContext.parallelize(Seq(1,2,3,4,5)).toDF()
    df
  }

  def sparkRDD(sparkSession: SparkSession) = {
    val rdd = sparkSession.sparkContext.parallelize(Seq(1,2,3,4,5))
    rdd
  }
}
