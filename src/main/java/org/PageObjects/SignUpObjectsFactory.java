package org.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpObjectsFactory {
    WebDriver driver;

    public SignUpObjectsFactory(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@ng-model = 'FirstName']")
    private WebDriver firstNameTextBox;
    @FindBy(xpath = "//input[@ng-model = 'LastName']")
    private WebDriver lastNameTextBox;
    @FindBy(xpath = "//textarea[@ng-model = 'Adress']")
    private WebDriver adress;
    @FindBy(xpath = "//input[@ng-model = 'EmailAdress']")
    private WebDriver emailAdress;
    @FindBy(xpath = "//input[@ng-model = 'Phone']")
    private WebDriver phone;
    @FindBy(xpath = "//input[@value = 'Male']")
    private WebDriver inputMale;
    @FindBy(xpath = "//input[@value = 'FeMale']")
    private WebDriver inputFemale;
    @FindBy(xpath = "//input[@value = 'Cricket']")
    private WebDriver checkboxCricket;
    @FindBy(xpath = "//input[@value = 'Movies']")
    private WebDriver checkboxMovies;
    @FindBy(xpath = "//input[@value = 'Hockey']")
    private WebDriver checkboxHockey;
    @FindBy(xpath = "//div[@id='msdd']")
    private WebDriver selectLanguagesList;
    @FindBy(xpath = "//select[@ng-model = 'Skill']")
    private WebDriver skillsSelect;
    @FindBy(xpath = "//select[@ng-model = 'country']")
    private WebDriver countrySelect;
    @FindBy(xpath = "//select[@ng-model = 'yearbox']")
    private WebDriver yearDateOfBirthSelect;
    @FindBy(xpath = "//select[@ng-model = 'monthbox']")
    private WebDriver monthDateOfBirthSelect;
    @FindBy(xpath = "//select[@ng-model = 'daybox']")
    private WebDriver dayDateOfBirthSelect;
    @FindBy(xpath = "//input[@ng-model = 'Password']")
    private WebDriver password;
    @FindBy(xpath = "//input[@ng-model = 'CPassword']")
    private WebDriver confirmPassword;
    @FindBy(xpath = "//button[@id = 'submitbtn']")
    private WebDriver submitButton;
    @FindBy(xpath = "//button[@id = 'Button1']")
    private WebDriver refreshButton;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriver getFirstNameTextBox() {
        return firstNameTextBox;
    }

    public WebDriver getLastNameTextBox() {
        return lastNameTextBox;
    }

    public WebDriver getAdress() {
        return adress;
    }

    public WebDriver getEmailAdress() {
        return emailAdress;
    }

    public WebDriver getPhone() {
        return phone;
    }

    public WebDriver getInputMale() {
        return inputMale;
    }

    public WebDriver getInputFemale() {
        return inputFemale;
    }

    public WebDriver getCheckboxCricket() {
        return checkboxCricket;
    }

    public WebDriver getCheckboxMovies() {
        return checkboxMovies;
    }

    public WebDriver getCheckboxHockey() {
        return checkboxHockey;
    }

    public WebDriver getSelectLanguagesList() {
        return selectLanguagesList;
    }

    public WebDriver getSkillsSelect() {
        return skillsSelect;
    }

    public WebDriver getCountrySelect() {
        return countrySelect;
    }

    public WebDriver getYearDateOfBirthSelect() {
        return yearDateOfBirthSelect;
    }

    public WebDriver getMonthDateOfBirthSelect() {
        return monthDateOfBirthSelect;
    }

    public WebDriver getDayDateOfBirthSelect() {
        return dayDateOfBirthSelect;
    }

    public WebDriver getPassword() {
        return password;
    }

    public WebDriver getConfirmPassword() {
        return confirmPassword;
    }

    public WebDriver getSubmitButton() {
        return submitButton;
    }

    public WebDriver getRefreshButton() {
        return refreshButton;
    }
}
