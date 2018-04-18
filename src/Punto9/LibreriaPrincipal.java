/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class LibreriaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Libros> busca = new ArrayList <Libros>();//declaracion de la lista
        //cargando listas
        busca.add(new Libros(111111,"Pie Grande","Edgar teves",125));
        busca.add(new Libros(222222,"Rayuel","Cortez cesar",150));
        busca.add(new Libros(333333,"La Regenta","Poldo Rene",300));
        busca.add(new Libros(444444,"El Tunel","Sabato Sabira",250));
        busca.add(new Libros(555555,"El camino","Delibes Segobia",500));
       
        System.out.println("-------BIENVENIDO A LA LIBRERIA SAN PABLO-------");
        System.out.println("ingrese el autor del libro que desea buscar");
        String ingreso=sc.nextLine();
        boolean identificar=false;//indentificador bool
        for(int i=0; i<busca.size();i++){//bucle de busqueda
            if(ingreso.equals(busca.get(i).getAutor())){//sentencia de concidencia
                System.out.println("libro encontrado");//visualizar result
                System.out.println("ISBN: "+busca.get(i).getISBN()+"  "+
                        "NOMBRE: "+busca.get(i).getNombre()+"  "+
                        "Autor: "+busca.get(i).getAutor()+"  "+
                        "PRECIO: "+busca.get(i).getPrecio());
                identificar=true;
            }
        }
        if(identificar=false){//sentencia de result falso
            System.out.println("no tenemos el libro que busca");
        }
    }
}

