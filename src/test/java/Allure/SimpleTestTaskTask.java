package Allure;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTestTaskTask {
    final String SITE_URL = "https://opensource-demo.orangehrmlive.com";
    WebDriver driver;

    @BeforeEach
    public void start(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(true);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get(SITE_URL);
    }

    @AfterEach
    public void finish() {
        driver.quit();
    }

    @Attachment(value = "Failed test screenshot")
    public byte[] attachScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

//    @ExtendWith(AllureJunit5.class)
    @Epic("TESTING FOR https://opensource-demo.orangehrmlive.com")
    @Feature(value = "Log In")
    @Severity(SeverityLevel.BLOCKER)
    @Description("In this test we will login with correct credentials. When we logged we see link for file.")
    @Story(value = "Test for login with correct credentials")
    @DisplayName("Проверка входа коротко")
    @Test
    public void testSixCheckLoginWithCorrectCredentials(){
        fillInLogin("Admin");
        fillInPassword("admin123");
        loginButtonClick();
        isLoginUnsuccessful();
    }

    @Epic("TESTING FOR https://opensource-demo.orangehrmlive.com")
    @Feature(value = "Log In")
    @Severity(SeverityLevel.MINOR)
    @Description("In this test we will login with correct credentials. When we logged we see link for file.")
    @Story(value = "Test for login with incorrect credentials")

    @Issue(value = "Tel 123")
    @Link(name = "Погода", url = "https://opensource-demo.orangehrmlive.com")
    @Owner(value = "Ivanov")
    @DisplayName("Проверка входа")
    @Test
    public void testSixCheckLoginWithIncorrectCredentials(){
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        assertTrue(driver.findElements(By.linkText("//h6[text()='Dashboard']")).isEmpty());
    }

    @Step(value = "Fill in login with {0}")
    public void fillInLogin(String login){
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys(login);
    }

    @Step(value = "Fill in password with {0}")
    public void fillInPassword(String password){
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
    }

    @Step(value = "Click button Login")
    public void loginButtonClick(){
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Step(value = "Login was successful")
    public void isLoginSuccessful(){
        assertTrue(driver.findElement(By.linkText("Dashboard")).isDisplayed());
    }
    @Step(value = "Login was unsuccessful")
    public void isLoginUnsuccessful(){
        assertFalse(driver.findElements(By.linkText("//h6[text()='Dashboard']")).isEmpty());
    }
}