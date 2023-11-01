package PaginasFinales;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;
public class LogInTodoLY {

    public Button UpButt = new Button(By.className("HPHeaderSignup"));

    public TextBox name  = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));

    public TextBox maillog = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));

    public TextBox passLog = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));

    public Button Quit = new Button(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));

}
