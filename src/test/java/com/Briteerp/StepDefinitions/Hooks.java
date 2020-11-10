package com.Briteerp.StepDefinitions;

import com.Briteerp.Pages.TestBasePage;
import com.Briteerp.Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    TestBasePage login = new TestBasePage();

    @Before
    public void setup() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get("http://app.briteerp.com/web/login");
        login.LoginMethod();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()){
            byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}