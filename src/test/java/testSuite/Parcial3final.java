package testSuite;

import PaginasFinales.LogInTodoLY;
import org.junit.jupiter.api.Test;

public class Parcial3final extends TestBase{
    LogInTodoLY logInTodoLY = new LogInTodoLY();

    @Test
    public void tyTest(){

        logInTodoLY.UpButt.click();
        logInTodoLY.name.setText("Luciano");
        logInTodoLY.maillog.setText("holatyr@hola.com");
        logInTodoLY.passLog.setText("tytytyty");

        logInTodoLY.Quit.click();


        logInTodoLY.UpButt.click();
        logInTodoLY.name.setText("Luciano");
        logInTodoLY.maillog.setText("holatyr@hola.com");
        logInTodoLY.passLog.setText("tytytyty");


    }
}
