
package com.Programacion.boletin_16;

import com.joel.arrays.CrearArrays;

/**
 * Clase para manipular alturas dentro de un array
 */
public class Ejercicio_2 {

    float [] numeros = CrearArrays.crearArrayFloat();

    /**
     * Metodo para calcular la media de varias alturas e introducirlas en diferentes arrays
     */
    public void calcularAlturas(){
        float suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        float media = suma / numeros.length;
        System.out.printf("\n Altura media: " + media);

        float [] alturasAltas = new float [10];
        float [] alturasBaixas = new float [10];
        float aux;
        int altas = 0;
        int baixas = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media){
                altas++;
                aux = numeros[i];
                numeros[i] = alturasAltas[i];
                alturasAltas[i] = aux;
            }
            else if (numeros[i] < media){
                baixas++;
                aux = numeros[i];
                numeros[i] = alturasBaixas[i];
                alturasBaixas[i] = aux;
            }
        }
        System.out.println("\n Alturas superiores a la media: " + altas + "\n Alturas inferiores a la media: " + baixas);
        CrearArrays.visualizarArray(alturasAltas, "Alumnos altos [");
        CrearArrays.visualizarArray(alturasBaixas, "Alumnos bajos [");
    }
}
