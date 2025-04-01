package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.DriverBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GoogleExampleIT extends DriverBase {

    @Test
    public void searchForCheese() throws Exception {
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        WebDriver driver = new FirefoxDriver();

        driver.get("http://localhost");  //переходим на страницу
        String title = driver.getTitle();
        assertThat(title).contains("Restaurant");  //проверяем название страницы на содержание слова "Restaurant"
        
        driver.quit();  //закрываем драйвер
    }
}
