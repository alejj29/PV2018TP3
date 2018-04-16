/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto11;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Zapatillas {
    int opcion;
    String ingreso;
    String ingreso2;
    String z[][];
   Scanner sc = new Scanner (System.in);

    public Zapatillas() {

    }

   public void ingresar(){
       System.out.println("-----TABLA-----");
       System.out.println("MARCA    Original O Copia");
       System.out.println("Si desea ingresar zapatillas ingrese 1");
       opcion =sc.nextInt();
    
       int con=0;
       if(opcion==1){
          System.out.println("cuantas zapatillas desea ingresar");
          int filas=sc.nextInt();
          z = new String [filas][2];
          for(int i=0;i<filas;i++){
           for(int r=0;r<2;r++){
                  if(r==0){
                  System.out.println("ingrese la marca");
                  ingreso=sc.next();
                  z[i][r]=ingreso;
                  }else{
                      System.out.println("ingrese la si es copia o original");
                      z[i][r]=sc.next();
                  }
           }
         }
          System.out.println("");
           System.out.println("----------------------------------------");
            System.out.println("--TABLAA ACTUALIZADA---");
            System.out.println("Marca  calidad");
          for(int i=0;i<filas;i++){
          for(int r=0;r<2;r++)
             System.out.print(z[i][r]+"   ");
              System.out.println();
          }    
       }else{
           System.out.println("-------------------------------");
           System.out.println("REGISTROS DE ZAPATILLAS BASIO");
       }
    }
   }
