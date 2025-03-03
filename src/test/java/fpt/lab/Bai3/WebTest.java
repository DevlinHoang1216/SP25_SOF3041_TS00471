package fpt.lab.Bai3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;
public class WebTest {

    ChromeDriver driver;
    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void test() {
        driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
        inputEmail.sendKeys("hoangsubi1606@gmail.com");

        WebElement inputPass = driver.findElement(By.xpath("//input[@id='password']"));
        inputPass.sendKeys("HoángubiTS00471");

        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='login']"));
        inputUsername.sendKeys("HoangVanKiet");

        WebElement clickContinue = driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
        clickContinue.click();
    }

}