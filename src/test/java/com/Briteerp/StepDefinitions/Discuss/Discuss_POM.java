package com.Briteerp.StepDefinitions.Discuss;

import com.Briteerp.Pages.DiscussPage;
import com.Briteerp.Utils.BrowserUtils;
import com.Briteerp.Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Discuss_POM {

    DiscussPage discussPage=new DiscussPage();

    @Given("user is on the Discuss page")
    public void user_is_on_the_discuss_page() {
        discussPage.clickDisscuss();
        BrowserUtils.wait(2);

    }


    @When("user clicks on plus icon in a front of the Channel")
    public void user_clicks_on_plus_icon_in_a_front_of_the_channel() {
        discussPage.clickAddChannelButton();
        BrowserUtils.wait(2);
    }

    @Then("empty input box should be displayed")
    public void empty_input_box_should_be_displayed() {
    discussPage.addChannelInputIsDisplayed();
        BrowserUtils.wait(2);
    }

    @Then("user should be able to type a channel name")
    public void user_should_be_able_to_type_a_channel_name() {
        discussPage.createChannel();
        BrowserUtils.wait(2);
    }

    @Then("newly created channel name should be visible under Channels")
    public void newly_created_channel_name_should_be_visible_under_channels() {


        discussPage.newChanelIsDisplayed();
        BrowserUtils.wait(2);
    }







}
