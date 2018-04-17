/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Carretero Diego
 */
public class circuloAplicacion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        circulo circulo01=new circulo();      /** Se crea el objeto circulo01 de tipo circulo     **/
        List<circulo> circulos=new ArrayList<circulo>();
        System.out.println("Ingrese la coordenada x del eje del circulo: "); /**Se ingresan los datos del circulo**/
        circulo01.setX(scanner.nextDouble());
        System.out.println("Ingrese la coordenada y del eje del circulo: ");
        circulo01.setY(scanner.nextDouble());
        System.out.println("Ingrese el radio de la circunferencia: ");
        circulo01.setRadio(scanner.nextDouble());   
        circulo01.setSuperficie(circulo01.sacarSuperficieCirculo(circulo01));  /**se saca la superficie del circulo**/
        circulos.add(circulo01);/**y todos los datos (coordenadas, radio, superficie) del circulo se ingresan en un array list de tipo circulo**/
        for (circulo elementos:circulos){ /****/
            System.out.println(elementos); /**se muestran los elementos del array list**/
        }
        
    }
}
