package com.yaman.iamonline.service.impl;

import com.yaman.iamonline.service.PageSelector;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PageSelectorImpl implements PageSelector {
    private final List<String> pageList = Arrays.asList(
            "https://stackoverflow.com/questions/31003271/how-can-i-integrate-sso-authentication-with-jsf",
            "https://stackoverflow.com/questions/78770904/browsers-behavior-utf-8-page-with-extra-character-like-ufffe-error-by-ajax-x",
            "https://stackoverflow.com/questions/78726888/primefaces-datatable-how-to-default-select-a-checkbox-which-is-disabled",
            "https://stackoverflow.com/questions/78646922/display-conditional-popup-in-jsf",
            "https://stackoverflow.com/questions/78604912/yearnavigator-in-pdatepicker-appears-as-spinner-instead-of-dropdown",
            "https://stackoverflow.com/questions/78524496/primefaces-calendar-when-required-is-true-ajax-listener-not-invoked",
            "https://stackoverflow.com/questions/78384574/primefaces-pages-loading-slowly-after-jquery-version-increased",
            "https://stackoverflow.com/questions/78365665/access-kotlin-class-from-jakara-faces-4-0-xhtml",
            "https://stackoverflow.com/questions/78347079/primefaces-ptabview-with-dynamic-true-breaks-pajax-in-wildfly-jboss-ea",
            "https://stackoverflow.com/questions/78310503/when-i-call-the-same-modal-screen-twice-jsf-it-doesnt-work-very-well"
    );

    public String selectPage(int browsingCounter) {
        return pageList.get((browsingCounter-1) % pageList.size());
    }
}
