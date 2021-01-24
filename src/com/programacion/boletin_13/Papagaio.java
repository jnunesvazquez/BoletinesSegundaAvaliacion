
package com.programacion.boletin_13;

public class Papagaio extends Aves implements IPodeVoar{

    @Override
    public void voar() {
        System.out.println("Papagaio: ");
        super.caminar();
        System.out.println(" e tamen voar");
    }
    
}
