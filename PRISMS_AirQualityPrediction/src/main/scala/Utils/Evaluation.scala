package Utils

import org.apache.spark.sql.{DataFrame, functions}

object Evaluation {


  def rmse(df: DataFrame, groundtruthColumn: String, predictionColumn: String): (Double, Int) = {

    var df_error = df
    df_error = df_error.withColumn("error", df_error.col(groundtruthColumn) - df_error.col(predictionColumn))
    df_error = df_error.withColumn("sqrError", df_error.col("error") * df_error.col("error"))

    val n = df_error.count.toInt
    val rmseVal = math.sqrt(df_error.agg(functions.sum(df_error.col("sqrError")).as("sumError")).collect()(0)
      .getAs[Double]("sumError") / n)

    (rmseVal, n)
  }

  def mae(df: DataFrame, groundtruthColumn: String, predictionColumn: String): (Double, Int) = {

    var df_error = df
    df_error = df_error.withColumn("error", functions.abs(df_error.col(groundtruthColumn) - df_error.col(predictionColumn)))

    val n = df_error.count.toInt
    val maeVal = math.sqrt(df_error.agg(functions.sum(df_error.col("error")).as("sumError")).collect()(0)
      .getAs[Double]("sumError") / n)

    (maeVal, n)
  }




}
