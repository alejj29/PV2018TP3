/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

/**
 *
 * @author ale
 */
public class Prinicpal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rectangulo1=new Rectangulo(1,1,2,3);
        Rectangulo rectangulo2=new Rectangulo(2,2,3,4);
        Rectangulo rectangulo3=new Rectangulo(3,3,4,5);
        
        GestoRectangulo gr=new GestoRectangulo();
        gr.agregarRectangulo(rectangulo1);
        gr.agregarRectangulo(rectangulo2);
        gr.agregarRectangulo(rectangulo3); 
        System.out.println("primer rectangulo ");
        System.out.println("Superficie:"+rectangulo1.obtenerSuperficie());
        System.out.println("Perimetro:"+rectangulo1.obtenerPerimetro());
        System.out.println("segundo rectangulo ");
        System.out.println("Superficie:"+rectangulo2.obtenerSuperficie());
        System.out.println("Perimetro:"+rectangulo2.obtenerPerimetro());
        System.out.println("tercer rectangulo ");
        System.out.println("Superficie:"+rectangulo3.obtenerSuperficie());
        System.out.println("Perimetro:"+rectangulo3.obtenerPerimetro());
       
        for(Rectangulo rectangulo: gr.getRectangulo()){
            System.out.println("Rectangulo ");
            System.out.println("Altura:" + rectangulo.getAltura());
            System.out.println("Base:" + rectangulo.getBase());
            System.out.println("Punto:(" + rectangulo.getX()+","+rectangulo.getY()+")");
           
        }
              
        
    }
    
}
