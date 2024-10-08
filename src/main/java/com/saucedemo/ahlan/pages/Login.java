package com.saucedemo.ahlan.pages;

import com.saucedemo.ahlan.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"tl_login-1-51550_text\"]")
    WebElement username;



    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }

    public void clickBtnLogin() {
        btnLogin.click();
    }

    public String getTxtWelcome(){
        return txtWelcome.getText();
    }

    public String getTxtInvalidCredentials(){
        return txtInvalidCredentials.getText();
    }
//    public String getTxtRequired(){
//        return txtRequired.getText();
//    }

    public void clickBtnOkeInvalid() {
        btnOkeInvalid.click();
    }

}
