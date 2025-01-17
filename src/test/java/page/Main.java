package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class Main extends BasePage {
    String SITE_URL = "https://mail.ru/";

    public Main(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(SITE_URL);
    }

    public void chooseNews() {
//        click(By.xpath("//*[@id='grid']/div[2]/div[3]/div/div[6]/div/ul/li[10]/div/a/span"));
//        driver.get("https://e.mail.ru/inbox?utm_source=portal&utm_medium=portal_navigation_under_search_exp&utm_campaign=e.mail.ru&mt_link_id=jlsxn4&mt_sub1=mail.ru&mt_sub3=156197672&mt_sub4=413305&mt_sub5=541");
//        driver.get("https://account.mail.ru/login?page=https%3A%2F%2Fe.mail.ru%2Finbox%3Futm_source%3Dportal%26utm_medium%3Dportal_navigation_under_search_exp%26utm_campaign%3De.mail.ru%26mt_link_id%3Djlsxn4%26mt_sub1%3Dmail.ru%26mt_sub3%3D156197672%26mt_sub4%3D413305%26mt_sub5%3D541&allow_external=1&from=octavius");
//        driver.get("https://cloud.mail.ru/?utm_source=portal_navigation_under_search_exp&utm_medium=link&utm_campaign=portal_navi&mt_link_id=f0dxi9&mt_sub1=mail.ru&mt_sub5=541");
//        driver.get("https://ok.ru/?mt_link_id=koydy6&mt_sub1=mail.ru&mt_sub5=541");
//        driver.get("https://vk.com/feed");
//        driver.get("https://news.mail.ru/?utm_source=portal&utm_medium=portal_navigation_exp&utm_campaign=news.mail.ru&mt_link_id=sccve9&mt_sub1=mail.ru&mt_sub5=541");
        driver.get("https://love.mail.ru/?utm_source=portal&utm_medium=new_portal_navigation&utm_campaign=love.mail.ru&mt_link_id=k9iu14&mt_sub1=mail.ru&mt_sub5=541");
        driver.findElement(By.linkText("Создать профиль")).click();
        Thread.sleep(60000);

    }
}




