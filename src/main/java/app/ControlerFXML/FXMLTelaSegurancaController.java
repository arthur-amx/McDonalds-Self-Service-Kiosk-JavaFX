package app.ControlerFXML;

import java.awt.FontFormatException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import app.Cadastro;
import javafx.event.ActionEvent;
import app.excecoes.NomeUsuarioInvalidoException;
import app.excecoes.SenhaInvalidaException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import app.Main;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javax.swing.JOptionPane;

public class FXMLTelaSegurancaController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private PasswordField adminSenha;

    @FXML
    private Button buttonConfirmar;

    @FXML
    void actionConfirmarTrocaSenha(ActionEvent event) throws FontFormatException, IOException, NomeUsuarioInvalidoException, SenhaInvalidaException {
        if (adminSenha.getText().equals("") != true) {
            Cadastro c = new Cadastro();
            c.cadastra(adminSenha.getText());
            adminSenha.setText("");

        } else {
            throw new SenhaInvalidaException("Erro, senha Inválida!!!");
        }

    }

}
