
package com.programacion.boletin_14;

public class Boletin_14 {

    public static void main(String[] args) {
        ConversorTemperaturas conversor = new ConversorTemperaturas();
        try {
            conversor.centigradosAFahrenheit(60);
        }catch(TemperaturaErradaExcepcion excepcion){
            System.out.println(excepcion.getMessage());
        }
        try {
            conversor.centigradosAReamur(120);
        }catch(TemperaturaErradaExcepcion excepcion){
            System.out.println(excepcion.getMessage());
        }
    }
} 
