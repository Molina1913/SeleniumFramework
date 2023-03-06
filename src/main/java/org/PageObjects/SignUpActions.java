package org.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpActions {
    private WebDriver webDriver;
    public SignUpPageObjects signUpPageObjects = new SignUpPageObjects(this.webDriver);

    public SignUpActions(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}


