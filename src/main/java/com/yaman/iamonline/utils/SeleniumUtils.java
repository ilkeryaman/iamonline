package com.yaman.iamonline.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SeleniumUtils {
    public static void scroll(WebDriver driver, String scrollTo) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0," + scrollTo +")");
    }
}
