package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTests {
    protected static WebDriver driver;
    private By usernameInputField = By.id("user-name");
    private By passwordInputField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("[data-test=\"error\"]");

    @BeforeClass
    public static void beforeClass() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//        max time to wait for a page load
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
//        max time for asynchronous JS run
    }

    @Before
    public void setUp() throws Exception {
    driver.get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown() throws Exception {
    driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void afterClass() throws Exception {
        driver.quit();
    }
}


