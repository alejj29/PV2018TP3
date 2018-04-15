/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto_05;

/**
 *
 * @author Carretero Diego
 */
public class circulo {
    private double x,y,radio,superficie;

    public circulo() {
    }

    public circulo(double x, double y, double radio, double superficie) {
        this.x = x;
        this.y = y;
        this.radio = radio;
        this.superficie = superficie;
    }

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

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "circulo{" + "x=" + x + ", y=" + y + ", radio=" + radio + ", superficie=" + superficie + '}'+"/n";
    }
    
    
    public double sacarSuperficieCirculo(circulo newCirculo){
        return Math.PI*newCirculo.radio*newCirculo.radio;
    }
}
