package com.sprint.step_definitions;

import com.sprint.pages.CreatePage;
import com.sprint.pages.HomePage;
import com.sprint.pages.LoginPage;
import com.sprint.utilities.ConfigurationReader;
import com.sprint.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.dnd.DragGestureEvent;

public class Centrilli_stepDefinitions {


    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    CreatePage createPage = new CreatePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("User is on centrilli login page")
    public void user_is_on_centrilli_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlLink"));
    }

    @When("User types {string} as username")
    public void user_types_as_username(String string) {
        loginPage.userName.sendKeys(string);
    }

    @When("User types {string} as password")
    public void user_types_as_password(String string) {
        loginPage.password.sendKeys(string);
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {

        loginPage.loginButton.click();
       //  wait.until(ExpectedConditions.titleContains("#Inbox"));

    }

    @Then("User is in centrilli homepage")
    public void user_is_in_centrilli_homepage() {
        loginPage.hashInbox.isDisplayed();
    }

    @When("Click on More dropdown")
    public void click_on_more_dropdown() {
        homePage.moreElement.click();
    }

    @When("User clicks on Fleet element")
    public void user_clicks_on_fleet_element() {
        homePage.fleetOption.click();
    }

    @Then("User is on Vehicles page")
    public void use_is_on_vehicles_page() {
        System.out.println("homePage.verifyCreatePage.isDisplayed() = " + homePage.verifyCreatePage.isDisplayed());
    }

    @When("User clicks Create button")
    public void user_clicks_create_button() {
        wait.until(ExpectedConditions.visibilityOf(homePage.verifyCreatePage));
        homePage.verifyCreatePage.click();
    }

    @When("Clicks on Model dropdown")
    public void clicks_on_model_dropdown() {
        //wait.until(ExpectedConditions.visibilityOf(createPage.modelDropdown));
        createPage.modelDropdown.click();
    }


    @When("Click on create and edit option")
    public void click_on_create_and_edit_option() {
        wait.until(ExpectedConditions.visibilityOf(createPage.createAndEdit));
        createPage.createAndEdit.click();
    }


    @Then("User enters {string} and {string}")
    public void user_enters_and(String string, String string2) {
        // wait.until(ExpectedConditions.visibilityOf(createPage.vehicleNameAndModelBox));
        // createPage.vehicleNameAndModelBox.click();
        createPage.vehicleNameAndModelBox.sendKeys(string);
       // createPage.createAndEdit.click();
       // createPage.createAndEdit.sendKeys(string2);
        wait.until(ExpectedConditions.titleContains("web/login"));
        //https://app.centrilli.com/web/login
    }


    @When("Clicks Save")
    public void clicks_save() {
        createPage.saveButton.click();
    }

    @When("Enters {string}")
    public void enters(String string) {

    }

    @When("Clicks Save button")
    public void clicks_save_button() {

    }


}