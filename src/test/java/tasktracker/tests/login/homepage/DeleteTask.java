package tasktracker.tests.login.homepage;

import com.base.BasePage;
import org.testng.annotations.Test;
import tasktracker.base.BaseTest;

public class DeleteTask extends BaseTest {

    @Test
    public void deleteTask () throws InterruptedException {
//        var homePage = loginPage.logIntoApplication("bilaltest", "1234");
        Thread.sleep(5000);
        homePage.deleteTask("T002");

    }
}
