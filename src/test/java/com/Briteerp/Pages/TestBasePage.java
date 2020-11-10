package com.Briteerp.Pages;

import com.Briteerp.Utils.ConfigurationReader;
import com.Briteerp.Utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBasePage {

    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

    public TestBasePage() {
        PageFactory.initElements(com.Briteerp.Utils.Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='login']")
    private WebElement UserNameBox;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement PasswordBox;

    public void LoginMethod(){
        wait.until(ExpectedConditions.elementToBeClickable(UserNameBox)).sendKeys(ConfigurationReader.getProperty("usernameOne"));
        wait.until(ExpectedConditions.elementToBeClickable(PasswordBox)).sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
    }
}
