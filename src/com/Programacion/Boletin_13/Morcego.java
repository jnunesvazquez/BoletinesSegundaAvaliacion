
package com.Programacion.Boletin_13;

public class Morcego extends Mamifero implements IPodeVoar{

    @Override
    public void voar() {
        System.out.println("Morcego: ");
        super.caminar();
        System.out.println(" e pode voar");
    }
}
