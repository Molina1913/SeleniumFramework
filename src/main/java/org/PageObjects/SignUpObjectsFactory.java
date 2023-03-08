package org.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpObjectsFactory {
    WebDriver driver;

    public SignUpObjectsFactory(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@ng-model = 'FirstName']")
    private WebElement firstNameTextBox;
    @FindBy(xpath = "//input[@ng-model = 'LastName']")
    private WebElement lastNameTextBox;
    @FindBy(xpath = "//textarea[@ng-model = 'Adress']")
    private WebElement adress;
    @FindBy(xpath = "//input[@ng-model = 'EmailAdress']")
    private WebElement emailAdress;
    @FindBy(xpath = "//input[@ng-model = 'Phone']")
    private WebElement phone;
    @FindBy(xpath = "//input[@value = 'Male']")
    private WebElement inputMale;
    @FindBy(xpath = "//input[@value = 'FeMale']")
    private WebElement inputFemale;
    @FindBy(xpath = "//input[@value = 'Cricket']")
    private WebElement checkboxCricket;
    @FindBy(xpath = "//input[@value = 'Movies']")
    private WebElement checkboxMovies;
    @FindBy(xpath = "//input[@value = 'Hockey']")
    private WebElement checkboxHockey;
    @FindBy(xpath = "//div[@id='msdd']")
    private WebElement selectLanguagesList;
    @FindBy(xpath = "//select[@ng-model = 'Skill']")
    private WebElement skillsSelect;
    @FindBy(xpath = "//select[@ng-model = 'country']")
    private WebElement countrySelect;
    @FindBy(xpath = "//select[@ng-model = 'yearbox']")
    private WebElement yearDateOfBirthSelect;
    @FindBy(xpath = "//select[@ng-model = 'monthbox']")
    private WebElement monthDateOfBirthSelect;
    @FindBy(xpath = "//select[@ng-model = 'daybox']")
    private WebElement dayDateOfBirthSelect;
    @FindBy(xpath = "//input[@ng-model = 'Password']")
    private WebElement password;
    @FindBy(xpath = "//input[@ng-model = 'CPassword']")
    private WebElement confirmPassword;
    @FindBy(xpath = "//button[@id = 'submitbtn']")
    private WebElement submitButton;
    @FindBy(xpath = "//button[@id = 'Button1']")
    private WebElement refreshButton;

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getFirstNameTextBox() {
        return firstNameTextBox;
    }

    public WebElement getLastNameTextBox() {
        return lastNameTextBox;
    }

    public WebElement getAdress() {
        return adress;
    }

    public WebElement getEmailAdress() {
        return emailAdress;
    }

    public WebElement getPhone() {
        return phone;
    }

    public WebElement getInputMale() {
        return inputMale;
    }

    public WebElement getInputFemale() {
        return inputFemale;
    }

    public WebElement getCheckboxCricket() {
        return checkboxCricket;
    }

    public WebElement getCheckboxMovies() {
        return checkboxMovies;
    }

    public WebElement getCheckboxHockey() {
        return checkboxHockey;
    }

    public WebElement getSelectLanguagesList() {
        return selectLanguagesList;
    }

    public WebElement getSkillsSelect() {
        return skillsSelect;
    }

    public WebElement getCountrySelect() {
        return countrySelect;
    }

    public WebElement getYearDateOfBirthSelect() {
        return yearDateOfBirthSelect;
    }

    public WebElement getMonthDateOfBirthSelect() {
        return monthDateOfBirthSelect;
    }

    public WebElement getDayDateOfBirthSelect() {
        return dayDateOfBirthSelect;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getConfirmPassword() {
        return confirmPassword;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getRefreshButton() {
        return refreshButton;
    }
}
