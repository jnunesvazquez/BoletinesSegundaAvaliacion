
package com.Programacion.Boletin_14;

public class TemperaturaErradaExcepcion extends Exception{

    public TemperaturaErradaExcepcion() {
        super("Tienes un error: ");
    }

    public TemperaturaErradaExcepcion(String message){
        super(message);
    }
}
