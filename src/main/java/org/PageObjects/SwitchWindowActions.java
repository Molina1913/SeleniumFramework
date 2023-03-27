package org.PageObjects;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class SwitchWindowActions {
    WebDriver driver;
    SwitchTo switchTo;
    public SwitchWindowActions(WebDriver driver){
        this.driver = driver;
        switchTo = new SwitchTo(driver);
    }
    public void openUrl(String url) {
        this.driver.get(url);
    }
    public void openTabbedWindow(){
        this.switchTo.getBtnTabbedWindow().click();
        String currentHandle = driver.getWindowHandle();
        for (String winHandle: driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

    }
    public void openSepareteWindow(){
        this.switchTo.getSeperateWindow().click();
        this.switchTo.getBtnSeperateWindow().click();
        String currentHandle = driver.getWindowHandle();
        Set<String> allHandles = driver.getWindowHandles();
        for (String windowHandles:allHandles) {
            if(!currentHandle.equalsIgnoreCase(windowHandles)){
                driver.switchTo().window(windowHandles);
            }
            
        }

    }
    public void openMultipleWindow(String emailId){
        this.switchTo.getMultipleWindow().click();
        this.switchTo.getBtnMultipleWindow().click();
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> iterate = allWindows.iterator();
        String parentWindow = iterate.next();
        String childWindow = iterate.next();
        String childWindow2 = iterate.next();
        driver.switchTo().window(childWindow2);
        this.switchTo.getEmailId().sendKeys(emailId);
        this.switchTo.getBtnEmailId().click();

    }

}
