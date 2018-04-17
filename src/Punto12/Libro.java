/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12;

/**
 *
 * @author Juan Jose Alancay
 */

public class Libro {
    //atributos
      private int Is;
      private String aut;
   
//contructor
    public Libro(int Is, String aut ) {
        this.Is = Is;
        this.aut = aut;
    }
//geter and seter
    public int getIs() {
        return Is;
    }

    public void setIs(int Is) {
        this.Is = Is;
    }

    public String getAut() {
        return aut;
    }

    public void setAut(String aut) {
        this.aut = aut;
    }

   

}
