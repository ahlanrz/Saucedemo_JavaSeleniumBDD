package com.saucedemo.ahlan.pages;

import com.saucedemo.ahlan.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginValid {
    private WebDriver driver;

    public LoginValid() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "user-name")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement btnLogin;

    @FindBy(xpath = "//span[@class='title']")
    WebElement txtProducts;



    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
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
