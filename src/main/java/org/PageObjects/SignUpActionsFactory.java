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
        this.signUpObjectsFactory.getFirstNameTextBox().sendKeys(firstName);
    }

    public void writeLastName(String lastName) {
        this.signUpObjectsFactory.getLastNameTextBox().sendKeys(lastName);
    }

    public void writeAdress(String adress) {
        this.signUpObjectsFactory.getAdress().sendKeys(adress);
    }

    public void writeEmailAdress(String emailAdress) {
        this.signUpObjectsFactory.getEmailAdress().sendKeys(emailAdress);
    }

    public void phone(String phone) {
        this.signUpObjectsFactory.getPhone().sendKeys(phone);
    }

    public void selectRadioButtonMale() {
        this.signUpObjectsFactory.getInputMale().click();
    }

    public void selectRadioButtonFemale() {
        this.signUpObjectsFactory.getInputFemale().click();
    }

    public void selectCheckBoxCricket() {
        this.signUpObjectsFactory.getCheckboxCricket().click();
    }

    public void selectCheckBoxMovies() {
        this.signUpObjectsFactory.getCheckboxMovies().click();
    }

    public void selectCheckboxHockey() {
        this.signUpObjectsFactory.getCheckboxHockey().click();
    }

    public void selectLanguage(String language, WebDriver driver) {
        new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(this.signUpObjectsFactory.getSelectLanguagesList()));
        this.signUpObjectsFactory.getSelectLanguagesList().click();
        driver.findElement(By.xpath("//li/a[text()='" + language + "']")).click();
    }

    public void selectSkills(String skillSelect) {
        Select select = new Select(this.signUpObjectsFactory.getSkillsSelect());
        select.selectByValue(skillSelect);
    }

    public void selectCountry(int index) {
        new Select(this.signUpObjectsFactory.getCountrySelect()).selectByIndex(index);
    }

    public void selectYearDateOfBirth(String year) {
        new Select(this.signUpObjectsFactory.getYearDateOfBirthSelect()).selectByValue(year);
    }

    public void selectMonthDateOfBirth(String month) {
        new Select(this.signUpObjectsFactory.getMonthDateOfBirthSelect()).selectByValue(month);
    }

    public void selectDayDateOfBirth(String day) {
        new Select(this.signUpObjectsFactory.getDayDateOfBirthSelect()).selectByValue(day);
    }

    public void writePassword(String password) {
        this.signUpObjectsFactory.getPassword().sendKeys(password);
    }

    public void writeConfirmPassword(String confirmPassword) {
        this.signUpObjectsFactory.getConfirmPassword().sendKeys(confirmPassword);
    }

    public void clickSubmitButton() {
        this.signUpObjectsFactory.getSubmitButton().click();
    }

}

