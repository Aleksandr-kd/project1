package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskOne extends BasePage {
    public TaskOne(WebDriver driver) {
        super(driver);
    }

    public void checkPageIsCorrect() {
        isElementDisplayed(By.xpath("//div[@id='app']/div/div[3]/div/div/div[2]/div/div/div/h1"));

//        isElementDisplayed(By.xpath("//img[@alt='logo-project-name']"));
//        driver.findElement(By.cssSelector("a.b1p9g6pp.sozteyz > svg > path")).click();
    }
}
