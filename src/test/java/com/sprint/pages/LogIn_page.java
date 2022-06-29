package com.sprint.pages;

import com.sprint.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_page {

    public LogIn_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@id=\"login\"]")
    public WebElement userNameInput;


    @FindBy(xpath = "//input[@id=\"password\"]")
    public WebElement passwordInput;


    @FindBy(xpath = "//button[.=\"Log in\"]")
    public WebElement logInButton;
}


