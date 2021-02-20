
package com.Programacion.Boletin_14;

/**
 * Clase coa nosa excepcion
 */
public class TemperaturaErradaExcepcion extends Exception{

    /**
     * Constructor co noso erro
     */
    public TemperaturaErradaExcepcion() {
        super("Tienes un error: ");
    }

    /**
     * Constructor co noso erro
     * @param message o mensaxe que mostra o erro
     */
    public TemperaturaErradaExcepcion(String message){
        super(message);
    }
}
