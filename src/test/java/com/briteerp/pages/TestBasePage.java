package com.briteerp.pages;

import org.openqa.selenium.support.PageFactory;

public class TestBasePage {

    public TestBasePage() {
        PageFactory.initElements(com.vytrack.utils.Driver.getDriver(), this);
    }
}
