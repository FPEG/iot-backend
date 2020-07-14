package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.leancloud.core.AVOSCloud;
import cn.leancloud.AVLogger;

@SpringBootApplication
public class DemoApplication {

	private static String appId = "3S7qMmVHTRR7CNUEK5tHj3tv-gzGzoHsz";
	private static String appKey = "yYSyDyjawVcYiskn4cSD6Aw7";

	public static void main(String[] args) {
		AVOSCloud.setLogLevel(AVLogger.Level.DEBUG);
		AVOSCloud.initialize(appId, appKey);
		SpringApplication.run(DemoApplication.class, args);
	}
}
