package com.Briteerp.Pages;

import com.Briteerp.Utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.util.Calendar;

public class DiscussPage  extends TestBasePage {

    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

    @FindBy(xpath = "//a[@data-menu='115']")
    private WebElement discuss;

    @FindBy(xpath = "//a[@data-menu='120']")
    private WebElement calendar;

    @FindBy(xpath = "//div[@class='o_mail_chat_title_main o_mail_chat_title_starred o_mail_chat_channel_item o_active']")
    private WebElement starred;

    @FindBy(xpath = "(//span[@class='fa fa-plus o_add'])[1]")
    private WebElement addChannelButton;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    private WebElement addChannelInput;

    @FindBy(xpath = "(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'])[2]")
    private WebElement addChannel;

    @FindBy(xpath = "//div[@title='announcements']")
    private WebElement newChannel;







    public void clickDisscuss(){
        wait.until(ExpectedConditions.elementToBeClickable(calendar)).click();
        wait.until(ExpectedConditions.elementToBeClickable(discuss)).click();

    }

    public void clickAddChannelButton(){
        wait.until(ExpectedConditions.elementToBeClickable(addChannelButton)).click();

    }

    public void createChannel(){
        wait.until(ExpectedConditions.elementToBeClickable(addChannelInput)).sendKeys("announcements");
        wait.until(ExpectedConditions.elementToBeClickable(addChannel)).click();

    }

    public void addChannelInputIsDisplayed(){
        addChannelInput.isDisplayed();

    }

    public void newChanelIsDisplayed(){
        newChannel.isDisplayed();

    }


}
