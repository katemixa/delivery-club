import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelivioTest {
    @Test
    public void openSite() {
        System.setProperty("webserver.chrome.driver", "C:\\Programs\\chromedriver.exe");
        ChromeDriver webDriver = new ChromeDriver();
        webDriver.get("https://delivio.by/");
        String title = webDriver.getTitle();
        Assert.assertEquals("Деливио",title);
        webDriver.quit();
    }

}
