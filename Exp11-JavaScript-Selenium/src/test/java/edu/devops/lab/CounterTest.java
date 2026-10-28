package edu.devops.lab;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CounterTest {
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
    void incrementAndResetWork() throws Exception {
        Path html = Paths.get("counter.html").toAbsolutePath();
        driver.get(html.toUri().toString());
        assertEquals("0", driver.findElement(By.id("count")).getText());
        driver.findElement(By.id("increment")).click();
        driver.findElement(By.id("increment")).click();
        assertEquals("2", driver.findElement(By.id("count")).getText());
        driver.findElement(By.id("reset")).click();
        assertEquals("0", driver.findElement(By.id("count")).getText());
    }
}
