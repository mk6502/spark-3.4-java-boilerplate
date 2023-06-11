# Spark 3.4 + Java Boilerplate
This is a sample project to get everything up and running.

# Versions Used
* JDK 11 or 17 are both supported.
* Spark 3.4.0.

# Building
Use Maven:

    mvn package

# Running
Run with:

    mvn package && spark-submit --master "local[*]" --class com.mikestaszel.jobs.CountLines target/spark-1.0.jar
