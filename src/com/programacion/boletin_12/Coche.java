
package com.programacion.boletin_12;

/**
 * Clase de tipo coche
 */
public class Coche {
    private String matricula;
    
    /**
     * Constructor parametrizado
     * @param matricula 
     */
    public Coche(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula;
    }
    
    
}
