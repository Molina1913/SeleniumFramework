package org.PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class SwitchAlertActions {
    WebDriver driver;

    SwitchTo switchTo;
    public SwitchAlertActions(WebDriver driver){
        this.driver = driver;
        switchTo = new SwitchTo(driver);
    }
    public void openUrl(String url) {
        this.driver.get(url);
    }
    public void clickAlertBox(){
        this.switchTo.getBtnDisplayAlertBox().click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void clickAlertBoxOkCancel(){
        this.switchTo.getAlertWithOkCancel().click();
        this.switchTo.getBtnDisplayConfirmBox().click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
    public void writeInPrompt(){
        this.switchTo.getAlertWithTextBox().click();
        this.switchTo.getBtnPromptBox().click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Lucho el aguilucho");
        alert.accept();
    }

}
