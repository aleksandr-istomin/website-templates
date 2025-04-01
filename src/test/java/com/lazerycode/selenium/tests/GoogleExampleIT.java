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

    @Test
    public void searchForMilk() throws Exception {
        // Устанавливаем системное свойство для GeckoDriver
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver"); // Укажите путь к geckodriver
        WebDriver driver = new FirefoxDriver();

        // Переходим на главную страницу вашего сайта
        driver.get("http://localhost");

        // Находим и кликаем по вкладке "Contact"
        WebElement contactTab = driver.findElement(By.linkText("Contact"))); // Замените на правильный селектор, если нужно
        contactTab.click();

        // Ожидаем, пока страница загрузится
        Thread.sleep(2000); // Лучше использовать WebDriverWait для ожидания

        // Проверяем, что на странице есть поле "Name"
        WebElement nameField = driver.findElement(By.name("Name")); // Замените на правильный селектор
        assertThat(nameField).isNotNull(); // Проверяем, что поле найдено

        // Закрываем драйвер
        driver.quit();
    }
}
