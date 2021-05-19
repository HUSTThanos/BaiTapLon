package LoginUI;
import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import Alert.AlertController;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;


public class LoginController implements Initializable{
    private String username = "nhom7";
    private String password = "123";
    @FXML
    private JFXTextField usernameField;

    @FXML
    private JFXPasswordField passwordField;

    @FXML
    private JFXButton loginButton;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
//        System.out.println("ooo");
    }
    @FXML
    public void Login(ActionEvent e) throws IOException {
        String usernameInput = usernameField.getText();
        String passwordInput = passwordField.getText();

        if(usernameInput.equals(this.username) && passwordInput.equals(this.password)){
            loginButton.getScene().getWindow().hide();
            Stage home = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/MainWindow/main.fxml"));
            home.setTitle("Phần mềm quản lý bãi đỗ xe =D");
            home.getIcons().add(new Image("/Style/Images/car.png"));
            Scene scene = new Scene(root);
            home.setScene(scene);
            home.show();
        }
        else{
            AlertController alertController = new AlertController();

            Optional<List<JFXButton>> res = alertController.Show("Thông báo", "Sai tài khoản hoặc mật khẩu");
            JFXButton accept = res.get().get(0);
            JFXButton refuse = res.get().get(1);
            accept.setOnAction(p->{
                accept.getScene().getWindow().hide();
            });
            refuse.setOnAction(p->{
                accept.getScene().getWindow().hide();
            });
    }
    }
}


