package com.yaman.iamonline.config;

import com.yaman.iamonline.enums.PropertyName;
import com.yaman.iamonline.utils.PropertyUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {
    public static WebDriver getWebDriver(){
        System.setProperty("webdriver.chrome.driver", PropertyUtils.getPropertyValue(PropertyName.CHROME_WEB_DRIVER_PATH.getVal()));
        return new ChromeDriver();
    }
}
