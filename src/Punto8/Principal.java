/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8;

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
        GestorLibro a =new GestorLibro();
        Scanner s=new Scanner(System.in);
        String aux;  
        do{
            System.out.println("Ingrese ISBM");
            String n = s.nextLine();
            System.out.println("Ingrese Titulo:");
            String d = s.nextLine();
            System.out.println("Ingrese Autor:");
            String b = s.nextLine();
            System.out.println("Ingrese Precio:");
            double u=s.nextDouble(); 
            a.registrar(new Libro(n, d, b, u) ); //convertimos a un tipo Integer y lo agregamos al arrayList                                                                                    con el método add
            System.out.println("Desea agregar Libros S/n");
            aux = s.next();
            s.nextLine();//AHI LIMPIAR EL BUFER
        }while(!"n".equals(aux));
        
    }
    
}
