package org.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpActionsFactory {
    WebDriver webDriver;
    SignUpObjectsFactory signUpObjectsFactory;
    public SignUpActionsFactory(WebDriver webDriver){
        this.webDriver = webDriver;
        signUpObjectsFactory = new SignUpObjectsFactory(webDriver);
    }
    public void openUrl(String url) {
        this.webDriver.get(url);
    }
    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) this.webDriver;
        js.executeScript("window.scrollBy(0,450)", "");
    }

    public void writeFirstName(String firstName) {
        this.signUpObjectsFactory.getFirstNameTextBox().;
    }

    public void writeLastName(String lastName) {
        this.webDriver.findElement(this.lastNameTextBox).sendKeys(lastName);
    }

    public void writeAdress(String adress) {
        this.webDriver.findElement(this.adress).sendKeys(adress);
    }

    public void writeEmailAdress(String emailAdress) {
        this.webDriver.findElement(this.emailAdress).sendKeys(emailAdress);
    }

    public void phone(String phone) {
        this.webDriver.findElement(this.phone).sendKeys(phone);
    }

    public void selectRadioButtonMale() {
        this.webDriver.findElement(this.inputMale).click();
    }

    public void selectRadioButtonFemale() {
        this.webDriver.findElement(this.inputFemale).click();
    }

    public void selectCheckBoxCricket() {
        this.webDriver.findElement(this.checkboxCricket).click();
    }

    public void selectCheckBoxMovies() {
        this.webDriver.findElement(this.checkboxMovies).click();
    }

    public void selectCheckboxHockey() {
        this.webDriver.findElement(this.checkboxHockey).click();
    }

    public void selectLanguage(String language, WebDriver driver) {
        new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(this.selectLanguagesList));
        driver.findElement(this.selectLanguagesList).click();
        driver.findElement(By.xpath("//li/a[text()='" + language + "']")).click();
    }

    public void selectSkills(String skillSelect) {
        Select select = new Select(this.webDriver.findElement(this.skillsSelect));
        select.selectByValue(skillSelect);
    }

    public void selectCountry(int index) {
        new Select(this.webDriver.findElement(this.countrySelect)).selectByIndex(index);
    }

    public void selectYearDateOfBirth(String year) {
        new Select(this.webDriver.findElement(this.yearDateOfBirthSelect)).selectByValue(year);
    }

    public void selectMonthDateOfBirth(String month) {
        new Select(this.webDriver.findElement(this.monthDateOfBirthSelect)).selectByValue(month);
    }

    public void selectDayDateOfBirth(String day) {
        new Select(this.webDriver.findElement(this.dayDateOfBirthSelect)).selectByValue(day);
    }

    public void writePassword(String password) {
        this.webDriver.findElement(this.password).sendKeys(password);
    }

    public void writeConfirmPassword(String confirmPassword) {
        this.webDriver.findElement(this.confirmPassword).sendKeys(confirmPassword);
    }

    public void clickSubmitButton() {
        this.webDriver.findElement(this.submitButton).click();
    }

}
}
