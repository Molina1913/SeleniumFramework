package com.demo.automation.stepdefinitions;

import config.SetUp;
import org.PageObjects.SwitchAlertActions;
import org.PageObjects.SwitchFrameActions;
import org.PageObjects.SwitchWindowActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchSteps {
    private static WebDriver driver;
    @BeforeTest
    public void initializeDriver(){
        driver = SetUp.InitializeChromeDriver();
    }
    @AfterTest
    public void closeDriver(){
        driver.quit();
    }

    @Test
    public void clickBtnAlertBoxTest(){
        SwitchAlertActions switchAlertActions = new SwitchAlertActions(driver);
        switchAlertActions.openUrl("https://demo.automationtesting.in/Alerts.html");
        switchAlertActions.clickAlertBox();
    }
    @Test
    public void clickOkCancelAlert(){
        SwitchAlertActions switchAlertActions = new SwitchAlertActions(driver);
        switchAlertActions.openUrl("https://demo.automationtesting.in/Alerts.html");
        switchAlertActions.clickAlertBoxOkCancel();
    }
    @Test
    public void writeInPrompt(){
        SwitchAlertActions switchAlertActions = new SwitchAlertActions(driver);
        switchAlertActions.openUrl("https://demo.automationtesting.in/Alerts.html");
        switchAlertActions.writeInPrompt();
    }
    @Test
    public void openTabWindow(){
        SwitchWindowActions switchWindowActions = new SwitchWindowActions(driver);
        switchWindowActions.openUrl("https://demo.automationtesting.in/Windows.html");
        switchWindowActions.openTabbedWindow();
    }
    @Test
    public void openSepareteWindow(){
        SwitchWindowActions switchWindowActions = new SwitchWindowActions(driver);
        switchWindowActions.openUrl("https://demo.automationtesting.in/Windows.html");
        switchWindowActions.openSepareteWindow();
    }
    @Test
    public void openMultipleWindows(){
        SwitchWindowActions switchWindowActions = new SwitchWindowActions(driver);
        switchWindowActions.openUrl("https://demo.automationtesting.in/Windows.html");
        switchWindowActions.openMultipleWindow("perro@gato.com");
    }
    @Test
    public void writeSingleFrame(){
        SwitchFrameActions switchFrameActions = new SwitchFrameActions(driver);
        switchFrameActions.openUrl("https://demo.automationtesting.in/Frames.html");
        switchFrameActions.writeSingleFrame();
    }
    @Test
    public void writeMultipleFrames(){
        WebDriver driver = SetUp.InitializeChromeDriver();
        SwitchFrameActions switchFrameActions = new SwitchFrameActions(driver);
        switchFrameActions.openUrl("https://demo.automationtesting.in/Frames.html");
        switchFrameActions.writeMultipleFrames();
    }
}
