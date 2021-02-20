
package com.Programacion.Boletin_14;

/**
 * 2/02/2021
 * @author Joel Nunes
 * Programa de xestion de errores
 */
public class Boletin_14 {

    public static void main(String[] args){
        ConversorTemperaturas conversor = new ConversorTemperaturas();
        try {
            conversor.centigradosAFahrenheit(60);
        }catch(TemperaturaErradaExcepcion excepcion){
            System.out.println(excepcion.getMessage());
        }

        conversor.centigradosAReamur(120);
    }
} 
