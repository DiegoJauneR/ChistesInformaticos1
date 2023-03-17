/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 *
 * @author PC
 */
public class VentanaController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button BotonSi;
    @FXML
    private ImageView ImagenMeme;
    
    int numero=-1;
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ActionOfButton(ActionEvent event) {
        numero++;
        
        
        if(numero==4){
           numero=-1;
        }
        
    }
    
}
