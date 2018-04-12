/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author Fatima
 */
public class Punto {
    private int x;//atributo de la clase
    private int y;//atributo de la clase
     public Punto(int x, int y) {// contructor 
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x ;
    }

    public int getY() {
        return y;
    }


    public double calcularDistaciaEntrePuntos(Punto punto2)//llamado del otro objeto 2
    {
        return Math.sqrt(Math.pow(punto2.getX()-x, 2)+Math.pow(punto2.getY()-y, 2));
    }
}

