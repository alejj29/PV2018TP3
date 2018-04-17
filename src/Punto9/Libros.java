/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto9;

/**
 *
 * @author pc
 */
public class Libros {
    private int ISBN;
    private String nombre;
    private String autor;
    private float precio;

    public Libros(int ISBN, String nombre, String autor, float precio) {
        this.ISBN = ISBN;
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
}

