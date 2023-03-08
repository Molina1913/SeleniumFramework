package StepDefinitions;

import org.PageObjects.SetUp;
import org.PageObjects.SignUpActionsFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SignUpPageStepsFactory {
    @Test
    public void signUpTest(){
        WebDriver driver = SetUp.InitializeChromeDriver();
        SignUpActionsFactory signUpActionsFactory = new SignUpActionsFactory(driver);
        signUpActionsFactory.openUrl("https://demo.automationtesting.in/Register.html");
        signUpActionsFactory.writeFirstName("Eric");
        signUpActionsFactory.writeLastName("Cartman");
        signUpActionsFactory.writeAdress("south park");
        signUpActionsFactory.writeEmailAdress("lml@com.com");
        signUpActionsFactory.phone("3126943703");
        signUpActionsFactory.selectRadioButtonMale();
        signUpActionsFactory.selectCheckboxHockey();
        signUpActionsFactory.selectCheckBoxMovies();
        signUpActionsFactory.scroll();
        signUpActionsFactory.selectLanguage("Arabic", driver);
        signUpActionsFactory.selectYearDateOfBirth("1996");
        signUpActionsFactory.selectMonthDateOfBirth("December");
        signUpActionsFactory.selectDayDateOfBirth("14");
        signUpActionsFactory.writePassword("qwerty");
        signUpActionsFactory.writeConfirmPassword("qwerty");
        signUpActionsFactory.clickSubmitButton();
        driver.close();






    }

}
