package org.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class SignUpPageObjects {


    private WebDriver webDriver = new ChromeDriver();
    public WebDriverWait wait = new WebDriverWait(webDriver, 20);
    private By firstNameTextBox = By.xpath("//input[@ng-model = 'FirstName']");
    private By lastNameTextBox = By.xpath("//input[@ng-model = 'LastName']");
    private By adress = By.xpath("//textarea[@ng-model = 'Adress']");
    private By emailAdress = By.xpath("//input[@ng-model = 'EmailAdress']");
    private By phone = By.xpath("//input[@ng-model = 'Phone']");
    private By inputMale = By.xpath("//input[@value = 'Male']");
    private By inputFemale = By.xpath("//input[@value = 'FeMale']");
    private By checkboxCricket = By.xpath("//input[@value = 'Cricket']");
    private By checkboxMovies = By.xpath("//input[@value = 'Movies']");
    private By checkboxHockey = By.xpath("//input[@value = 'Hockey']");
    private By selectLanguagesList = By.xpath("//div[@id='msdd']");
    private By skillsSelect = By.xpath("//select[@ng-model = 'Skill']");
    private By countrySelect = By.xpath("//select[@ng-model = 'country']");
    private By yearDateOfBirthSelect = By.xpath("//select[@ng-model = 'yearbox']");
    private By monthDateOfBirthSelect = By.xpath("//select[@ng-model = 'monthbox']");
    private By dayDateOfBirthSelect = By.xpath("//select[@ng-model = 'daybox']");
    private By password = By.xpath("//input[@ng-model = 'Password']");
    private By confirmPassword = By.xpath("//input[@ng-model = 'CPassword']");
    private By submitButton = By.xpath("//button[@id = 'submitbtn']");
    private By refreshButton = By.xpath("//button[@id = 'Button1']");

    public SignUpPageObjects(WebDriver webDriver) {

        this.webDriver = webDriver;
    }

    public void openUrl(String url) {
        this.webDriver.get(url);
    }

    public void writeFirstName(String firstName) {
        this.webDriver.findElement(this.firstNameTextBox).sendKeys(firstName);
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

    public void selectLanguage(String language) {
        wait.until(ExpectedConditions.elementToBeClickable(this.selectLanguagesList));
        this.webDriver.findElement(this.selectLanguagesList).click();
        this.webDriver.findElement(By.xpath("//li/a[text()='"+ language+"']")).click();
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
    public void clickSubmitButton(){
        this.webDriver.findElement(this.submitButton).click();
    }

}
