/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10;

/**
 *
 * @author pc
 */
public class Producto {
    private int codigo;
    private String nombre;
    private double precioUnitario;
    private double cantidadDeCuotas;

    public Producto() {
    }

    public Producto(int codigo, String nombre, double precioUnitario, double cantidadDeCuotas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidadDeCuotas = cantidadDeCuotas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getCantidadDeCuotas() {
        return cantidadDeCuotas;
    }

    public void setCantidadDeCuotas(double cantidadDeCuotas) {
        this.cantidadDeCuotas = cantidadDeCuotas;
    }
    
}

