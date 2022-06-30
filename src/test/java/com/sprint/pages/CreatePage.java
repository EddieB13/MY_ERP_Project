package com.sprint.pages;

import com.sprint.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePage {

    public CreatePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class=\"o_input_dropdown\"]//input")
    public WebElement modelDropdown;

    @FindBy(xpath = "//a[.=\"Create and Edit...\"]")
    public WebElement createAndEdit;

    @FindBy(xpath = "//h1/input")
    public WebElement vehicleNameAndModelBox;

    @FindBy(xpath = "//div[@name=\"model_id\"]//div[@class=\"o_input_dropdown\"]//input")
    public WebElement vehicleBrandBox;

    @FindBy(xpath = "//button[@class=\"btn btn-sm btn-primary\"]")
    public WebElement saveButton;

    @FindBy(xpath = "")
    public WebElement LicensePlateBox;

    @FindBy(xpath = "")
    public WebElement generalSaveButton;



}
