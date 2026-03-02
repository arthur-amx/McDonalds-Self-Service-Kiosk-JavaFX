package app.ControlerFXML;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.exception.FacebookNetworkException;
import com.restfb.types.User;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import app.Cadastro;
import app.classes.UsuarioFace;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import app.Main;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.JOptionPane;

public class FXMLTelaLoginUserController implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private PasswordField usuarioSenha;

    @FXML
    private TextField usuarioNome;

    @FXML
    private Hyperlink link;

    @FXML
    private Button buttonAcessar;

    @FXML
    private ImageView logo;

    @FXML
    private ImageView buttonFace;

    @FXML
    void LogarFacebook(MouseEvent event) throws IOException {

        String domain = "https://www.google.com.br";
        String appId = "397254981018794";
        String authUrl = "https://graph.facebook.com/oauth/authorize?type=user_agent&client_id="
                + appId + "&redirect_uri=" + domain + "&scope";
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        String acessToken;
        boolean entrar = true;
        User user = null;
        WebDriver driver = new ChromeDriver();
        driver.get(authUrl);

        while (entrar) {
            try {
                if (!driver.getCurrentUrl().contains("facebook.com")) {
                    String url = driver.getCurrentUrl();
                    acessToken = url.substring(url.indexOf("=") + 1, url.indexOf("&"));
                    driver.quit();
                    try {
                        FacebookClient fbClient = new DefaultFacebookClient(acessToken, Version.LATEST);
                        user = fbClient.fetchObject("me", User.class, Parameter.with("fields", "name,id,picture,email"));
                        entrar = false;
                    } catch (FacebookNetworkException e) {
                        JOptionPane.showMessageDialog(null, "Erro, falha ao conectar!!!");
                        return;
                    }
                }
            } catch (WebDriverException e) {
                JOptionPane.showMessageDialog(null, "Login cancelado!!!");
                return;
            }
            if (user != null) {
                UsuarioFace uf = new UsuarioFace(user.getName());
                Main.c.setar(uf);
                Main.exibirTela("/viewFXML/FXMLTelaMenuUser.fxml");
            }
        }
    }

    @FXML
    void VoltarPage(MouseEvent event) throws IOException {
        Main.exibirTela("/viewFXML/FXMLTelaInicial.fxml");
    }

    @FXML
    void actionAbrirTelaCadastro(ActionEvent event) throws IOException {
        Main.exibirTela("/viewFXML/FXMLTelaCadastro.fxml");
    }

    @FXML
    void actionAbrirTelaMenuUser(ActionEvent event) throws IOException {
        Cadastro c = new Cadastro();
        if (c.verifica(usuarioNome.getText(), usuarioSenha.getText()) == true) {
            c.setar(c.retorno(usuarioNome.getText(), usuarioSenha.getText()));
            Main.exibirTela("/viewFXML/FXMLTelaMenuUser.fxml");
        } else {
            JOptionPane.showMessageDialog(null, "Erro, usuario não cadastrado!!!");
            usuarioSenha.setText("");
            usuarioNome.setText("");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
