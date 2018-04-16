/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class AplicacionProducto {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Producto newProducto=new Producto();
        System.out.println("Ingresar el Codigo del Producto: ");
        newProducto.setCodigo(scanner.nextInt());
        System.out.println("Ingresar el Nombre del Producto: ");
        newProducto.setNombre(scanner.next());
        System.out.println("Ingresar el Precio del Producto: ");
        newProducto.setPrecioUnitario(scanner.nextDouble());
        System.out.println("Ingresar la Cantidad de Cuotas a pagar del Producto: ");
        newProducto.setCantidadDeCuotas(scanner.nextInt());
        System.out.println("Codigo del Producto: "+newProducto.getCodigo());
        System.out.println("Nombre del Producto: "+newProducto.getNombre());
        System.out.println("Precio del Producto: "+newProducto.getPrecioUnitario());
        System.out.println("Cantidad de Cuotas a pagar "+newProducto.getCantidadDeCuotas());
        int i=1;
        double cuota=newProducto.getPrecioUnitario()/newProducto.getCantidadDeCuotas();
        double totalAPagar=cuota;
        while (i<=newProducto.getCantidadDeCuotas()) {            
            System.out.println("Cuota Nº "+i+"  "+cuota);
            cuota=cuota+(cuota*1.5)/100;
            totalAPagar=totalAPagar+cuota;
            i++;
        }
    }
}
