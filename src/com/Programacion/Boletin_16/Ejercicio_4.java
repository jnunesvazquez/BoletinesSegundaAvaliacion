
package com.Programacion.Boletin_16;

/**
 * Clase para variar un String entre minusculas y mayusculas
 */
public class Ejercicio_4 {
    /**
     * Metodo para cambiar un String entre mayusculas y minusculas
     */
    public void cambioFormato(){
        String texto = "javeros";
        System.out.println("Texto original: " + texto);
        texto = texto.toUpperCase();
        System.out.println("En maiuscula: " + texto);
        texto = texto.toLowerCase();
        System.out.println("En minuscula: " + texto);
    }
    
}
