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

class LocalPageTest {
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
    void pageButtonChangesHeading() throws Exception {
        Path html = Paths.get("src/test/resources/sample.html").toAbsolutePath();
        driver.get(html.toUri().toString());
        assertEquals("Selenium is running", driver.findElement(By.id("heading")).getText());
        driver.findElement(By.id("change")).click();
        assertEquals("Button clicked", driver.findElement(By.id("heading")).getText());
    }
}
