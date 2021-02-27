
package com.Programacion.boletin_16;

import com.joel.arrays.CrearArrays;

/**
 * Clase para dividir numeros en pares y negativos
 */
public class Ejercicio_1 {

    /**
     * Metodo que muestra los numeros pares y negativos dentro del array
     */
    public void numerosParesAndNegativos(){
        int [] numeros = CrearArrays.crearArrayInt(10);
        int i;
        for (i = 0; i < numeros.length; i++){
            System.out.println("Numero " + (i + 1) + " = " + numeros[i]); 
        }
        int par = 0;
        int negativo = 0;
        for (i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0) {
                par++;
            }
            else if (numeros[i] < 0){
                negativo++;
            }
        }
        System.out.println("Pares = " + par + " Negativos = " + negativo);
    }
}
