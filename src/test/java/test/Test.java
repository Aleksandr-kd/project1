package test;

import static java.lang.Thread.sleep;

public class Test extends TestBase {

    @org.junit.jupiter.api.Test
    public void firstTest() throws InterruptedException {
        main.goToOpensource();

        user.checkAllElementsOnPagePresent()
                .fillInLogin("Admin")
                .fillInPassword("admin123")
                .loginButtonClick()
                .isLoginCorrect();

    }
}
