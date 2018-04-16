/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto7;

import java.util.Scanner;

public class Automobil {
    String ingreso;
    int opcion2;
    Scanner sc = new Scanner (System.in);
    String M[][]=new String[3][5];
    public Automobil(){    
    }    
    public void visualizar (){
        M[0][0]="1";
        M[0][1]="AAD235";
        M[0][2]="FIAT";
        M[0][3]="2016";
        M[0][4]="Negro";
        M[1][0]="2";
        M[1][1]="AAR214";
        M[1][2]="Toyota";
        M[1][3]="2017";
        M[1][4]="azul";
        M[2][0]="3";
        M[2][1]="AAE264";
        M[2][2]="VMW";
        M[2][3]="2018";
        M[2][4]="rojo"; 
        System.out.println("------ELIJA EL AUTO QUE LE GUSTE: 1,2,3-------");
        System.out.println("");
        System.out.println("Nmero  Patente  Marca   Modelo  Color");
        for(int i=0;i<3;i++){
          for(int j=0;j<5;j++)
             System.out.print(M[i][j]+"    ");
             System.out.println();
        }
       }
    public void opciones(){
        int opcion=sc.nextInt();
        if ((opcion>=1) && (opcion<=3)){
            System.out.println("ingrese 1 si desea modificar atributos");
            opcion2=sc.nextInt();
            while(opcion2==1){
                  System.out.println("elija una modificion OPCIONES");
                  System.out.println("1:PATENTE  , 2:MARCA , 3:MODELO, 4:COLOR ");
                  int usuario=sc.nextInt();
                   System.out.println("ingrese su modificacion:");
                   M[opcion-1][usuario]=sc.next();
                   System.out.println("------------------------------");
                   System.out.println("Auto modificado");
                   System.out.println("PATENTE,   MARCA   MODELO   COLOR");
                   for(int i=opcion-1;i<opcion;i++){
                   for(int j=0;j<5;j++)
                      System.out.print(M[i][j]+"    ");
                      System.out.println();
                      System.out.println("");
                   }  
                   System.out.println("ingrese 1 para seguir modificando");
                   opcion2=sc.nextInt();
            }
            System.out.println("------------------------------");
            System.out.println("AUTOMOBIL ELEJIDO");
            System.out.println("PATENTE,   MARCA   MODELO   COLOR");
             for(int i=opcion-1;i<opcion;i++){
                   for(int j=0;j<5;j++)
                      System.out.print(M[i][j]+"    ");
                      System.out.println();
                      System.out.println("");
                   }
        }else{
            System.out.println("opcion mal ingresada");
        }
    }
    
}
