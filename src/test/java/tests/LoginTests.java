package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTests extends BaseTests {

    private By usernameInputField = By.id("user-name");
    private By passwordInputField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("[data-test=\"error\"]");
    private By heading = By.xpath("//*[@class=\"inventory_item_name \"]");

    @Test
    public void validLoginAction() {
       driver.findElement(usernameInputField).sendKeys("standard_user");
       driver.findElement(passwordInputField).sendKeys("secret_sauce");
       driver.findElement(loginButton).click();

        driver.findElement(heading).isDisplayed();
    }


    @Test
    public void blankInputFieldAction() {
        driver.findElement(usernameInputField).sendKeys("");
        driver.findElement(passwordInputField).sendKeys("");
        driver.findElement(loginButton).click();

        driver.findElement(errorMessage).isDisplayed();
    }
    @Test
    public void blankInputFieldAction1234() {
        driver.findElement(usernameInputField).sendKeys("");
        driver.findElement(passwordInputField).sendKeys("");
        driver.findElement(loginButton).click();

        driver.findElement(errorMessage).isDisplayed();
    }
    @Test
    public void blankInputFieldAction123456789() {
        driver.findElement(usernameInputField).sendKeys("");
        driver.findElement(passwordInputField).sendKeys("");
        driver.findElement(loginButton).click();

        driver.findElement(errorMessage).isDisplayed();
    }
    @Test
    public void blankInputFieldAction1234567213189() {
        driver.findElement(usernameInputField).sendKeys("");
        driver.findElement(passwordInputField).sendKeys("");
        driver.findElement(loginButton).click();

        driver.findElement(errorMessage).isDisplayed();}

    @Test
    public void blankInputFieldAction121121313456789() {
        driver.findElement(usernameInputField).sendKeys("");
        driver.findElement(passwordInputField).sendKeys("");
        driver.findElement(loginButton).click();

        driver.findElement(errorMessage).isDisplayed();
    }
    @Test
    public void blankInputFieldAction121121312313123123456789() {
        driver.findElement(usernameInputField).sendKeys("");
        driver.findElement(passwordInputField).sendKeys("");
        driver.findElement(loginButton).click();

        driver.findElement(errorMessage).isDisplayed();
    }

}
