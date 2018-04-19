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
    /**
    *
    * @return  el Primer punto del rectangulo
    */
    public void optenerPrimerPunto(Rectangulo r){
        double puntox1=r.getX()+r.getBase();//Cálculo para obtener el Primer punto faltante       
        double puntoy1=r.getY();
        System.out.println("Primer Punto :("+puntox1+","+puntoy1+")");
    }
    /**
    *
    * @return  el Segundo punto del rectangulo
    */
    public void optenerSegundoPunto(Rectangulo r){
        double puntox2=r.getX();//Cálculo para obtener el Segundo punto faltante
        double puntoy2=r.getY()+r.getAltura();
        System.out.println("Segundo Punto :("+puntox2+","+puntoy2+")");
    }
    /**
    *
    * @return  el Tercer punto del rectangulo
    */
    public void optenerTercerPunto(Rectangulo r){
        double puntox3=(r.getX()+r.getBase())-r.getBase();//Cálculo para obtener el Tercer punto faltante
        double puntoy3=r.getY();
        System.out.println("Tercer Punto :("+puntox3+","+puntoy3+")");
    }
    /**
    *
    * @return  la Superficie del rectangulo
    */
    public double obtenerSuperficie(Rectangulo r){
        return 2*r.getAltura()+2*r.getBase();//Cálculo para obterner la Superficie
    } 
    /**
    *
    * @return el Perimetro del rectangulo
    */
    public double obtenerPerimetro(Rectangulo r){
        return r.getAltura()*r.getBase();//Cálculo para obtener el Perimetro
    }
}
