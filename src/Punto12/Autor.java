/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12;

import java.util.ArrayList;

/**
 *
 * @author DEBORA CACERES
 */
public class Autor {
     private String Apellido,Nombre;
    public Autor(String Apellido, String Nombre) {
        this.Apellido = Apellido;
        this.Nombre = Nombre;
    }     
    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}
