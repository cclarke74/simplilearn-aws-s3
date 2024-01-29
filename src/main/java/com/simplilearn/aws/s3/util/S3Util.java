package com.simplilearn.aws.s3.util;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

public class S3Util {

    private static final Logger logger = LoggerFactory.getLogger(S3Util.class);

	
	public static void listBuckets() {
		
		AmazonS3 s3Ref = AmazonS3ClientBuilder.standard().withRegion(Regions.DEFAULT_REGION).build();
		
		List<Bucket> list = s3Ref.listBuckets();
		
		list.forEach(bucket -> logger.info(bucket.toString()));
	}
}
