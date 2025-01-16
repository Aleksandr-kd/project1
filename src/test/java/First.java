import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
    String SITE_URL = "https://mail.ru/";
    WebDriver driver;

    @BeforeEach
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Before each");
    }

    @AfterEach
    public void finish(){
        driver.quit();
    }

    @Test
    public void firstTest(){
        driver.get(SITE_URL);
    }

    @Test
    public void secondTest(){
        driver.get(SITE_URL);

    }
}
