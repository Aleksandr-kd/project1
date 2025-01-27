package page;

import org.openqa.selenium.*;

public class TaskOne extends BasePage {
    public TaskOne(WebDriver driver) {
        super(driver);
    }

    public void checkPageIsCorrect() {
        WebElement logoText = driver.findElement(By.xpath("//h6[text()='Dashboard']"));


    }

    public void scrollToElement(String element) {
        WebElement webElement = driver.findElement(By.xpath("//p[text()='" + element + "']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", webElement);
    }
}
