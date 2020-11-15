package com.Briteerp.StepDefinitions.Lunch;

import com.Briteerp.Pages.LunchPage;
import com.Briteerp.Utils.BrowserUtils;
import com.Briteerp.Utils.ConfigurationReader;
import com.Briteerp.Utils.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Lunch_POM {
LunchPage lunchPage = new LunchPage();

    private static WebDriverWait exwait = new WebDriverWait(Driver.getDriver(), 20);


    @Given("user in the {string} page")
    public void user_in_the_page(String string) {
        // Clicking on Lunch button
        // Handle popup error
       lunchPage.beforeLunchButton();
    }




////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                                US1

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @When("user click on {string} tab")
    public void user_click_on_tab(String string) {
        //clicking on New Order Button
lunchPage.NewOrderBut.click();
BrowserUtils.wait(2);
//++++++++++++++++++++++FUNCTIONALITY IS BROKEN+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    }
    @Then("user should be able to order a new item")
    public void user_should_be_able_to_order_a_new_item() {

    }
    @Then("check ordered item by clicking on {string}")
    public void check_ordered_item_by_clicking_on_tab(String string) {

    }
    @Then("check expenses by clicking on {string} tab")
    public void check_expenses_by_clicking_on_tab(String string) {

    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                                US2

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

@When("user click on {string}")
    public void userClick_on_tab(String dataTable) {

        //if statement is clicking on specific button, depends of the "tab" credential
      if (dataTable.contains("Today`s order")){

      //Clicking Today`s order button from "Manager" module
          lunchPage.todaysOrderButton.click();
          BrowserUtils.wait(2);

      }else if (dataTable.contains("Orders by Vendor")){
          //Clicking on Orders by Vendor  button from "Manager" module
          lunchPage.vendorsOrderButton.click();
  BrowserUtils.wait(2);


      }else if (dataTable.contains("Control Accounts")){
          //Clicking on Control Accounts  button from "Manager" module
          lunchPage.controlAccountButton.click();
       BrowserUtils.wait(2);

      }else if (dataTable.contains("Employee Payments")){
          //Clicking on Employee Payments  button from "Manager" module
          lunchPage.employeesPaymentButton.click();
       BrowserUtils.wait(2);


      }


     }


@Then("user should be able to see information about {string} page")

    public void userShould_be_able_to_see(String dataTable) {

        //if statement verifying that we are on the page,
    //and providing actions for current page
    if (dataTable.contains("Today`s order")){

        //Verifying we are on Today`s order page
    Assert.assertTrue(lunchPage.textVerifOnTodaysOrder.isDisplayed());
        BrowserUtils.wait(2);

    }else if (dataTable.contains("Orders by Vendor")){

        //Verifying we are on Orders by Vendor page
    Assert.assertTrue(lunchPage.controlVendorText.isDisplayed());
        BrowserUtils.wait(2);

    }else if (dataTable.contains("Control Accounts")) {

        //Verifying we are on Control Accounts page
        Assert.assertTrue(lunchPage.controlAccountText.isDisplayed());
        BrowserUtils.wait(2);

    }else if (dataTable.contains("Employee Payments")){

        //Verifying we are on Employee Payments page
        Assert.assertTrue(lunchPage.registCashMovesText.isDisplayed());
        BrowserUtils.wait(2);

    }



        }



@And ("user should be able to do the {string} from the page specific tab")
 public  void user_should_be_able_to_do(String actionTable){

        if (actionTable.contains("Create a new order for today")){
            BrowserUtils.wait(1);
lunchPage.createTodaysOrder();

        }else if (actionTable.contains("Create a new order by Vendor")){
lunchPage.controlVendorsOrders();

        }else if (actionTable.contains("Create a new account")){
lunchPage.controlAccountVerif();

        }else if (actionTable.contains("Create a new payment")){


        }






    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                                US3

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @When("user  click on {string} tab")
    public void user_click_onTab(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should be able to see Products page")
    public void user_should_be_able_to_see_products_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("create new product")
    public void create_new_product() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("choose all products  by clicking on {string} checkbox")
    public void choose_all_products_by_clicking_on_checkbox(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("choose specific item by clicking on this item")
    public void choose_specific_item_by_clicking_on_this_item() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("sort items by clicking on {string} tab")
    public void sort_items_by_clicking_on_tab(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                                US4

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
@When("user click on {string} tab ")
public void user_click_on_Categories_tab(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
    @Then("user should be able to see Products Categories page")
    public void user_should_be_able_to_see_products_categories_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("create new product categories")
    public void create_new_product_categories() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("choose all products by clicking on {string} checkbox")
    public void chooseAll_products_by_clicking_on_checkbox(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("choose specific category by clicking on this item")
    public void choose_specific_category_by_clicking_on_this_item() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("sort categories by clicking on {string} tab")
    public void sort_categories_by_clicking_on_tab(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                                US5

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @When("user clicking on {string} tab")
    public void user_click_on_Alert_tab(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should be able to see Alerts page")
    public void user_should_be_able_to_see_alerts_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("create new message")
    public void create_new_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("choose all messages by clicking on {string} checkbox")
    public void choose_all_messages_by_clicking_on_checkbox(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("choose specific message by clicking on this item")
    public void choose_specific_message_by_clicking_on_this_item() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("sort messages by clicking on {string} tab")
    public void sort_messages_by_clicking_on_tab(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}
