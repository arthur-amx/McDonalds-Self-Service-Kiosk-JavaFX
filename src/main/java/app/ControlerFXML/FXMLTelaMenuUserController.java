package app.ControlerFXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import app.Cadastro;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import app.Main;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class FXMLTelaMenuUserController implements Initializable {

    @FXML
    private ImageView IMGloja;

    @FXML
    private ImageView IMGcredito;

    @FXML
    private ImageView IMGedicao;

    @FXML
    private ImageView logo;

    @FXML
    void VoltarPage(MouseEvent event) throws IOException {
        Main.exibirTela("/viewFXML/FXMLTelaInicial.fxml");
    }

    @FXML
    void actionAbrirTelaCreditos(MouseEvent event) throws IOException {
        Main.exibirTela("/viewFXML/FXMLTelaCreditos.fxml");
    }

    @FXML
    void actionAbrirTelaEdicaoLoja(MouseEvent event) throws IOException {
        Main.exibirTela("/viewFXML/FXMLTelaCompras.fxml");
    }

    @FXML
    void actionAbrirTelaEdicaoUser(MouseEvent event) throws IOException {
        Main.exibirTela("/viewFXML/FXMLTelaEdicaoUser.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
