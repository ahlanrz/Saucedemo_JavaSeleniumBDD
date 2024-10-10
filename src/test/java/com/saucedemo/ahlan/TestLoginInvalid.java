package com.saucedemo.ahlan;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.saucedemo.ahlan.pages.LoginPage;
import com.saucedemo.ahlan.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class TestLoginInvalid {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();

    public TestLoginInvalid() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User is on the saucedemo login page")
    public void user_is_on_the_saucedemo_login_page() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User is on the saucedemo login page");
    }

    @When("User enter (.*) and (.*) invalid$")
    public void user_enter_username_and_password_invalid(String username, String password) {
        loginPage.loginInValid(username, password);
        extentTest.log(LogStatus.PASS, "User enter username and password invalid");
    }

    @And("User click button login")
    public void user_click_button_login() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }

//    @Then("User get invalid credentials")
//    public void user_get_invalid_credentials() {
//        String strExpectedLogin = "Username atau password tidak ditemukan";
//        assertTrue(loginPage.getTxtGagalLogin().contains(strExpectedLogin));
//        extentTest.log(LogStatus.PASS, "Admin tidak bisa login");
//    }

}

