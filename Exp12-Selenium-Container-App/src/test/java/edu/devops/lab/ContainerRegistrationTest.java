package edu.devops.lab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainerRegistrationTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new", "--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
    }

    @AfterEach
    void tearDown() {
        if (driver != null) driver.quit();
    }

    @Test
    void registrationAppRespondsFromContainer() {
        String baseUrl = System.getProperty("app.url", "http://localhost:5000");
        driver.get(baseUrl);
        assertTrue(driver.getTitle().contains("Event Registration"));
        driver.findElement(By.name("name")).sendKeys("Selenium Student");
        driver.findElement(By.name("email")).sendKeys("student@example.com");
        driver.findElement(By.name("event")).sendKeys("Hackathon");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        assertTrue(driver.getPageSource().contains("Registration successful"));
    }
}
