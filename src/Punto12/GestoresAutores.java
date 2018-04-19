/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejandro CACERES
 */
public class GestoresAutores {
    private List<Autor>Autores=new ArrayList<>();
    public List<Autor> getAutores() {
        return Autores;
    }
    public void setAutores(List<Autor> Autores) {
        this.Autores = Autores;
    }
    public void AgregarAutor (Autor a){ 
        this.Autores.add(a);
    }   
    
    public void MostrarAutores(){
    for (Autor a: this.getAutores()){
        System.out.println("------------------------------");
        System.out.println("Autor n°"+(this.Autores.indexOf(a)+1));
        System.out.println("Nombre :"+a.getNombre());
        System.out.println("Apellido :"+a.getApellido());
        System.out.println("------------------------------");
    }
    
    }
}
