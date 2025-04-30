package com.tasktracker.pages;

import com.base.BasePage;
import com.tasktracker.pages.homePage.HomePage;
import org.openqa.selenium.By;

import static utilities.WaitUtility.explicitWaitUntilVisible;

public class LoginPage extends BasePage {
    private By userNameField = By.id("user_id");
    private By passwordField = By.id("password");
    private By submitButton = By.xpath("//button[@type='submit']");
    private By alert = By.xpath("//div[@role='alert']");
    public void setUserNameField(String userName) {
        set(userNameField, userName);
    }

    public void setPasswordField(String password) {
        set(passwordField, password);
    }

    public HomePage clickLoginButton() {
        click(submitButton);
        return new HomePage();
    }

    public String getAlertText() {
        explicitWaitUntilVisible(5, alert);
       return find(alert).getText();
    }

    public HomePage logIntoApplication(String username, String password) {
        setUserNameField(username);
        setPasswordField(password);
        return clickLoginButton();
    }
}
