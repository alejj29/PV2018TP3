/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Principal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Triangulo calcular=new Triangulo();
        Triangulo Lado1=new Triangulo();
        Triangulo Lado2=new Triangulo();
        Triangulo Lado3=new Triangulo();
        System.out.println("Ingrese las coordenadas del lado 1: ");
        
        System.out.println("Extremo 1 del lado 1 (x,y)");
        Lado1.setX1(scanner.nextDouble());
        Lado1.setY1(scanner.nextDouble());
        
        System.out.println("Extremo 2 del lado 1 (x,y)");
        Lado1.setX2(scanner.nextDouble());
        Lado1.setY2(scanner.nextDouble());
        
        System.out.println("Extremo 1 del lado 2 (x,y)");
        Lado2.setX1(scanner.nextDouble());
        Lado2.setY1(scanner.nextDouble());
        
        System.out.println("Extremo 2 del lado 2 (x,y)");
        Lado2.setX2(scanner.nextDouble());
        Lado2.setY2(scanner.nextDouble());
        
        System.out.println("Extremo 1 del lado 3 (x,y)");
        Lado3.setX1(scanner.nextDouble());
        Lado3.setY1(scanner.nextDouble());
        
        System.out.println("Extremo 2 del lado 3 (x,y)");
        Lado3.setX2(scanner.nextDouble());
        Lado3.setY2(scanner.nextDouble());
        if (calcular.compararExtremos(Lado1,Lado2) && calcular.compararExtremos(Lado2,Lado3)) {
            double perimetro=calcular.sacarDistanciaEntrePuntos(Lado1)+calcular.sacarDistanciaEntrePuntos(Lado2)+calcular.sacarDistanciaEntrePuntos(Lado3);
            System.out.println("Es triangulo y su perimetro es: "+perimetro);
            
        } else {
            System.out.println("no es triangulo");
        }
    
    }
   
}

