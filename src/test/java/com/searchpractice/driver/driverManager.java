package com.searchpractice.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class driverManager {
    public static WebDriver driver;

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.argos.co.uk");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.quit();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void handleCookies() {
        driver.findElement(By.linkText("GOT IT")).click();
    }

}

