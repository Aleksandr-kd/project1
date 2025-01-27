package test;

import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;

public class TestSix extends TestBase {

    @Test
    public void firstTest() throws InterruptedException {
        main.goToOpensource();

        taskSix.fillInLogin("Admin")
                .fillInPassword("admin123")
                .loginButtonClick()
                .isLoginCorrect();

    }
}
