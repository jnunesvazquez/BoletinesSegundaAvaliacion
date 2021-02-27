
package com.Programacion.boletin_17.Libreria;

/**
 * Clase para lanzar a excepcion de si un ArrayList e nulo
 */
public class ExcepcionArray extends Exception{

    public ExcepcionArray() {
        super();
    }
    
    public ExcepcionArray(String message) {
        super(message);
    }
    
}
