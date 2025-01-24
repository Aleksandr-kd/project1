package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskOne extends BasePage {
    public TaskOne(WebDriver driver) {
        super(driver);
    }

    public void checkPageIsCorrect() {
        WebElement logoText = driver.findElement(By.xpath("//h6[text()='Dashboard']"));


    }
}
