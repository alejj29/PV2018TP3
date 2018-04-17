/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author Juan Jose Alancay
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author Juan Jose Alancay
 */
public class MenuPrincipal {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      //declaracion de list
      List <Libro> buscar = new ArrayList<Libro> ();
      List <Categoria> cat = new ArrayList <Categoria>();
      //cargando listas
      buscar.add(new Libro (22222222, "Joyanes"));
      buscar.add(new Libro (3333333, "Marquez" ));
      buscar.add(new Libro (44444444, "Rosember"));
      cat.add(new Categoria ("Programacion"));
      cat.add(new Categoria ("Literatura"));
      cat.add(new Categoria ("Historia"));

     
      int opcion=0;
      int salir=0;
      while(opcion!=4){//bucle de salida
           //menu de opciones
      System.out.println("---------Bienvenido Biblioteca UNJU-----------");
        System.out.println("Elija la forma de busqueda:");
        System.out.println("1: busqueda por autor");
        System.out.println("2: busqueda por categoria");
        System.out.println("3: busqueda por ambas cosas");
        System.out.println("4: salir");
       opcion=sc.nextInt(); 
      int bandera=0;
      int i=0;
      String catego;
       switch (opcion){
         case 1:System.out.println("ingrese el autor");
          String nombre=sc.next();  
             System.out.println("");
          for(i=0; i<buscar.size();i++){//bucle de stop de la busqueda
              if(nombre.equals(buscar.get(i).getAut())){// bucle de concidencia
                  System.out.println("libro encontrado:");
                  System.out.println("ISBN: "+buscar.get(i).getIs()+" | "+"AUTOR: "+buscar.get(i).getAut()+
                          " | Categoria: "+cat.get(i).getPro());
                   bandera=1;
              }
          }
             System.out.println("");
          break;        
        case 2:
            System.out.println("ingrese una categoria");
            catego=sc.next();
            System.out.println("");
            for (i=0;i<cat.size();i++){//bucle de busqueda
                if(catego.equals(cat.get(i).getPro())){//setenia de concidencia
                    System.out.println("libro encontrado:");//visualizacion del libro
                   System.out.println("ISBN: "+buscar.get(i).getIs()+" | "+"AUTOR: "+buscar.get(i).getAut()+
                          " | Categoria: "+cat.get(i).getPro());
                  bandera=1;
                }  
            }
            System.out.println("");
           break; 
        case 3:
            System.out.println("ingrese autor");//ingreso de autor
            nombre=sc.next();
            System.out.println("ingrese categoria");// ingreso de categoria
            catego=sc.next();
            System.out.println("");
            for (i=0; i<buscar.size();i++){
                  if (nombre.equals(buscar.get(i).getAut())){//sentencia de concidencia
                     for(int j=0; j<cat.size();j++){//bucle busqueda
                           if(catego.equals(cat.get(j).getPro())){// bucle de busqueda
                              System.out.println("lbro encontrado:");//visualizacion
                              System.out.println("ISBN: "+buscar.get(i).getIs()+" | "+"AUTOR: "+buscar.get(i).getAut()+
                                " | Categoria: "+cat.get(i).getPro());
                              bandera=1; 
                           }
                     }
                  }
            }
            System.out.println("");
             break;
      }
      if(bandera==0 && (opcion!=4)){//sentencia de libro no encontra con bandera
      System.out.println("LIBRO NO ENCONTRADO");
      }
      }
   }
    
}
