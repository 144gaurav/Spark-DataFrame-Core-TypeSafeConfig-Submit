package com.demo.typesafe

import com.typesafe.config._


object ComplexApp extends App {


  System.setProperty("simple-lib.whatever", "This value comes from a system property")

  val config1 = ConfigFactory.load("complex1")

  // use the config ourselves
  println("config1, complex-app.something=" + config1.getString("complex-app.something"))


  // "config2" shows how to configure a library with a custom settings subtree
  val config2 = ConfigFactory.load("complex2")

  // use the config ourselves
  println("config2, complex-app.something=" + config2.getString("complex-app.simple-lib-context.simple-lib.foo"))

  val conf: Config = ConfigFactory.load()
  val settings: Settings = new Settings(conf)
  println(settings.inputFile)
  println(settings.outputFile)

}
