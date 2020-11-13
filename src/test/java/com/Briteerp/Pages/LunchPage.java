package com.Briteerp.Pages;

import com.Briteerp.Utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

public class LunchPage extends TestBasePage{
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
    @FindBy(xpath = "")
    public WebElement todaysOrderButton;

    @FindBy(xpath = "")
    public WebElement vendorsOrderButton;

    @FindBy(xpath = "")
    public WebElement controlAccountButton;

    @FindBy(xpath = "")
    public WebElement employeesPaymentButton;


    public void managerModuleFill(String tabs, String expectResult){

        if (tabs.trim().equalsIgnoreCase("Today`s order") && expectResult.trim().equalsIgnoreCase("Orders by Vendor")){

        }else  if (tabs.trim().equalsIgnoreCase("Orders by Vendor") && expectResult.equalsIgnoreCase("Control Vendors")){

        }else  if (tabs.trim().equalsIgnoreCase("") && expectResult.trim().equalsIgnoreCase("Control Accounts")){

        }else  if (tabs.trim().equalsIgnoreCase("Employee Payments") && expectResult.trim()   .equalsIgnoreCase("Register Cash Moves")){

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
