/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.util.Scanner;

/**
 *
 * @author ale
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Rectangulo unRectangulo=new Rectangulo();
        System.out.println("Ingrgese x :");
        double x=scanner.nextDouble();
        System.out.println("Ingrgese y :");
        double y=scanner.nextDouble();
        System.out.println("Ingrgese altura :");
        double altura=scanner.nextDouble();
        System.out.println("Ingrgese base :");
        double base=scanner.nextDouble();
        unRectangulo.setY(y);
        unRectangulo.setX(x);
        unRectangulo.setAltura(altura);
        unRectangulo.setBase(base);
                   
        unRectangulo.optenerPrimerPunto();
        unRectangulo.optenerSegundoPunto();
        unRectangulo.optenerTercerPunto();
        System.out.println("La superficie es :"+unRectangulo.obtenerSuperficie());
        System.out.println("El perimetro es :"+unRectangulo.obtenerPerimetro());
         
    }
    
}
