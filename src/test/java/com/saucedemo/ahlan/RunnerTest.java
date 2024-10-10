package com.saucedemo.ahlan;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",

        features = {"src/main/resources/features/02.LoginValid.feature",
        },

        glue = "com.saucedemo.ahlan",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}