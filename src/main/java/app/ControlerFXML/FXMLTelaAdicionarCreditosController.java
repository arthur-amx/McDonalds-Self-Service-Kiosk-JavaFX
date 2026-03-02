package app.ControlerFXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import app.Main;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;

public class FXMLTelaAdicionarCreditosController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private ImageView logo;

    @FXML
    private Button buttonPronto;


    @FXML
    private TextField textValor;


    @FXML
    void actionPagarBoleto(ActionEvent event) throws IOException {
        String saldo = Main.c.pegar().getSaldo();
        double s = Double.parseDouble(saldo);
        double valor = Double.parseDouble(textValor.getText());
        s = s + valor;
        String saldoAtual = Double.toString(s);
        Main.c.pegar().setSaldo(saldoAtual);
        Main.c.atualizar();
        JOptionPane.showMessageDialog(null, "R$" + textValor.getText() + " foi adicionado a sua conta " + Main.c.pegar().getNome() + "!!!");
        Main.exibirTela("/viewFXML/FXMLTelaCreditos.fxml");
    }

    @FXML
    void voltaTela(MouseEvent event) throws IOException {
        Main.exibirTela("/viewFXML/FXMLTelaCreditos.fxml");
    }

}
