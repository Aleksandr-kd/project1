package page;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


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


    // навести мышь на элемент
    @Test
    public void testMenuMouseMove(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.className("caret"))).build().perform();
        actions.moveToElement(driver.findElement(By.className("caret2"))).build().perform();
        driver.findElement(By.id("start")).click();
    }
    // Проверка доступен ли элемент для редактирования.
//    @Test
//    public void testDisabled(){
//        assertFalse(driver.findElement(By.id("id")).isEnabled());   //находим элемент и проверям что false(поле было недоступно для редактирования)
//        assertTrue(driver.findElement(By.id("id")).isEnabled());   //находим элемент и проверям что true(поле доступно для редактирования)
//    }

    // Проверка доступен ли элемент для редактирования всех элементов на странице
    private void isElementDisabled(String element){
        assertFalse(driver.findElement(By.id(element)).isEnabled());
    }
    @Test
    public void testDisabled(){
        isElementDisabled("id1");
        isElementDisabled("id2");
        isElementDisabled("id3");
        isElementDisabled("id4");
    }

}