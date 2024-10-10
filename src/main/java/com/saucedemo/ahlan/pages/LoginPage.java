package com.saucedemo.ahlan.pages;

import com.saucedemo.ahlan.drivers.DriverSingleton;
import com.saucedemo.ahlan.utils.Constants;
import com.saucedemo.ahlan.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "user-name")
    WebElement txtUsername;

    @FindBy(name = "password")
    WebElement txtPassword;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement btnLogin;

    @FindBy(xpath = "//span[@class='title']")
    WebElement txtProducts;



    public void login(String username, String password){
        this.txtUsername.sendKeys(username);
        this.txtPassword.sendKeys(password);
    }

    public void loginInValid(String username, String password) {
        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
        this.txtUsername.sendKeys(username);
        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
        this.txtPassword.sendKeys(password);
    }

    public void clickBtnLogin() {
        btnLogin.click();
    }

    public String getTxtProducts(){
        return txtProducts.getText();
    }

//    public String getTxtInvalidCredentials(){
//        return txtInvalidCredentials.getText();
//    }
//    public String getTxtRequired(){
//        return txtRequired.getText();
//    }

//    public void clickBtnOkeInvalid() {
//        btnOkeInvalid.click();
//    }

}
