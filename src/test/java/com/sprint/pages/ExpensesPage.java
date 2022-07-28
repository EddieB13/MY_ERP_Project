package com.sprint.pages;

import com.sprint.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensesPage {

    public ExpensesPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//*[@id=\"menu_more\"]/li[9]/a/span" )
    public WebElement expensesButton;

}
