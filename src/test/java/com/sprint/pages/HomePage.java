package com.sprint.pages;

import com.github.dockerjava.api.model.Link;
import com.sprint.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "//a[@data-menu-xmlid=\"hr_expense.menu_hr_expense_root\"]")
    public WebElement expensesSubclass;


    //*[@id="oe_main_menu_navbar"]/div[2]/ul[1]/li[1]/a/span


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li")
    public WebElement inboxElement;





}
