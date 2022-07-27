package com.sprint.pages;

import com.sprint.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.plaf.PanelUI;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//*[@id=\"login\"]")
    public WebElement userName;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement userPassword;

    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/main/div/form/div[3]/button")
    public WebElement loginButton;



//
//    @FindBy(id = "login")
//    public WebElement userName;
//
//    @FindBy(id = "password")
//    public WebElement password;
//
//    @FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
//    public WebElement loginButton;
//
//    @FindBy(xpath = "//div[@class=\"o_control_panel\"]//li[@class=\"active\"]")
//    public WebElement hashInbox;

}
