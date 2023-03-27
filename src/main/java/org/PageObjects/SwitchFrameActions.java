package org.PageObjects;

import org.openqa.selenium.WebDriver;

public class SwitchFrameActions {
    WebDriver driver;
    SwitchTo switchTo;
    public SwitchFrameActions(WebDriver driver){
        this.driver = driver;
        switchTo = new SwitchTo(driver);
    }
    public void openUrl(String url) {
        this.driver.get(url);
    }
    public void writeSingleFrame(){
        this.driver.switchTo().frame(this.switchTo.getSingleFrame());
        this.switchTo.getInputSingleFrame().click();
        this.switchTo.getInputSingleFrame().sendKeys("Julio el perro");
    }
    public void writeMultipleFrames(){
        this.switchTo.getSecondFrame().click();
        this.driver.switchTo().frame(this.switchTo.getMultipleFrames());
        this.driver.switchTo().frame(this.switchTo.getSingleMultipleFrames());
        this.switchTo.getInputSingleFrame().click();
        this.switchTo.getInputSingleFrame().sendKeys("Julio el perro");
    }
}
