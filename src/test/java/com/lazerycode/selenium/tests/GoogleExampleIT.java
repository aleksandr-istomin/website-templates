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
        options.addArguments("--headless");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://localhost");  //переходим на страницу
        String title = driver.getTitle();
        assertThat(title).contains("Restaurant");  //проверяем название страницы на содержание слова "Restaurant"
        
        driver.quit();  //закрываем драйвер
    }

    @Test
    public void searchForMilk() throws Exception {
        // Устанавливаем системное свойство для GeckoDriver
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver"); // Укажите путь к geckodriver
        WebDriver driver = new FirefoxDriver();

        // Переходим на главную страницу вашего сайта
        driver.get("http://localhost:80");

        // Находим поле поиска и вводим "Milk"
        WebElement searchBox = driver.findElement(By.name("search")); // Замените на правильный селектор
        searchBox.sendKeys("Milk");
        searchBox.submit();

        // Ожидаем, пока заголовок страницы изменится
        Thread.sleep(2000); // Лучше использовать WebDriverWait для ожидания

        // Проверяем, что заголовок страницы содержит "Milk"
        String title = driver.getTitle();
        assertThat(title).contains("Milk");

        // Закрываем драйвер
        driver.quit();
    }
}
