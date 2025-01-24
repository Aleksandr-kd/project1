package test;

import org.junit.jupiter.api.Test;

public class First extends TestBase {

    @Test
    public void firstTest() throws InterruptedException {
        main.goTo().logIn();


        taskOne.checkPageIsCorrect();


//        Thread.sleep(4000);

    }
}
