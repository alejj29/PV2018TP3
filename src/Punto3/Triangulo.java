/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

/**
 *
 * @author pc
 */
public class Triangulo {
    private double x1,y1,x2,y2;

    public Triangulo() {
    }

    public Triangulo(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    public boolean compararExtremos(Triangulo extremo1,Triangulo extremo2){
        return extremo1.getX2()==extremo2.getX1() && extremo1.getY2()==extremo2.getY1();
    }
    public double sacarDistanciaEntrePuntos(Triangulo lado){
        return Math.hypot(lado.getX2()-lado.getX1(),lado.getY2()-lado.getY1());
    }
}