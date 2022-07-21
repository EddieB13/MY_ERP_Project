package com.sprint.pages;

import com.sprint.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//div/button[@accesskey=\"c\"]")
    public WebElement createButton;


    @FindBy(xpath = "//input[@name=\"name\"]")
    public WebElement enterName;

}
