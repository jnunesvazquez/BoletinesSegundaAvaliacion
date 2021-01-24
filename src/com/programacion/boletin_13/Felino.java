
package com.programacion.boletin_13;

public class Felino extends Mamifero implements IPodeNadar{

    @Override
    public void nadar() {
        System.out.println("Felino: ");
        super.caminar();
        System.out.println(" e tamen nadar");
    }

    
}
