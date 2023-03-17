/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class Chiste {

    private String URL[] = {"Imagenes/imagen1.jpg", "Imagenes/imagen2.jpeg", "Imagenes/imagen3.jpg", "Imagenes/imagen4.jpeg", "Imagenes/imagen5.jpg"};
    private String chiste[] = {"Por que el programador no puede salir del trabajo? Por que esta atascado en un bucle infinito.", "Cuantos programadores se necesitan para cambiar una bombilla?Ninguno,¡Es un problema de hardware!", "Por que las amas de casa prefieren los programadores? Por que siempre tienen la ultima version.", "Por que los tecnicos en informatica siempre estan frios? Porque siempre necesitan un archivo.", "por que los programadores no pueden decir NO? por que siempre vuelven al decir SI cuando se les pregunta si estan seguros"};
    private int num;

    public Chiste() {
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getChiste() {

        return chiste[num];
    }

    public String getURL() {
        return URL[num];
    }
    
    
}
