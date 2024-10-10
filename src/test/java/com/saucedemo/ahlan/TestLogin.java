package com.saucedemo.ahlan;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.saucedemo.ahlan.pages.LoginPage;
import com.saucedemo.ahlan.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @When("User go to Web Sauce Demo")
    public void usr_go_to_web_saucedemo() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to Web Sauce Demo");
    }
    @Then("User enter username password valid")
    public void user_enter_username_password_valid() {
        loginPage.login("standard_user", "secret_sauce");
        extentTest.log(LogStatus.PASS, "User enter username password valid");
    }

    @And("User click button login valid")
    public void user_click_button_login_valid() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login valid");
    }

    @Then("User valid credentials")
    public void user_valid_credentials() {
        Assert.assertEquals(loginPage.getTxtProducts(), "Products");
        extentTest.log(LogStatus.PASS, "User valid credentials");
    }


}
