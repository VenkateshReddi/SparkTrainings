package com.sparkprograms.examples

import com.sparkread.examples.FileReader
import com.sparkprograms.examples.process._
import com.sparkwrite.examples.FileWriter

//spark-submit -class com.sparkprograms.examples.TestSpark -jar user/SparkTrainings.jar 10 "user/file/test.csv"
//val togetvaluefive = args(1)
object TestSpark extends SparkSessionProvider with FileReader with FileWriter {
def main(args: Array[String]): Unit ={
  val columnsCount = args(0).toInt
  val inputpath = args(1)
  val inputParmsMap = Map("delimiter" -> ";", "path" -> inputpath )

  val readCSV = CSVReader(spark)(inputParmsMap)
  val validateInputDf = ValidateInputData(readCSV)(columnsCount)
  CSVWriter(spark)(validateInputDf)(Map("path" -> args(1)))

  //sampleSparkDF.sparkDfCreate(spark).show(5, false)
 // sampleSparkDF.sparkRDD(spark).take(5).foreach(println(_))

  }
}
