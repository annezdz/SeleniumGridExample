import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleTest {

    @Test
    public void homePageCheck() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
       // capabilities.setPlatform(Platform.VISTA);
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.4:4444"),capabilities);
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("anne z d z");
        driver.close();
    }

}
