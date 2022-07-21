package com.sprint.step_definitions;

import com.github.javafaker.Faker;
import com.sprint.pages.ContactsPage;
import com.sprint.pages.CreatePage;
import com.sprint.pages.HomePage;
import com.sprint.pages.LoginPage;
import com.sprint.utilities.ConfigurationReader;
import com.sprint.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewContact_StepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ContactsPage contactsPage = new ContactsPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Faker faker = new Faker();
    String CustomerName = faker.bothify("?????? ??????");


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
    homePage.contactsElement.click();
    }


    @When("User clicks Create button")
    public void userClicksCreateButton() {
        contactsPage.createButton.click();
    }


    @And("Enters name and contact name on according fields")
    public void entersNameAndContactNameOnAccordingFields() {

    }
}
