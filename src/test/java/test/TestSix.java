package test;

import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;

public class TestSix extends TestBase {

    @Test
    public void firstTest2() throws InterruptedException {
        main.goToOpensource();

        taskSix.checkAllElementsOnPagePresent()
                .fillInLogin("Admin")
                .fillInPassword("admin123")
                .loginButtonClick()
                .isLoginCorrect()
                .scrollToElement("OrangeHRM OS 5.7");

    }
}
