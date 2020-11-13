package com.Briteerp.StepDefinitions.Lunch;

import com.Briteerp.Pages.LunchPage;
import com.Briteerp.Utils.BrowserUtils;
import com.Briteerp.Utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class Lunch_POM {
LunchPage lunchPage = new LunchPage();


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
    public void userClick_on_tab(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should be able to see {string} information")
    public void userShould_be_able_to_see(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
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
