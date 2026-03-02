package app.ControlerFXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import app.Cadastro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import app.Main;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;

public class FXMLTelaLoginAdminController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private PasswordField adminSenha;

    @FXML
    private ImageView logo;

    @FXML
    private Button buttonAcessar;

    @FXML
    void VoltarPage(MouseEvent event) throws IOException {
        Main.exibirTela("/viewFXML/FXMLTelaInicial.fxml");
    }

    @FXML
    void acessarAdmin(ActionEvent event) throws IOException {
        Cadastro c = new Cadastro();
        if (c.verifica(adminSenha.getText()) == true) {
            Main.exibirTela("/viewFXML/FXMLTelaMenuAdmin.fxml");
        } else {
            JOptionPane.showMessageDialog(null, "Erro, senha incorreta!!!");
            adminSenha.setText("");
        }
    }

}
