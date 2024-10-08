package com.saucedemo.ahlan.drivers.strategies;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy{
    public WebDriver setStrategy() {
        System.setProperty("webdriver.chrome.driver", "D:\\Bootcamp SQA\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sandbox");
        options.setCapability("pageLoadStrategy", "normal");

        return new ChromeDriver(options);
    }

}
