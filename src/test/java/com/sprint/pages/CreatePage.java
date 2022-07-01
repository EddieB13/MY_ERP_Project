package com.sprint.pages;

import com.sprint.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePage {

    public CreatePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@accesskey=\"c\"]")
    public WebElement createButton;

    @FindBy(xpath = "//div[@class=\"o_input_dropdown\"]//input")
    public WebElement modelDropdown;

    @FindBy(xpath = "//a[.=\"Create and Edit...\"]")
    public WebElement createAndEdit;

    @FindBy(xpath = "//input[@placeholder=\"e.g. Model S\"]")
    public WebElement vehicleNameAndModelBox;

    @FindBy(xpath = "//h2//div//div/input")
    public WebElement vehicleBrandBox;

    @FindBy(xpath = "//span[.=\"Save\"]")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@class=\"btn btn-sm btn-primary\"]//span[.=\"Create\"]")
    public WebElement confirm;

    @FindBy(xpath = "//button[@class=\"close\"][1]")
    public WebElement close;

    @FindBy(xpath = "//h2/input")
    public WebElement licensePlateBox;



    @FindBy(xpath = "")
    public WebElement generalSaveButton;




}
