package com.sparkprograms.examples


object TestSpark extends SparkSessionProvider {
def main(args: Array[String]): Unit ={
  sampleSparkDF.sparkDfCreate(spark).show(5, false)
  sampleSparkDF.sparkRDD(spark).take(5).foreach(println(_))

  }
}
