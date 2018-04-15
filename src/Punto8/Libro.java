/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8;

/**
 *
 * @author ale
 */
public class Libro {
    private String ISBN;
    private String título;
    private String autor;
    private double precio;

    public Libro(String ISBN, String título, String autor, double precio) {
        this.ISBN = ISBN;
        this.título = título;
        this.autor = autor;
        this.precio = precio;
    }
    public Libro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
       
    
    public String toString(){
          return ISBN+'\t'+título+'\t'+autor+'\t'+precio;
    } 
}
