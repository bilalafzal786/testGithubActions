package tasktracker.tests.login.homepage;

import com.base.BasePage;
import com.tasktracker.pages.homePage.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasktracker.base.BaseTest;

public class AddNewTaskTest extends BaseTest {
//    private HomePage homePage;
//    @BeforeClass
//    public void login() {
//        homePage = loginPage.logIntoApplication("bilaltest", "1234");
//    }

    @DataProvider(name = "AddTaskData")
    public Object[][] provideData() {
        return new Object[][] {
                {
                        "TestClient",
                        "T001",
                        "5",
                        "20",
                        "It is just for testing purposes",
                        "Daniyal, Moiz, Bilal",
                        "Help Desk",
                        "Calls",
                        "Just testing notes",
                        "Duration Period"
                },
                {
                        "TestClient",
                        "T002",
                        "5",
                        "20",
                        "It is just for testing purposes",
                        "Daniyal, Moiz, Bilal",
                        "Help Desk",
                        "Calls",
                        "Just testing notes",
                        "Duration Period"
                },
                {
                        "TestClient",
                        "T003",
                        "5",
                        "20",
                        "It is just for testing purposes",
                        "Daniyal, Moiz, Bilal",
                        "Help Desk",
                        "Calls",
                        "Just testing notes",
                        "Duration Period"
                }
        };
    }

    @Test(dataProvider = "AddTaskData")
    public void testNewTask(String clientGroup, String taskId, String timeHours, String timeMins, String taskDescription, String members, String activityType, String detailsDropdown, String notesField, String periodType) throws InterruptedException {
       Thread.sleep(5000);
        homePage.clickOnAddNewTaskButton();
        homePage.setClientGroupField(clientGroup);
        homePage.setTaskIdField(taskId);
        homePage.setTimeHours(timeHours);
        homePage.setTimeMinutes(timeMins);
        homePage.setTaskDescription(taskDescription);
        homePage.setTeamMembers(members);
        homePage.setActivityType(activityType);
        homePage.setDetailsDropdown(detailsDropdown);
        homePage.setNotesField(notesField);
        //homePage.setEndDateField("12-09-2025");
        homePage.setPeriodType(periodType);
        homePage.clickSubmit();


    }
}
