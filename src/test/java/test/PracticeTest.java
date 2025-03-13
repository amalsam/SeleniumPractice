package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.edgedriver().setup(); // Ensure WebDriver is set up properly
        driver = new EdgeDriver();
    }

    @Test
    public void testMethod() {
        driver.get("https://www.google.com"); // Correct URL format
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Ensures WebDriver closes after test execution
        }
    }
}
