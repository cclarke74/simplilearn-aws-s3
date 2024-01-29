package com.simplilearn.aws.s3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.simplilearn.aws.s3.util.S3Util;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String... args) {
        logger.info("Application starts");

        S3Util.listBuckets();
        
        logger.info("Application ends");
    }
}
