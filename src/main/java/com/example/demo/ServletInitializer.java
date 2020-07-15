package com.example.demo;

import cn.leancloud.AVLogger;
import cn.leancloud.core.AVOSCloud;
import cn.leancloud.core.AVOSService;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import cn.leancloud.AVCloud;
import cn.leancloud.AVObject;

public class ServletInitializer extends SpringBootServletInitializer {
    private static String appId = "3S7qMmVHTRR7CNUEK5tHj3tv-gzGzoHsz";
    private static String appKey = "yYSyDyjawVcYiskn4cSD6Aw7";
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        AVOSCloud.setLogLevel(AVLogger.Level.DEBUG);
        AVOSCloud.setServer(AVOSService.API,"http://leancloud.cn");
        AVOSCloud.setServer(AVOSService.ENGINE,"http://leancloud.cn");
        AVOSCloud.setServer(AVOSService.PUSH,"http://leancloud.cn");
        AVOSCloud.setServer(AVOSService.RTM,"http://leancloud.cn");
        AVOSCloud.setServer(AVOSService.STATS,"http://leancloud.cn");
        AVOSCloud.initialize(appId, appKey);
        return application.sources(DemoApplication.class);
    }
}
