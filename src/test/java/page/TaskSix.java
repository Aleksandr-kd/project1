package page;

import org.openqa.selenium.By;
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
        writeText(By.cssSelector("input[placeholder='Username']"), login);
        return this;
    }



    public TaskSix fillInPassword(String Password) throws InterruptedException {
        writeText(By.cssSelector("input[name='password']"), Password);
        return this;

    }

    public TaskSix loginButtonClick() throws InterruptedException {
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
        click(By.cssSelector("button[type='submit']"));
        return this;

    }

    public TaskSix isLoginCorrect() throws InterruptedException {              //асерт проверяет в скобках тру или нет, если нет тест упайдет
        sleep(3000);
        isElementDisplayed(By.linkText("Dashboard"));
        return this;

    }
}