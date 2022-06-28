import org.junit.Assert;
import org.junit.Test;

public class DelivioTest extends WebDriverSettings {

    @Test
    public void openSite() {
        webDriver.get("https://delivio.by/");
        String title = webDriver.getTitle();
        Assert.assertEquals("Деливио", title);
    }

}
