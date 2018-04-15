/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8;

import java.util.ArrayList;

/**
 *
 * @author ale
 */
public class GestorLibro {
    ArrayList<Libro> libros;
    
    public GestorLibro() {
        libros=new ArrayList<Libro>();
    }
    public void reporte(){
        System.out.println("\nISBM\tAutor\tTitulo\tPrecio");
        for (Libro  l: libros) {
            System.out.println(l);
        }
        
    }
   public void registrar(Libro l){
       libros.add(l);
       reporte();
       System.out.println("-----------------------------------");
   }
}
