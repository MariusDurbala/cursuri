package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    public TextField Username;
    public TextField Password;
    public Button Login;

    public void loginAction(ActionEvent event) {
        System.out.println("It works");
    }
}
