import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTest {

    public WebDriver driver;

    @BeforeTest
    public void sitUp() {
        driver = new TrueAutomationDriver();
    }

    @Test
    public void exampleTest() throws InterruptedException {
        driver.get("https://accounts.google.com");
        Thread.sleep(1000);
    }

    @AfterTest
    public void close() {
        driver.quit();
    }
}
