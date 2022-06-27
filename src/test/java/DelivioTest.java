import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelivioTest {
    public ChromeDriver webDriver;

    @Before
    public void setUp() {
        System.setProperty("webserver.chrome.driver", "C:\\Programs\\chromedriver.exe");
        webDriver = new ChromeDriver();
        System.out.println("WebDriver start");
    }

    @Test
    public void openSite() {
        webDriver.get("https://delivio.by/");
        String title = webDriver.getTitle();
        Assert.assertEquals("Деливио", title);
    }

    @After
    public void closeWebDriver() {
        webDriver.quit();
        System.out.println("WebDriver close");
    }

}
