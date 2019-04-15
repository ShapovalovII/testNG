import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTest {


    public ChromeDriver chromeDriver;

    @BeforeTest
    public void sitUp() {
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void exampleTest() throws InterruptedException {
        chromeDriver.get("https://accounts.google.com");
        Thread.sleep(1000);
    }

    @AfterTest
    public void close() {
        chromeDriver.quit();
    }
}
