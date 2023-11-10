package com.winjigo.browser;

import com.winjigo.Winjigo;
import com.winjigo.driver.WebDriverHandler;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Browser {
    private final WebDriver webDriver = WebDriverHandler.getWebDriver();
    public Winjigo winjigo;

    public Browser() {
        winjigo = new Winjigo();
    }

}
