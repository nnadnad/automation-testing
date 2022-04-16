package driver;

import io.appium.java_client.android.AndroidDriver;
import lombok.SneakyThrows;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;

public class MobileDriver implements DriverSource {
    @SneakyThrows
    @Override
    public WebDriver newDriver() {
        try {
            EnvironmentVariables properties = SystemEnvironmentVariables.createEnvironmentVariables();
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appium:automationName", "uiautomator2");
            capabilities.setCapability("appium:udid", properties.getProperty("udid"));
            capabilities.setCapability("appPackage", "com.traveloka.android");
            capabilities.setCapability("appActivity", "com.traveloka.android.appentry.splash.SplashActivity");
            capabilities.setCapability("unicodeKeyboard", "true");
            capabilities.setCapability("resetKeyboard", "true");
            return new AndroidDriver(new URL(properties.getProperty("endpoint")), capabilities);
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
