/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01e11_hilosybolas;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class Hilo extends Thread {

    private String nombre;
    private Bola bola;

    public Hilo(String nombre, Bola bola) {
        super(nombre);
        this.nombre = nombre;
        this.bola = bola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {

// try catch obligado        
        try {
            if (!(bola.getContador() > 15 || bola.getAcumulador() > 100)) {
// número aleatorio 1..25                
                Random r = new Random();
                int segundos = r.nextInt(25) + 1;
                Thread.sleep(segundos * 1000);
//Sumamos 1 cada vez que corre el codigo del hilo        
                bola.setContador(bola.getContador() + 1);
//Sumamos el acumulador de los segundos
                bola.setAcumulador(bola.getAcumulador() + segundos);
                System.out.println("Espero: " + segundos);
                System.out.println(nombre + " FIN ");
                
                Hilo h1=new Hilo("pepe"+bola.getContador(),bola);
                h1.start();
            }else{
                System.out.println("NO PASO LA BOLA A NADIE");
            }
            
        } catch (InterruptedException e) {
            System.out.println("excepcion" + e.getLocalizedMessage());
        }

    }
}
