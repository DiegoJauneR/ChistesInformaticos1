package Controller;

import Model.Chiste;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class VentanaController implements Initializable {

    @FXML
    private Label titulo;
    @FXML
    private Button BotonSi;
    @FXML
    private ImageView ImagenMeme;

    int numero = -1;
    String url;
    String textoChiste;

    Chiste chiste = new Chiste();
    @FXML
    private Label texto;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void ActionOfButton(ActionEvent event) {
        numero++;
        chiste.setNum(numero);
        url = chiste.getURL();
        textoChiste = chiste.getChiste();
        ImagenMeme.setImage(new Image(url));
        titulo.setVisible(false);
        texto.setText(textoChiste);
        BotonSi.setText("Siguiente Chiste");

        if (numero == 4) {
            numero = -1;
        }

    }

}
