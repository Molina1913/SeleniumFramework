package com.demo.automation.stepdefinitions;

import config.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.PageObjects.SignUpActionsFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePageStepDefinitions {

    @Given("user is on home page {string}")
    public void userIsOnHomePage(String string) {
        System.out.println(string);
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.get(string);

    }
    @Then("user should be on home page")
    public void userShouldBeOnHomePage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
