package com.mikestaszel.jobs;

import com.mikestaszel.utils.SparkJob;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;


public class CountLines extends SparkJob {
    public CountLines(String[] args) {
        super(args);
    }

    @Override
    public void execute() {
        Dataset<Row> ookla = spark.read().parquet("s3a://ookla-open-data/parquet/performance/type=mobile/year=2022/quarter=4/");
        long count = ookla.count();

        System.out.printf("Line count: %d%n", count);
    }

    public static void main(String[] args) {
        CountLines job = new CountLines(args);
        job.execute();
    }
}
