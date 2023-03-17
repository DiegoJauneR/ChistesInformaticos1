/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package Model;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Administrador
 */
public class Chiste {
    private String URL;
    private String chiste[] = {"Por que el programador no puede salir del trabajo? Por que esta atascado en un bucle infinito.", "", "Vespentino","",""};
    private int num;

    public Chiste() {
    }

    public String getChiste() {
        
        return chiste[num];
    }
    
    
}
