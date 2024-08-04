package com.yaman.iamonline.enums;

public enum PropertyName {
    CHROME_WEB_DRIVER_PATH("chrome.web.driver.path");

    private String val;

    PropertyName(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
