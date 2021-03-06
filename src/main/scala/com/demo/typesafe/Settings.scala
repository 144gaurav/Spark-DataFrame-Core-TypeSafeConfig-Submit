package com.demo.typesafe

import com.typesafe.config.Config
import scala.collection.JavaConverters._

/**
 * @author FlorentF9
 * Settings class for configuration.
 */
class Settings(config: Config) extends Serializable {

  val inputFile = config.getString("file.input")
  val outputFile = config.getString("file.output")


}
