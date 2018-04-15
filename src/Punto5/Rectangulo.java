/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

/**
 *
 * @author ale
 */
public class Rectangulo {
    private double y;
    private double x;
    private double altura;
    private double base;
    
    public Rectangulo(){
        
    }
    
    public Rectangulo(double y, double x, double altura, double base) {
        this.y = y;
        this.x = x;
        this.altura = altura;
        this.base = base;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public double obtenerPerimetro(){
        return 2*this.altura+2*this.base;
    }
    public double obtenerSuperficie(){
        return this.base*this.altura;
    }
    
    
}
