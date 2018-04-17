/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ArregloDeNumeros {
    private int max=0;
    private int min=0;
    private int suma=0;
    private float promedio=0; 
    int vec []= new int [10];
    Scanner sc = new Scanner(System.in);
    public ArregloDeNumeros() {   
    }
    public void compararSumaPromedio(){
        System.out.println("ingrese los 10 valores");
        for(int i=0; i<vec.length;i++ ){
        vec[i]=sc.nextInt();//ingreso por teclado de los 10 numeros pertenecientes al arreglo vec
        if (max!=0 && min!=0) {
           if (vec[i]>max) {//a la vez que se van ingresando los numero se va reteniendo el elemento de mayor y menor valor
              max=vec[i];
            }
            if (vec[i]<min) {
              min=vec[i];
            }
        }else{
                max=vec[i];
                min=vec[i];
            }
        }
     
        System.out.println("valores ingresados");
        for (int i=0; i<vec.length; i++){
          suma=vec[i]+suma;//se suma cada uno de los elementos del arreglo
        System.out.println(vec[i]);    
        }
        promedio=suma/vec.length;//y se saca el promedio dividiendo por el total de los elemntos del arreglo
        System.out.println("numero mayor del arreglo: "+max);
        System.out.println("numero menor del arreglo: "+min);  
        System.out.println("promedio: "+promedio);
    }
}
