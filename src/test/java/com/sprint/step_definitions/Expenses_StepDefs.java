package com.sprint.step_definitions;

import com.github.javafaker.Faker;
import com.sprint.pages.ExpensesPage;
import com.sprint.pages.HomePage;
import com.sprint.pages.LoginPage;
import com.sprint.utilities.BrowserUtils;
import com.sprint.utilities.ConfigurationReader;
import com.sprint.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expenses_StepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ExpensesPage expensesPage = new ExpensesPage();
    Faker faker = new Faker();
    String expensesDescription = faker.letterify(" ???? ???????");

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10); //implicit










//=========================================================================


    //Negative test
    @Given("the user logged in as a expensesManager")
    public void the_user_logged_in_as_a_expenses_manager() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("email"));
        loginPage.userPassword.sendKeys("posmanager");
        loginPage.loginButton.click();
        //BrowserUtils.waitFor(2); //explicit
    }

    @Then("the user is on the Expenses page link")
    public void the_user_is_on_the_expenses_page_link() {
        wait.until(ExpectedConditions.visibilityOf(homePage.inboxElement));
        //BrowserUtils.waitFor(4);
        homePage.expensesSubclass.click();
    }

    @Then("the user clicks {string} button to register")
    public void the_user_clicks_button_to_register(String string) {
        expensesPage.createButton.click();
    }

    @And("the user fills  Expense Report Summary and Employee with invalid data")
    public void theUserFillsExpenseReportSummaryAndEmployeeWithInvalidData() {
        BrowserUtils.waitFor(3);
        expensesPage.saveButton.click();
    }

    @Then("Verify alert message should be displayed clearly")
    public void alertMessageShouldBeDisplayedClearly() {
        BrowserUtils.waitFor(3);
        Assert.assertEquals(Driver.getDriver().getTitle(), "New - Odoo");
    }

//=========================================================================




}
