package com.sprint.step_definitions;

import com.sprint.pages.HomePage;
import com.sprint.pages.LoginPage;
import com.sprint.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Expenses_StepDefs {


    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();









    @Given("the user logged in as a expensesManager")
    public void theUserLoggedInAsAExpensesManager() {

        loginPage.userName.sendKeys(ConfigurationReader.getProperty("email"));
        loginPage.userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();


    }

    @Then("the user is on the Expenses page link")
    public void theUserIsOnTheExpensesPageLink() {

        homePage.moreElement.click();

    }

    @And("the user selects the Expense Reports module")
    public void theUserSelectsTheExpenseReportsModule() {


    }

    @And("the user clicks {string} button to register")
    public void theUserClicksButtonToRegister(String arg0) {
    }

    @And("the user fills {string} and {string} with invalid data")
    public void theUserFillsAndWithInvalidData(String arg0, String arg1) {
    }

    @And("the user clicks Save button to save")
    public void theUserClicksSaveButtonToSave() {
    }

    @Then("alert message should be displayed cearly")
    public void alertMessageShouldBeDisplayedCearly() {
    }
}
