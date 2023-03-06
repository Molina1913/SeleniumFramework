package StepDefinitions;

import org.PageObjects.SetUp;
import org.PageObjects.SignUpPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUpPageSteps {


    @Test
    public void signUpTest() {
        WebDriver driver = SetUp.InitializeChromeDriver();
        SignUpPageObjects signUpPageObjects = new SignUpPageObjects(driver);
        signUpPageObjects.openUrl("https://demo.automationtesting.in/Register.html");
        signUpPageObjects.writeFirstName("Luis");
        signUpPageObjects.writeLastName("Molina");
        signUpPageObjects.writeAdress("avenida siempre viva");
        signUpPageObjects.writeEmailAdress("ccc@lml.com");
        signUpPageObjects.selectRadioButtonMale();
        signUpPageObjects.phone("323333333");
        signUpPageObjects.selectCheckBoxCricket();
        signUpPageObjects.selectLanguage("Arabic", driver);
        signUpPageObjects.selectSkills("Java");
        signUpPageObjects.selectCountry(0);
        signUpPageObjects.selectYearDateOfBirth("1996");
        signUpPageObjects.selectMonthDateOfBirth("December");
        signUpPageObjects.selectDayDateOfBirth("14");
        signUpPageObjects.writePassword("jkfdsfbksa");
        signUpPageObjects.writeConfirmPassword("jkfdsfbksa");
        signUpPageObjects.clickSubmitButton();
        driver.close();


    }
}
