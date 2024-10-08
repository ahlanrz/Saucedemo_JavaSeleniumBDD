package com.saucedemo.ahlan;

import com.juaracoding.psikotest.step_definitions.pages.Login;
import com.juaracoding.psikotest.step_definitions.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private Login loginPage = new Login();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Test Case One
//    @When("User go to Web Psikotest Online")
//    public void usr_go_to_web_psikotest_online() {
//        driver.get(Constants.URL);
//        extentTest.log(LogStatus.PASS, "User go to Web Psikotest Online");
//    }
//
//    @And("User enter username password invalid")
//    public void user_enter_username_password_invalid() {
//        loginPage.login("deve", "232");
//        extentTest.log(LogStatus.PASS, "User enter username password invalid");
//    }
//
//    @And("User click button login")
//    public void user_click_button_login() {
//        loginPage.clickBtnLogin();
//        extentTest.log(LogStatus.PASS, "User click button login");
//    }
//
//    @Then("User invalid credentials")
//    public void user_invalid_credentials() {
//        Assert.assertEquals(loginPage.getTxtInvalidCredentials(), "Username atau password tidak ditemukan atau akun anda tidak aktif");
//        extentTest.log(LogStatus.PASS, "User invalid credentials");
//    }
//
//    @Then("User click button Oke")
//    public void userClickButtonOke() {
//        loginPage.clickBtnOkeInvalid();
//        extentTest.log(LogStatus.PASS, "User click button oke");
//    }

    //---------------------------------------------------------------------------------------------------------

    // Test Case Two

    @When("User go to Web Psikotest Online")
    public void usr_go_to_web_psikotest_online() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to Web Psikotest Online");
    }
    @Then("User enter username password valid")
    public void user_enter_username_password_valid() {
        loginPage.login("developer", "23");
        extentTest.log(LogStatus.PASS, "User enter username password valid");
    }

    @And("User click button login valid")
    public void user_click_button_login_valid() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login valid");
    }

    @Then("User valid credentials")
    public void user_valid_credentials() {
        Assert.assertEquals(loginPage.getTxtWelcome(), "Welcome to web psikotest");
        extentTest.log(LogStatus.PASS, "User valid credentials");
    }


}
