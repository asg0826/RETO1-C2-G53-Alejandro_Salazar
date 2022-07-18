/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package reto1.reto_1;
import vistas.*;
import Modelo.*;

/**
 *
 * @author alesa
 */
public class Reto_1 {

    public static void main(String[] args) {
        //1. Creamos la instancia de la vista login
        Log log = new Log();
        //2. El metodo setVisible hace visible la ventana
        log.setVisible(true);
        //System.out.println("HelloWorld");
        
        Conexion conexion = new Conexion();
        conexion.getConnection();
    }
}
