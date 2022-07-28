package com.sprint.pages;

import com.sprint.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensesPage {

    public ExpensesPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//button[@accesskey=\"c\"]" )
    public WebElement createButton;


    @FindBy(xpath ="//button[@accesskey=\"s\"]" )
    public WebElement saveButton;


    //@FindBy(xpath =" " )


}
