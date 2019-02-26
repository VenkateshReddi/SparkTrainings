package com.sparkprograms.examples.process

import org.apache.spark.sql.DataFrame

object ValidateInputData {

  def validateNumberOfColumns(inputDf: DataFrame)(columnsCount: Int) = {
    if(inputDf.columns.length == columnsCount) {
      println("number of columns fine")
      inputDf
    }else throw new Exception(s"columns are not matching: expected columns ${columnsCount} and columns from input file ${inputDf.columns.length}")

  }
}
