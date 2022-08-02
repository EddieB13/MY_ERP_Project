package com.sprint.pages;

import com.sprint.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensesPage {

    public ExpensesPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

//=======================================================
    //TC#1 be able to create Expenses Report Summary
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[19]/ul[1]/li[3]/a")
    public WebElement expenseReportModule;

    //User enters "Trip to New York"
    @FindBy(xpath = "//input[@name=\"name\"]")
    public WebElement addNewExpensesBar;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[2]/div/div/input")
    public WebElement employeeBtn;


    @FindBy(xpath = "//a[@data-menu=\"394\"]")
    public WebElement expenseReportModuleApprove;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/input")
    public WebElement searchBarType;



    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[1]/div/input")
    public WebElement checkBox;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button")
    public WebElement actionButton2;



    @FindBy(xpath = "//a[@data-index=\"1\"]")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[.='Ok']")
    public WebElement okButton;









//=======================================================

    // TC#3 Negative testing
    @FindBy(xpath = "//button[@accesskey=\"c\"]")
    public WebElement createButton;

    @FindBy(xpath = "//button[@accesskey=\"s\"]")
    public WebElement saveButton;

    @FindBy(xpath = "//button[.='Approve']")
    public WebElement approveButton;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]/button")
    public WebElement actionButton;








}
