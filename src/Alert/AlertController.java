package Alert;

import com.jfoenix.controls.JFXButton;
import javafx.beans.value.ObservableObjectValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AlertController extends Dialog<ButtonType> {
    @FXML
    private StackPane anchorPane;

    @FXML
    private JFXButton btRefuse;

    @FXML
    private JFXButton btAccept;

    @FXML
    private Label lbTitle;

    public void HideWindow(){

    }

    public Optional<List<JFXButton>> Show(String title, String massage) throws IOException {
        List<JFXButton> listOptional = new ArrayList<>();
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        Parent root = FXMLLoader.load(getClass().getResource("/Alert/alert.fxml"));
        Label label = (Label) root.lookup("#lbTitle");
        JFXButton accept = (JFXButton) root.lookup("#btAccept");
        JFXButton refuse = (JFXButton) root.lookup("#btRefuse");
        listOptional.add(accept);
        listOptional.add(refuse);
        label.setText(massage);
        label.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
        return Optional.ofNullable(listOptional);
    }


}
