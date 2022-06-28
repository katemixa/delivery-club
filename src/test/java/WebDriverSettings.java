import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public ChromeDriver webDriver;

    @Before
    public void setUp() {
        System.setProperty("webserver.chrome.driver", "C:\\Programs\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @After
    public void closeWebDriver() {
        webDriver.quit();
    }
}
