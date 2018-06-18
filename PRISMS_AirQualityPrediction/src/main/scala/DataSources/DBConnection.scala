package DataSources

import java.util.Properties
import org.apache.spark.sql.{DataFrame, SparkSession}

object DBConnection {

  def dbJDBC: String = {
    val hostname = "localhost"
    val port = 11223
    val database = "prisms"
    val url = s"jdbc:postgresql://$hostname:$port/$database"
    url
  }

  def connProperties: Properties = {
    val properties = new Properties()
    properties.put("user", "yijun")
    properties.put("password", "m\\tC7;cc")
    properties.put("Driver", "org.postgresql.Driver")
    properties
  }

  def dbReadData(tableName: String,
                 cols: List[String],
                 conditions: String,
                 sparkSession: SparkSession):
  DataFrame = {

    val colString = cols.mkString(",")
    val query = s"(select $colString from $tableName $conditions) as sub"
    val data = sparkSession.read.jdbc(
      url = this.dbJDBC,
      table = query,
      properties = this.connProperties
    )
    data
  }

  def dbWriteData(df: DataFrame,
                  schema: String,
                  tableName: String):
  Unit = {

    df.write.mode("append").jdbc(
      this.dbJDBC,
      schema + '.' + tableName,
      this.connProperties
    )
  }

}
