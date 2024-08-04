package com.yaman.iamonline;

import com.yaman.iamonline.config.ApplicationConfig;
import com.yaman.iamonline.service.BrowsingManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        BrowsingManager browsingManager = context.getBean(BrowsingManager.class);
        try {
            browsingManager.startBrowsing();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.exit(0);
    }
}