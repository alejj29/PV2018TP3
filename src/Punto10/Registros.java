/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Registros {
    private int usuarios;
    private int codigo;
    private int cuota;

    public Registros(int usuarios, int codigo, int cuota) {
        this.usuarios = usuarios;
        this.codigo = codigo;
        this.cuota = cuota;
    }

    public int getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(int usuarios) {
        this.usuarios = usuarios;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    
}
