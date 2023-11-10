package com.winjigo.driver;

import com.winjigo.utilities.PropertiesConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.IOException;

public class WebDriverHandler {
    private static WebDriver webDriver;
    private String driverType = "driverType";
    public WebDriverHandler() throws IOException { getDriverType(); }

    private void getDriverType() throws IOException {
        String browserType = "resources/config/config.properties";
        PropertiesConfig configBrowser = new PropertiesConfig(browserType);
        driverType = configBrowser.getProperty(driverType);

        switch (driverType) {
            case "chrome":
                ChromeOptions chromeCapabilities = new ChromeOptions();
                webDriver = new ChromeDriver(chromeCapabilities);
                break;

            case "edge":
                EdgeOptions edgeCapabilities = new EdgeOptions();
                webDriver = new EdgeDriver(edgeCapabilities);
                break;
        }

    }
    public static WebDriver getWebDriver() { return webDriver; }
    public void navigateTo(String link) { webDriver.navigate().to(link); }
    public void maximizeWindow() { webDriver.manage().window().maximize(); }
    public void close() { webDriver.quit(); }
}
