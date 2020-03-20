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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
//Contador bola
        int contBola=0;
//Acumulador bola
        int AcumBola=0;
//Creamos la bola
        Bola b1=new Bola(contBola,AcumBola);
//Creamos los hilos        
        Hilo h = new Hilo("pepe",b1);
        h.start();
        h.join();
    }
    
}
