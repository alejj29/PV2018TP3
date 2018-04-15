/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

import java.util.ArrayList;

/**
 *
 * @author ale
 */
public class GestoRectangulo {
    public ArrayList <Rectangulo> rectangulo= new ArrayList <Rectangulo>();

    public ArrayList<Rectangulo> getRectangulo() {
        return rectangulo;
    }

    public void setRectangulo(ArrayList<Rectangulo> rectangulo) {
        this.rectangulo = rectangulo;
    }
    
    public void agregarRectangulo(Rectangulo rectangulo){        
        this.rectangulo.add(rectangulo);
    }
}
