/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Arrays;

/**
 *
 * @author cubas
 */
public class ArregloTurno {
    private Turno TurnoA[];
    private int indice;
    
    public ArregloTurno() {
        this.indice = 0;
        this.TurnoA = new Turno[4];
        
    }

    public Turno[] getTurnoA() {
        return TurnoA;
    }

    public int getIndice() {
        return indice;
    }
    public boolean agergarTurno(Turno turno){
        boolean result=false;
        
        result=true;
        
        return result;
    }
    
    
    
    @Override
    public String toString() {
        return "ArregloTurno{" + "TurnoA=" + Arrays.toString(TurnoA) + ", indice=" + indice + '}';
    }
    
    
}
