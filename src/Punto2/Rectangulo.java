/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

/**
 *
 * @author ale
 */
public class Rectangulo {
    private double x;
    private double y;
    private double base;
    private double altura;

        
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void optenerPrimerPunto(){
        double puntox1=this.x+this.base;//Cálculo para obtener el Primer punto faltante       
        double puntoy1=this.y;
        System.out.println("Primer Punto :("+puntox1+","+puntoy1+")");
    }
    public void optenerSegundoPunto(){
        double puntox2=this.x;//Cálculo para obtener el Segundo punto faltante
        double puntoy2=this.y+this.altura;
        System.out.println("Segundo Punto :("+puntox2+","+puntoy2+")");
    }
    public void optenerTercerPunto(){
        double puntox3=(this.x+this.base)-this.base;//Cálculo para obtener el Tercer punto faltante
        double puntoy3=this.y;
        System.out.println("Tercer Punto :("+puntox3+","+puntoy3+")");
    }
    public double obtenerSuperficie(){
        return 2*this.altura+2*this.base;//Cálculo para obterner la Superficie
    }  
    public double obtenerPerimetro(){
        return this.altura*this.base;//Cálculo para obtener el Perimetro
    }
}
