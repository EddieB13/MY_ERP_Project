package com.sprint.pages;

import com.sprint.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//input[@id=\"login\"]")
    public WebElement userName;

    @FindBy(xpath = "//input[@id=\"password\"]")
    public WebElement userPassword;

    @FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
    public WebElement loginButton;





}
