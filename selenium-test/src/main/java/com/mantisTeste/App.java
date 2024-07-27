package com.mantisTeste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
    public static void main(String[] args) {
        // Configura o driver do Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Abre o Google
        driver.get("https://www.google.com");

        // Realiza uma pesquisa
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("btnK")).click();

        // Fecha o navegador
        driver.quit();
    }
}
