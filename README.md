# Configuring a Spark application with Typesafe config (example application)

Example code for my blog post ["Configuring Spark application with Typesafe config"](http://florentforest.xyz/2019/01/07/configuring-spark-applications-with-typesafe-config.html).

## Basic instructions

Build assembly JAR:

```shell
sbt assembly
```

Run (local mode):

```shell
spark-submit --master local[*] --class xyz.florentforest.sparkconfigexample.ConfigWordCount --files wordcount.conf --driver-java-options -Dconfig.file=wordcount.conf sparkconfigexample-assembly-1.0.jar 
```

Run (Yarn Client mode):

```shell
spark-submit --master yarn --deploy-mode client --class xyz.florentforest.sparkconfigexample.ConfigWordCount --files wordcount.conf
--driver-java-options -Dconfig.file=wordcount.conf --conf spark.executor.extraJavaOptions=-Dconfig.file=wordcount.conf sparkconfigexample-assembly-1.0.jar 
```

Run (Yarn Cluster Mode):

```shell
spark-submit --master yarn-cluster --class org.training.spark.apiexamples.advanced.FoldByKey --files /home/cloudera/dvs/application.conf --conf spark.driver.extraJavaOptions=-Dconfig.file=/home/cloudera/dvs/application.conf --conf spark.executor.extraJavaOptions=-Dconfig.file=/home/cloudera/dvs/application.conf /home/cloudera/projects/spark-core/target/scala-2.10/spark-core_2.10-0.1.jar
```
