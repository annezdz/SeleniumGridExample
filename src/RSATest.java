import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RSATest {

    @Test
    public void homePageCheck() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
     //   capabilities.setBrowserName("firefox");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "firefox");
        // capabilities.setPlatform(Platform.VISTA);
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.4:4444"),capabilities);
        driver.get("http://www.rahulshetty.com");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
