package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class Main extends BasePage {
    String SITE_URL_1 = "https://otus.home.kartushin.su/training.html";
    String SITE_URL_2 = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    public Main(WebDriver driver) {
        super(driver);
    }

    public Main goTo() {
        driver.get(SITE_URL_1);
        return this;
    }

    public Main goToOpensource() {
        driver.get(SITE_URL_2);
        return this;
    }

    public Main logIn() {
        WebElement name = driver.findElement(By.xpath("//input[@name='username']"));
        name.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();
        return this;


    }
}




