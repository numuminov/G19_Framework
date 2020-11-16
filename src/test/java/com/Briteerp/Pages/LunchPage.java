package com.Briteerp.Pages;

import com.Briteerp.Utils.BrowserUtils;
import com.Briteerp.Utils.Driver;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class LunchPage extends TestBasePage{

    private static WebDriverWait Exwait = new WebDriverWait(Driver.getDriver(), 20);


    //---------------------------Background WebElements & Methods-----------------------------------------------------------
@FindBy(xpath = "//a[@data-menu-xmlid='lunch.menu_lunch']")//Clickin on the Lunch button
    public WebElement Lunch_Button;

@FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")//Handle pop-up error message
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
//Today`s Order button
    @FindBy(xpath = "//a[@class='oe_menu_leaf'][@data-menu='101']")
    public WebElement todaysOrderButton;

//Header from "Today`s Order" page
    @FindBy(xpath = "//li[.='Orders by Vendor']")
    public WebElement textVerifOnTodaysOrder;

//Vendors Order button
    @FindBy(xpath = "//a[@class='oe_menu_leaf'][@data-menu='102']")
    public WebElement vendorsOrderButton;

//Header from "Vendors Order" page
    @FindBy(xpath = "//li[.='Control Vendors']")
    public WebElement controlVendorText;

//Control Account button
    @FindBy(xpath = "//a[@class='oe_menu_leaf'][@data-menu='103']")
    public WebElement controlAccountButton;

//Header from "Control Accounts"
    @FindBy(xpath = "//li[.='Control Accounts']")
    public WebElement controlAccountText;

//Employees Payment button
    @FindBy(xpath = "//a[@class='oe_menu_leaf'][@data-menu='104']")
    public WebElement employeesPaymentButton;

//Header from "Employees Payment" page
    @FindBy(xpath = "//li[.='Register Cash Moves']")
    public WebElement registCashMovesText;


//Kanban button from "Today`s order" page
@FindBy(xpath = "//button[@class='btn btn-icon fa fa-lg fa-th-large o_cp_switch_kanban']")
public WebElement changeView;

  //Add column for creating new order
@FindBy(xpath = "//span[@class='o_kanban_add_column']")
public WebElement addColumn;


//Input for new column
@FindBy(xpath = "//input[@class='form-control o_input']")
public WebElement inputNewColumnTodaysOrder;


//Text from the title of column
 @FindBy(xpath = "//span[@class='o_column_title']")
  public WebElement titleText;


 //Checking specific Title for column
    //using for verification on "Orders By Vendor" page
    @FindBy(xpath = "//span[@class='o_column_title'][.='Undefined']")
    public WebElement columnTitle2;

    //Checking if new tabs is visible from "Undefined" column
    @FindBy(xpath = "//span[.='erfew']")
    public WebElement recordTop;

//        -----------------------------1 Method US2----------------------------
    //Method checking info for "Today`s Order" page
     // Changing view
      //creating new title

    public void createTodaysOrder(){
        //Changing view for Kanban column
        changeView.click();
        BrowserUtils.wait(1);

        //Add column for creating new order
        addColumn.click();
        BrowserUtils.wait(1);

        //Creating new title
        inputNewColumnTodaysOrder.sendKeys("New todays order"+ Keys.ENTER);
                                             Exwait.until(ExpectedConditions.visibilityOf(titleText));

        //Verifying if new title is appeared
        String expRes = "New todays order";
        String actRes = titleText.getText();
        Assert.assertEquals(expRes,actRes);
    }

//        -----------------------------2 Method US2----------------------------

    //Method checking info for "Control Vendors" page
    public void controlVendorsOrders(){
        //Changing view
                                         Exwait.until(ExpectedConditions.elementToBeClickable(changeView));
    changeView.click();

    // verifying if "Control Order columns is displayed"
                                            Exwait.until(ExpectedConditions.visibilityOf(columnTitle2));
    Assert.assertTrue(columnTitle2.isDisplayed());

    // Checking description to verify that title is appeard
 Assert.assertTrue(recordTop.isDisplayed());

    }



//        -----------------------------3 Method US2----------------------------

    //Method checking info for "Control Account" page
    public void controlAccountVerif(){
                              Exwait.until(ExpectedConditions.elementToBeClickable(changeView));
    changeView.click();
                                      Exwait.until(ExpectedConditions.visibilityOf(titleText));
    Assert.assertTrue(titleText.isDisplayed());
}


//Checking payment info, if statement is correct and amount is appeared
@FindBy(xpath = "//div[@class='col-xs-4 text-right']//span[.='31.00']")
public WebElement checkPayment;


    //        -----------------------------4 Method US2----------------------------
    //Method checking info for "Employee Payment" page
public void checkPaymentHistory(){
    Exwait.until(ExpectedConditions.elementToBeClickable(changeView));
    changeView.click();
BrowserUtils.wait(2);
    Assert.assertTrue(checkPayment.isDisplayed());

}
//**********************************************************************************************************************




//---------------------------US3 WebElements & Methods------------------------------------------------------------------



//**********************************************************************************************************************




//---------------------------US4 WebElements & Methods------------------------------------------------------------------



//**********************************************************************************************************************




//---------------------------US5 WebElements & Methods------------------------------------------------------------------



//**********************************************************************************************************************

}
