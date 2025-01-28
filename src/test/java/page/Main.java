package page;

import org.openqa.selenium.WebDriver;

public class Main extends BasePage {
    final String SITE_URL_1 = "https://the-internet.herokuapp.com/";   // final означает что нельзя переопределить
    final String SITE_URL_2 = "https://opensource-demo.orangehrmlive.com";

    public Main(WebDriver driver) {
        super(driver);
    }


    public Main goToOpensource2() {
        driver.get(SITE_URL_2);
        return this;
    }

    public Main goToOpensource1() {
        driver.get(SITE_URL_1);
        return this;
    }

//    public Main logIn() {
//        WebElement name = driver.findElement(By.xpath("//input[@name='username']"));
//        name.sendKeys("Admin");
//        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//        password.sendKeys("admin123");
//        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
//        submit.click();
//        return this;
//
//
//    }
}




