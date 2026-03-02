package app.ControlerFXML;

import java.io.IOException;
import app.classes.PagSeguro;
import javafx.fxml.FXML;
import app.Main;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class FXMLTelaPagSeguroController {

    @FXML
    private ImageView logo;

    @FXML
    private Button buttonPronto;

    @FXML
    private TextField textValor;

    @FXML
    void voltarTela(MouseEvent event) throws IOException {
        Main.exibirTela("/viewFXML/FXMLTelaMenuUser.fxml");
    }

    @FXML
    public void abrirPagSeguro() {
        PagSeguro ps = new PagSeguro();

        ps.pagar(textValor.getText());
    }
}
