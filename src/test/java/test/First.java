package test;

import org.junit.jupiter.api.Test;

public class First extends TestBase {

    @Test
    public void firstTest(){
        main.goTo();
        main.chooseNews();

        taskOne.checkPageIsCorrect();
    }
}
