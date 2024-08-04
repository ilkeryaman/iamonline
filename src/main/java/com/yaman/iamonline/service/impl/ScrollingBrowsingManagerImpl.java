package com.yaman.iamonline.service.impl;

import com.yaman.iamonline.config.WebDriverConfig;
import com.yaman.iamonline.service.BrowsingManager;
import com.yaman.iamonline.service.PageSelector;
import com.yaman.iamonline.utils.PropertyUtils;
import com.yaman.iamonline.utils.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScrollingBrowsingManagerImpl implements BrowsingManager {

    @Autowired
    private PageSelector pageSelector;

    private long maxBrowsingCount = 10;
    private long waitBeforeScroll = 5000;
    private long waitBeforeClose = 5000;
    private long waitBeforeRepeat = 5000;

    public void startBrowsing() throws InterruptedException {
        int browsingCounter = 0;
        PropertyUtils.loadProperties();

        do {
            browsingCounter++;
            browse(browsingCounter);
            Thread.sleep(waitBeforeRepeat);
        } while (browsingCounter <= maxBrowsingCount);
    }

    private void browse(int browsingCounter) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getWebDriver();
        driver.get(pageSelector.selectPage(browsingCounter));
        waitAndScroll(driver, 5);
        Thread.sleep(waitBeforeClose);
        driver.close();
    }

    private void waitAndScroll(WebDriver driver, int scrollTimes) throws InterruptedException {
        for(int i=1; i<=scrollTimes; i++) {
            Thread.sleep(waitBeforeScroll);
            int scrollTo = 200 * ((scrollTimes % 5) + 1);
            SeleniumUtils.scroll(driver, String.valueOf(scrollTo));
        }
    }
}
