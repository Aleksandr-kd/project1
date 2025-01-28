package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class testTask extends BasePage {
    public testTask(WebDriver driver) {
        super(driver);
    }

    public testTask fillInLogin(String login) {
        writeText(By.cssSelector("input[name='username']"), login);
        return this;
    }

    public testTask fillInPassword(String password) {
        writeText(By.cssSelector("input[name='password']"), password);
        return this;

    }

    public testTask loginButtonClick() {
        click(By.cssSelector("button[type='submit']"));
        return this;

    }

    public testTask isLoginCorrect() {              //асерт проверяет в скобках тру или нет, если нет тест упайдет
        isElementDisplayed(By.linkText("Dashboard"));
        return this;

    }


    public testTask checkAllElementsOnPagePresent() {
        isElementDisplayed(By.cssSelector("input[name='username']"));
        isElementDisplayed(By.cssSelector("input[name='password']"));
        isElementDisplayed(By.cssSelector("button[type='submit']"));
        return this;
    }

    //Drag and drop. перетаскивание
    public void addProductWithDragAndDrop() {
        driver.findElement(By.linkText("Drag and Drop")).click();
        WebElement columnA = driver.findElement(By.cssSelector("column-a"));
//        fieldProductNumber.sendKeys("2");

        WebElement columnB = driver.findElement(By.cssSelector("column-b"));
//        WebElement basket = driver.findElement(By.cssSelector(".panel-body"));

        Actions action = new Actions(driver);
        action.dragAndDrop(columnA, basket).perform();

        WebElement basketAmountForProduct = driver.findElement(By.cssSelector("column-a"));

        assertEquals("2", basketAmountForProduct.getText());

    }
}


//    // скро вниз старницы
//    public void scrollToElement(String element) throws InterruptedException {
//        sleep(3000);
////        WebElement webElement = driver.findElement(By.xpath("//p[text()='" + element + "']"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("arguments[0].scrollIntoView(true);", webElement);
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//    }
//
//
//
//    // навести мышь на элемент
//    @Test
//    public void testMenuMouseMove(){
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.className("caret"))).build().perform();
//        actions.moveToElement(driver.findElement(By.className("caret2"))).build().perform();
//        driver.findElement(By.id("start")).click();
//    }
//    // Проверка доступен ли элемент для редактирования.
//    @Test
//    public void testDisabled(){
//        assertFalse(driver.findElement(By.id("id")).isEnabled());   //находим элемент и проверям что false(поле было недоступно для редактирования)
//        assertTrue(driver.findElement(By.id("id")).isEnabled());   //находим элемент и проверям что true(поле доступно для редактирования)
//    }
//
//    // Проверка доступен ли элемент для редактирования всех элементов на странице
//    private void isElementDisabled(String element){
//        assertFalse(driver.findElement(By.id(element)).isEnabled());
//    }
//    @Test
//    public void testDisabled(){
//        isElementDisabled("id1");
//        isElementDisabled("id2");
//        isElementDisabled("id3");
//        isElementDisabled("id4");
//    }


//
//public void moveMouseToWomenMenuAndGoToTopsCategory() {
//    WebElement womenLink = driver.findElement(By.xpath("//a[text()='Women']"));
//
//    Actions actions = new Actions(driver);
//
//    actions.moveToElement(womenLink).perform();
//
//    WebElement topLink = driver.findElement(By.xpath("//a[text()='Tops']"));
//    wait.until(ExpectedConditions.visibilityOf(topLink));
//    actions.moveToElement(topLink).click().perform();
//
//
//    WebElement topLabel = driver.findElement(By.xpath("//span[@class='cat-name']"));
//    wait.until(ExpectedConditions.visibilityOf(topLabel));
//    assertEquals("TOPS ", topLabel.getText());
//}