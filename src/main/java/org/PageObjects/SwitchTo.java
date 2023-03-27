package org.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchTo {
    private WebDriver driver;
    public SwitchTo(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@href='#OKTab']")
    private WebElement alertWithOk;
    @FindBy(xpath = "//button[@class='btn btn-danger']")
    private WebElement btnDisplayAlertBox;
    @FindBy(xpath = "//a[@href='#CancelTab']")
    private WebElement alertWithOkCancel;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement btnDisplayConfirmBox;
    @FindBy(xpath = "//a[@href='#Textbox']")
    private WebElement alertWithTextBox;
    @FindBy(xpath = "//button[@class='btn btn-info']")
    private WebElement btnPromptBox;
    @FindBy(xpath = "//button[@class='btn btn-info']")
    private WebElement btnTabbedWindow;
    @FindBy(xpath = "//a[@href='#Seperate']")
    private WebElement seperateWindow;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement btnSeperateWindow;
    @FindBy(xpath = "//a[@href='#Multiple']")
    private WebElement multipleWindow;
    @FindBy(xpath = "//button[@onclick='multiwindow()']")
    private WebElement btnMultipleWindow;
    @FindBy(id = "email")
    private WebElement emailId;
    @FindBy(xpath = "//img[@id='enterimg']")
    private WebElement btnEmailId;
    @FindBy(xpath="//iframe[@id='singleframe']")
    private WebElement singleFrame;
    @FindBy(xpath="//input[@type='text']")
    private WebElement inputSingleFrame;
    @FindBy(xpath="//a[@href='#Multiple']")
    private WebElement secondFrame;
    @FindBy(xpath = "//iframe[@src='MultipleFrames.html']")
    private WebElement multipleFrames;
    @FindBy(xpath="//iframe[@src='SingleFrame.html']")
    private WebElement singleMultipleFrames;



    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getAlertWithOk() {
        return alertWithOk;
    }

    public WebElement getBtnDisplayAlertBox() {
        return btnDisplayAlertBox;
    }

    public WebElement getAlertWithOkCancel() {
        return alertWithOkCancel;
    }

    public WebElement getBtnDisplayConfirmBox() {
        return btnDisplayConfirmBox;
    }

    public WebElement getAlertWithTextBox() {
        return alertWithTextBox;
    }

    public WebElement getBtnPromptBox() {
        return btnPromptBox;
    }

    public WebElement getBtnTabbedWindow() {
        return btnTabbedWindow;
    }

    public WebElement getSeperateWindow() {
        return seperateWindow;
    }

    public WebElement getBtnSeperateWindow() {
        return btnSeperateWindow;
    }

    public WebElement getMultipleWindow() {
        return multipleWindow;
    }

    public WebElement getBtnMultipleWindow() {
        return btnMultipleWindow;
    }

    public WebElement getEmailId() {
        return emailId;
    }

    public WebElement getBtnEmailId() {
        return btnEmailId;
    }

    public WebElement getSingleFrame() {
        return singleFrame;
    }

    public WebElement getInputSingleFrame() {
        return inputSingleFrame;
    }

    public WebElement getMultipleFrames() {
        return multipleFrames;
    }

    public WebElement getSingleMultipleFrames() {
        return singleMultipleFrames;
    }

    public WebElement getSecondFrame() {
        return secondFrame;
    }
}
