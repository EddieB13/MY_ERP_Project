package com.sprint.step_definitions;

import com.sprint.utilities.ConfigurationReader;
import com.sprint.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Centrilli_stepDefinitions {


    Centrilli_stepDefinitions centrilli_stepDefinitions = new Centrilli_stepDefinitions();


    @Given("User is on Centrilli webPage")
    public void user_is_on_centrilli_web_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlLink"));
    }


    @Then("User enters username {string}")
    public void user_enters_username(String string) {


    }


    @Then("User enters password {string}")
    public void user_enters_password(String string) {

    }


    @Then("User click on log in button")
    public void user_click_on_log_in_button() {

    }


    @Then("User sees homepage")
    public void user_sees_homepage() {

    }

}