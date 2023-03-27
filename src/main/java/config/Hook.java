package config;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hook {
    public static WebDriver driver;
    @Before
    public static void initializeTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        driver = new ChromeDriver(options);
    }
    @After
    public static void closeDriver(){
        if(driver != null ){
            driver.quit();
        }
    }
}
