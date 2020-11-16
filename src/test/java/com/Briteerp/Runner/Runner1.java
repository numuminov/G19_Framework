package com.Briteerp.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "rerun:target/rerun.txt",
                    "json:target/cucumber.json"
            },
            features = "src/test/resources/Features",
            glue = "com/Briteerp/StepDefinitions",
            dryRun = false
            //tags = "",
            //publish = true
    )
    public class Runner1 {}