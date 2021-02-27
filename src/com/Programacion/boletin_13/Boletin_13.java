
package com.Programacion.boletin_13;

/**
 * 20/01/2021
 * @author Joel Nunes
 * Programa de xestion de interfaces
 */
public class Boletin_13 {

    public static void main(String[] args) {
        Gato gato = new Gato();
        Papagaio papagaio = new Papagaio();
        Avestruza avestruza = new Avestruza();
        Morcego morcego = new Morcego();
        Tigre tigre = new Tigre();
        
        gato.gato();
        papagaio.voar();
        avestruza.avestruza();
        morcego.voar();
        tigre.tigre();
    }
    
}
