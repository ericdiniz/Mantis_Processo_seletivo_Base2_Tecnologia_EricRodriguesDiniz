package com.mantisTeste;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class AppTest {

    @Test
    public void testGoogleSearch() {
        // Cria uma instância do HTMLUnitDriver
        WebDriver driver = new HtmlUnitDriver();

        try {
            driver.get("https://www.google.com");
            driver.findElement(By.name("q")).sendKeys("Selenium");
            driver.findElement(By.name("btnK")).click();
            // Adicione verificações para o seu teste aqui
        } finally {
            driver.quit();
        }
    }
}
