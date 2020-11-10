package com.briteerp.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "rerun:target/rerun.txt",
                    "json:target/cucumber.json"
            },
            features = "src/test/resources/features",
            glue = "com/briteerp/step_definitions",
            dryRun = true,
            //tags = "",
            publish = true
    )
    public class Runner1 {}