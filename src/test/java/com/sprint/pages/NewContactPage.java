package com.sprint.pages;

import com.sprint.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class NewContactPage {

    public NewContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
