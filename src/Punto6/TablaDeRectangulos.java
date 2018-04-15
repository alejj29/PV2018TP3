/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class TablaDeRectangulos {
    public static void main(String[] args) {
        ArrayList<String> lista=new ArrayList<String>();
        Scanner sc = new Scanner (System.in);
        int opcion; 
        if (lista.isEmpty()) {
            lista.add("Rectangulo 1: punto de cordenada 1,2 BASE:2, ALTURA:2, "
                    + "SUPERFICIE:4, PERIMETRO:8");
            lista.add("rectangulo 2: Punto de cordenada 2,2 BASE:1, ALTURA:3, "
                    + "SUPERFICIE:8, PERIMETRO:3");
            lista.add("rectangulo 3: Punto de cordenada 1,5 BASE:4, ALTURA:6, "
                    + "SUPERFICIE:16, PERIMETRO:12");
            lista.add("rectangulo 4: Punto de cordenada 2,3 BASE:5, ALTURA:7, "
                    + "SUPERFICIE:24, PERIMETRO:35");
            
            for(String cadena :lista){
                System.out.println(cadena);
             }
         System.out.println("---------------------------------");
         System.out.println("ELIJA UNA RECTANGULO  QUE DESEA ELIMINAR");
         System.out.println("RECTANGULO: 1,2,3,4");
         opcion=sc.nextInt();
         lista.remove(opcion-1);
         System.out.println("-----------------------------------");
         System.out.println("Lista de rectangulos actualizada: ");
          for(String cadena :lista){
                System.out.println(cadena);
             }
        }
        
    }
}
