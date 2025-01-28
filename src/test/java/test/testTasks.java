package test;

import org.junit.jupiter.api.Test;

public class testTasks extends testTasksBase {

    @Test
    public void testOne () {
        main.goToOpensource1();

        user.checkAllElementsOnPagePresent()
                .fillInLogin("Admin")
                .fillInPassword("admin123")
                .loginButtonClick()
                .isLoginCorrect();

    }

    @Test
    public void testTwo(){
        main.goToOpensource1();

        user.addProductWithDragAndDrop()
                ;
    }
}
