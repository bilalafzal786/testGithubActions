package tasktracker.tests.login.homepage;

import org.testng.annotations.Test;
import tasktracker.base.BaseTest;

public class EditTask extends BaseTest {

    @Test
    public void editTask() throws InterruptedException {
//        var homePage = loginPage.logIntoApplication("bilaltest", "1234");
        Thread.sleep(5000);
        homePage.editTask("T002", "8");

    }
}
