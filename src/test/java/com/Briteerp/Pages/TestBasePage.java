package com.Briteerp.Pages;

import org.openqa.selenium.support.PageFactory;

public class TestBasePage {

    public TestBasePage() {
        PageFactory.initElements(com.Briteerp.Utils.Driver.getDriver(), this);
    }
}
