package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    private By usernameInputField = By.id("user-name");
    private By passwordInputField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("[data-test=\"error\"]");

    public LoginPage (WebDriver driver){
    super(driver);
    }

    public void validLoginAction(){
    driver.findElement(usernameInputField).sendKeys("standard_user");
    driver.findElement(passwordInputField).sendKeys("secret_sauce");
    driver.findElement(loginButton).click();
    }











}
