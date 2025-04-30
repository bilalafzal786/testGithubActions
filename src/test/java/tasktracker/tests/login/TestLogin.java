package tasktracker.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import tasktracker.base.BaseTest;

import static utilities.WaitUtility.explicitWaitUntilVisible;

public class TestLogin extends BaseTest {

    @Test
    public void testInvalidLogin() {
        loginPage.setUserNameField("abc");
        loginPage.setPasswordField("123");
        loginPage.clickLoginButton();
        String actualText = loginPage.getAlertText();
        String expectedText = "An error occurred";
        Assert.assertEquals(actualText, expectedText, "\n Expected and actual result to not match \n");

    }

    @Test
    public void testvalidLogin() {
        loginPage.setUserNameField("bilaltest");
        loginPage.setPasswordField("1234");
        loginPage.clickLoginButton();
        String actualText = loginPage.getAlertText();
        String expectedText = "Login successful";
        Assert.assertEquals(actualText, expectedText, "\n Expected and actual result to not match \n");

    }
}
