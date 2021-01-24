
package com.Programacion.Boletin_14;

public class TemperaturaErradaExcepcion extends Exception{
    
    public TemperaturaErradaExcepcion(String message){
        super("Tienes un error: " + message);
    }
}
