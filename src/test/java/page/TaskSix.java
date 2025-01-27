package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class TaskSix extends BasePage {
    public TaskSix(WebDriver driver) {
        super(driver);
    }

    public TaskSix fillInLogin(String login) throws InterruptedException {
//        WebElement element = driver.findElement(By.cssSelector("input[name='username']"));
//        element.sendKeys(login);

        sleep(3000);
        writeText(By.cssSelector("input[name='username']"), login);
        return this;
    }


    public TaskSix fillInPassword(String password) {
        writeText(By.cssSelector("input[name='password']"), password);
        return this;

    }

    public TaskSix loginButtonClick() {
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
        click(By.cssSelector("button[type='submit']"));
        return this;

    }

    public TaskSix isLoginCorrect() throws InterruptedException {              //асерт проверяет в скобках тру или нет, если нет тест упайдет
        isElementDisplayed(By.linkText("Dashboard"));
        return this;

    }

    public void scrollToElement(String element) throws InterruptedException {
        sleep(3000);
//        WebElement webElement = driver.findElement(By.xpath("//p[text()='" + element + "']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", webElement);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public TaskSix checkAllElementsOnPagePresent(){
        isElementDisplayed(By.cssSelector("input[name='username']"));
        isElementDisplayed(By.cssSelector("input[name='password']"));
        isElementDisplayed(By.cssSelector("button[type='submit']"));
        return this;   }
}