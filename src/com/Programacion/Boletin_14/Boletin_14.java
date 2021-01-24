
package com.Programacion.Boletin_14;

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
