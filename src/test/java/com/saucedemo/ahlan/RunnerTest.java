package com.saucedemo.ahlan;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
<<<<<<<<< Temporary merge branch 1
        features = {"src/main/resources/features/01.Login.feature"},
//                "src/main/resources/features/02.Dashboard.feature",
=========
        features = {"src/main/resources/features/01.Login.feature",
       "src/main/resources/features/Report.feature",
        "src/main/resources/features/RemoveActivity.feature"},
>>>>>>>>> Temporary merge branch 2
//                "src/main/resources/features/03.Recruitment.feature"},
        glue = "com.juaracoding.psikotest.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}