package com.sprint.step_definitions;

import com.github.javafaker.Faker;
import com.sprint.pages.ContactsPage;
import com.sprint.pages.CreatePage;
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
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.AccessControlException;

public class NewContact_StepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ContactsPage contactsPage = new ContactsPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Faker faker = new Faker();
    String customerName = faker.bothify("?????? ??????");


    @Given("User is logged in with valid credentials")
    public void userIsLoggedInWithValidCredentials() {
        Driver.getDriver().get("https://qa.centrilli.com/");
        loginPage.userName.sendKeys("posmanager10@info.com");
        loginPage.password.sendKeys("posmanager");
        loginPage.loginButton.click();
        wait.until(ExpectedConditions.titleContains("#Inbox"));

    }


    @And("user is in Customers submenu")
    public void userIsInCustomersSubmenu() {
        BrowserUtils.waitFor(1);
        homePage.contactsElement.click();
    }


    @When("User clicks Create button")
    public void userClicksCreateButton() {
        contactsPage.createButton.click();
    }


    @And("Enters name and contact name on according fields")
    public void entersNameAndContactNameOnAccordingFields() {
        contactsPage.enterName.sendKeys(customerName);
        contactsPage.createContactbutton.click();
        contactsPage.enterName2.sendKeys(customerName);
        BrowserUtils.waitFor(1);
        contactsPage.saveNcloseButton.click();
    }

    @And("Clicks save button")
    public void clicksSaveButton() {
        contactsPage.saveButton.click();
        // BrowserUtils.waitFor(1);
        // contactsPage.discardButton.click();
    }

    @Then("Verify that new contact is created")
    public void verifyThatNewContactIsCreated() {
        wait.until(ExpectedConditions.titleContains(customerName));
        Assert.assertTrue(Driver.getDriver().getTitle().contains(customerName));

    }

    @When("User is on kanban view")
    public void userIsOnKanbanView() {
    contactsPage.kanbanVerification.isDisplayed();
    }

    @And("User click on list view")
    public void userClickOnListView() {
    contactsPage.listViewButton.click();
    }

    @Then("Verify that list view is displayed")
    public void verifyThatListViewIsDisplayed() {
        contactsPage.listViewVerification.isDisplayed();
    }

    @And("User clicks discard button")
    public void userClicksDiscardButton() {
        BrowserUtils.waitFor(3);
        contactsPage.discardButton2.click();
        contactsPage.okButton.click();
    }


    @Then("Verify changes are not saved")
    public void verifyChangesAreNotSaved() {
        BrowserUtils.waitFor(2);
        contactsPage.searchBar.sendKeys(customerName + Keys.ENTER);



    }
}
