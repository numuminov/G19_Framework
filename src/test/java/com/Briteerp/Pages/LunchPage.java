package com.Briteerp.Pages;

import com.Briteerp.Utils.BrowserUtils;
import com.Briteerp.Utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LunchPage extends TestBasePage{

    private static WebDriverWait Exwait = new WebDriverWait(Driver.getDriver(), 20);


    //---------------------------Background WebElements & Methods-----------------------------------------------------------
@FindBy(xpath = "//a[@data-menu-xmlid='lunch.menu_lunch']")
    public WebElement Lunch_Button;

@FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement popup_OK_error;

public void beforeLunchButton(){
    BrowserUtils.wait(3);
    Lunch_Button.click();
    BrowserUtils.wait(3);
    popup_OK_error.click();
    BrowserUtils.wait(2);
}
//**********************************************************************************************************************



//---------------------------US1 WebElements & Methods------------------------------------------------------------------
@FindBy(xpath = "//a[@data-menu-xmlid='lunch.lunch_order_menu_form']")
public WebElement NewOrderBut;



//**********************************************************************************************************************



//---------------------------US2 WebElements & Methods------------------------------------------------------------------
    @FindBy(xpath = "//a[@class='oe_menu_leaf'][@data-menu='101']")
    public WebElement todaysOrderButton;

    @FindBy(xpath = "//li[@class='active'][.='Orders by Vendor']")
    public WebElement textVerifOnTodaysOrder;

    @FindBy(xpath = "//a[@class='oe_menu_leaf'][@data-menu='102']")
    public WebElement vendorsOrderButton;

    @FindBy(xpath = "//li[@class='active'][.='Control Vendors']")
    public WebElement controlVendorText;

    @FindBy(xpath = "//a[@class='oe_menu_leaf'][@data-menu='103']")
    public WebElement controlAccountButton;
//Control Accounts
    @FindBy(xpath = "//li[@class='active'][.='Control Accounts']")
    public WebElement controlAccountText;

    @FindBy(xpath = "//a[@class='oe_menu_leaf'][@data-menu='104']")
    public WebElement employeesPaymentButton;

    //Register Cash Moves
    @FindBy(xpath = "//li[@class='active'][.='Register Cash Moves']")
    public WebElement registCashMovesText;


    public void managerModuleFill(String tabs){

        if (tabs.trim().equalsIgnoreCase("Today`s order") ){
  Exwait.until(ExpectedConditions.elementToBeClickable(todaysOrderButton));
             todaysOrderButton.click();


        }else  if (tabs.trim().equalsIgnoreCase("Orders by Vendor") ){
Exwait.until(ExpectedConditions.elementToBeClickable(vendorsOrderButton));
            vendorsOrderButton.click();


        }else  if (tabs.trim().equalsIgnoreCase("") ){
Exwait.until(ExpectedConditions.elementToBeClickable(controlAccountButton));
            controlAccountButton.click();


        }else  if (tabs.trim().equalsIgnoreCase("Employee Payments") ){

Exwait.until(ExpectedConditions.elementToBeClickable(employeesPaymentButton));
            employeesPaymentButton.click();


        }



    }

    public void managerModuleTextVerif( String expectResult){

        if ( expectResult.trim().equalsIgnoreCase("Orders by Vendor")){

            Exwait.until(ExpectedConditions.visibilityOf(textVerifOnTodaysOrder));
            Assert.assertTrue(textVerifOnTodaysOrder.isDisplayed());

        }else  if ( expectResult.equalsIgnoreCase("Control Vendors")){

            Exwait.until(ExpectedConditions.visibilityOf(controlVendorText));
            Assert.assertTrue(controlVendorText.isDisplayed());

        }else  if ( expectResult.trim().equalsIgnoreCase("Control Accounts")){

            Exwait.until(ExpectedConditions.visibilityOf(controlAccountText));
            Assert.assertTrue(controlAccountText.isDisplayed());

        }else  if ( expectResult.trim().equalsIgnoreCase("Register Cash Moves")){


            Exwait.until(ExpectedConditions.visibilityOf(registCashMovesText));
            Assert.assertTrue(registCashMovesText.isDisplayed());

        }



    }
//**********************************************************************************************************************




//---------------------------US3 WebElements & Methods------------------------------------------------------------------



//**********************************************************************************************************************




//---------------------------US4 WebElements & Methods------------------------------------------------------------------



//**********************************************************************************************************************




//---------------------------US5 WebElements & Methods------------------------------------------------------------------



//**********************************************************************************************************************

}
