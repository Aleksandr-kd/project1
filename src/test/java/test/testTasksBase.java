package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import page.Main;
import page.testTask;

import java.time.Duration;


public class testTasksBase {

    public static ChromeOptions ChromeOptions;
    public WebDriver driver;
    public Main main;
    public testTask user;

    @BeforeEach
    public void initialization() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(true);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        main = PageFactory.initElements(driver, Main.class);
        user = PageFactory.initElements(driver, testTask.class);


    }

    @AfterEach
    public void finish() {
        driver.quit();
    }

}
