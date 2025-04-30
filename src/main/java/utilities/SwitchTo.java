package utilities;

import org.openqa.selenium.WebDriver;

public class SwitchTo extends Utility{

    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    public static void acceptAlert() {
        switchTo().alert().accept();
    }
}
