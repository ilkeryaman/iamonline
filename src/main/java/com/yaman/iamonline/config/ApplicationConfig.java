package com.yaman.iamonline.config;

import com.yaman.iamonline.service.BrowsingManager;
import com.yaman.iamonline.service.PageSelector;
import com.yaman.iamonline.service.impl.PageSelectorImpl;
import com.yaman.iamonline.service.impl.ScrollingBrowsingManagerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public BrowsingManager browsingManager() {
        return new ScrollingBrowsingManagerImpl();
    }

    @Bean
    public PageSelector pageSelector() {
        return new PageSelectorImpl();
    }
}
