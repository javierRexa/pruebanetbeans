/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01e11_hilosybolas;

/**
 *
 * @author alumno
 */
public class Bola {
    private int contador;
    private int acumulador;

    public Bola(int contador, int acumulador) {
        this.contador = contador;
        this.acumulador = acumulador;
    }

    public Bola() {
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getAcumulador() {
        return acumulador;
    }

    public void setAcumulador(int acumulador) {
        this.acumulador = acumulador;
    }
    
}
