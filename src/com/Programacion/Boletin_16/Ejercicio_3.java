
package com.Programacion.Boletin_16;

/**
 * Clase para dividir un String
 */
public class Ejercicio_3 {
    /**
     * Metodo para dividir un String e introducirlo en dos variables
     */
    public void crearString(){
        String cadena = "www.javadesde0.com";
        System.out.println("Texto original: " + cadena);
        String parte1 = cadena.substring(0, 8);
        String parte2 = cadena.substring(8, cadena.length());
        System.out.println("Primera parte: " + parte1);
        System.out.println("Segunda parte: " + parte2);
        String completo = parte1 + parte2;
        System.out.println("Parte completa: " + completo);
    }

    /**
     * Metodo para dividir un String e introducirlo en un array
     */
    public void crearStringArray(){
        String cadena = "www.java-desde0.com";
        System.out.println("Texto original: " + cadena);
        String [] dividir = cadena.split("-");
        System.out.println("Texto dividido:\n" + dividir[0] + "\n" + dividir [1]);
        String parteCompleta = dividir[0] + dividir[1];
        System.out.println("Parte completa: " + parteCompleta);
    }
}
