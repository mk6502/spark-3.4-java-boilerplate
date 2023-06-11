package com.mikestaszel.utils;

import org.apache.spark.sql.SparkSession;

public abstract class SparkJob {
    protected SparkSession spark;
    public String[] args;

    public SparkJob(String[] args) {
        spark = SparkSession.builder().appName("job").getOrCreate();
        spark.sparkContext().setLogLevel("WARN");
        this.args = args;
    }

    public abstract void execute();
}
