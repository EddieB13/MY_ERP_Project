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
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;

public class Expenses_StepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ExpensesPage expensesPage = new ExpensesPage();


    Faker faker = new Faker();


    String expensesDescription = faker.bothify("???? #### ????");
    String employeeName = faker.name().fullName();
    String product = faker.bothify("???? ####");


    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10); //implicit


    @Given("User logged in as a expensesManager")
    public void the_user_logged_in_as_a_expenses_manager() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("email"));
        loginPage.userPassword.sendKeys("posmanager");
        loginPage.loginButton.click();

        BrowserUtils.waitFor(2); //explicit
    }
//=========================================================================

    //Expense Reports Module
    @And("User selects the Expense Reports module")
    public void UserSelectsTheExpenseReportsModule() {
        expensesPage.expenseReportModule.click();
        BrowserUtils.waitFor(2);

    }
    //push Create button from previous steps
    @And("User enters {string} on Expense Report Summary bar")
    public void userEntersOnExpenseReportSummaryBar(String tripToNYC) {
        expensesPage.addNewExpensesBar.sendKeys(tripToNYC+ Keys.ENTER);
        BrowserUtils.waitFor(2);
    }

    //Employee search bar
    @And("User clicks Employee button")
    public void userClicksEmployeeButton() {
        expensesPage.employeeBtn.click();
        BrowserUtils.waitFor(2);
    }

    //search for David Samson
    @And("User select {string} employee")
    public void userSelectEmployee(String davidSamson) {
        expensesPage.employeeBtn.sendKeys(davidSamson+Keys.ENTER);
        BrowserUtils.waitFor(2);
        expensesPage.employeeBtn.sendKeys(Keys.ENTER);
    }

    //push Save button
    @And("User clicks Save button to save")
    public void userClicksSaveButtonToSave() {
        BrowserUtils.waitFor(2);
        expensesPage.saveButton.click();

    }

    @When("User sees the {string} on the page")
    public void userSeesTheOnThePage(String arg0) {
    }

    @Then("User clicks Approve button")
    public void userClicksApproveButton() {
        BrowserUtils.waitFor(2);
        expensesPage.approveButton.click();
    }

    @And("User selects the Expense Reports To Approve module")
    public void userSelectsTheExpenseReportsToApproveModule() {
        BrowserUtils.waitFor(2);
        expensesPage.expenseReportModuleApprove.click();
    }

    @And("User types {string} on the search bar")
    public void userTypesOnTheSearchBar(String tripToNYC) {
        BrowserUtils.waitFor(2);
        expensesPage.searchBarType.sendKeys(tripToNYC+Keys.ENTER);

    }

    @And("User clicks the check box of the first appeared result")
    public void userClicksTheCheckBoxOfTheFirstAppearedResult() {
        BrowserUtils.waitFor(2);
        expensesPage.checkBox.click();
    }


    @And("User clicks action button")
    public void userClicksActionButton() {
        BrowserUtils.waitFor(2);
        expensesPage.actionButton2.click();
    }

    @And("User deletes the last action")
    public void userDeletesTheLastAction() {
        expensesPage.deleteButton.click();
    }

    @And("User clicks Ok to confirm the delete action")
    public void userClicksOkToConfirmTheDeleteAction() {
        expensesPage.okButton.click();
    }

//=========================================================================

    //Negative test

    @Then("User is on the Expenses page link")
    public void User_is_on_the_expenses_page_link() {
        wait.until(ExpectedConditions.visibilityOf(homePage.inboxElement));
        //BrowserUtils.waitFor(4);
        homePage.expensesSubclass.click();
    }

    @Then("User clicks {string} button to register")
    public void User_clicks_button_to_register(String string) {
        expensesPage.createButton.click();
    }

    @And("User fills  Expense Report Summary and Employee with invalid data")
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
