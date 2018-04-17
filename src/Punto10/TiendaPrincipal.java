/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class TiendaPrincipal {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        //definir list
        List <Productos> Producto= new ArrayList<Productos>();
        List <Registros> registro= new ArrayList<Registros>();
          //cargando listas
          Producto.add(new Productos(11111,"TV LG",4000));
          Producto.add(new Productos(11111,"Smart JVC",6000));
          Producto.add(new Productos(11111,"bici venzo",10000));
          Producto.add(new Productos(11111,"pc Samsung",5000));
          Producto.add(new Productos(11111,"calefactor",2000));
          //menu
          System.out.println("--------BIENVENIDO A MERCADO LIBRE---------");
          System.out.println("que desea comprar");
          String pro =sc.nextLine();
          System.out.println("");
          System.out.println("-----PRODUCTO------");
          System.out.println("codigo   nombre   precio");
          int cont =0;
          int codi=0;
          int cuo;
            for(int i=0; i<Producto.size();i++){//blucle de busqueda
                if(pro.equals(Producto.get(i).getNombre())){
                   System.out.println(Producto.get(i).getCodigo()+"    "//visualizar
                         +Producto.get(i).getNombre()+"    "+
                         Producto.get(i).getPrecio());
                   codi=Producto.get(i).getCodigo();//asigno codigo p/ registro
                } 
            }
              System.out.println("ingrese en cuantas cuentas lo quiere pagar");
              cuo=sc.nextInt();//cuota
            cont++;//numero de usuario
            registro.add(new Registros(cont,codi,cuo));//
            System.out.println("");
            System.out.println("------REGISTROS DE COMPRA--------");
              System.out.println("USUARIO  CODIGO  CUOTAS");
            for(int j=0; j<registro.size();j++){//bucle de visualizar
                System.out.println("   "+registro.get(j).getUsuarios()+
                        "     "+registro.get(j).getCodigo()+"     "+
                        registro.get(j).getCuota());
            } 
           
          
    }
}

