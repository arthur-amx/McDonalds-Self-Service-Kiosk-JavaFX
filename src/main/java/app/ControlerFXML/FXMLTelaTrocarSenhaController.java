package app.ControlerFXML;

import java.awt.FontFormatException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import app.classes.Usuario;
import javafx.event.ActionEvent;
import app.excecoes.NomeUsuarioInvalidoException;
import app.excecoes.SenhaInvalidaException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import app.Main;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javax.swing.JOptionPane;

public class FXMLTelaTrocarSenhaController implements Initializable {

    Usuario u = Main.c.pegar();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private PasswordField novaSenha;

    @FXML
    private Button buttonConfirmar;

    @FXML
    void actionConfirmarTrocaSenha(ActionEvent event) throws FontFormatException, IOException, SenhaInvalidaException {
        if (novaSenha.getText().equals("") != true) {
            u.setSenha(novaSenha.getText());
            Main.c.atualizar();
            novaSenha.setText("");
            if (u.getSenha() != null) {
                JOptionPane.showMessageDialog(null, "Senha Alterada com sucesso!!!");
            }
        } else {
            throw new SenhaInvalidaException("Erro, senha Inválida!!!");
        }

    }

}
