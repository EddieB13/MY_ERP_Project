package com.sprint.pages;

import com.sprint.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "login")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class=\"o_control_panel\"]//li[@class=\"active\"]")
    public WebElement hashInbox;

}
