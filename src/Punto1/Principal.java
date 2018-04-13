/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author juan Alancay
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto punto1=new Punto(1, 2);
        Punto punto2=new Punto(3,2);
        System.out.println("La distancia entre los dos punto :"+punto1.calcularDistaciaEntrePuntos(punto2));
    }
}
