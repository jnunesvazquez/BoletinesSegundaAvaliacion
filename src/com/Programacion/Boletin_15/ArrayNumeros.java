
package com.Programacion.Boletin_15;

import java.util.Arrays;

public class ArrayNumeros {
    
    public double[] crearArray(){
        int tamaño = 6;
        double [] numeros = new double[tamaño];
        for (int i = 0; i < tamaño; i++) {
            numeros[i] = Math.floor(Math.random() * 49 + 1);
        }
        return numeros;
    }    
    
    public void invertirArray(double [] numeros){
        System.out.println("Numeros ordenados " + Arrays.toString(numeros));      
        for (int i = 0; i < numeros.length / 2; i++) {
            int aux = (int) numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = aux;
        }
        String cadena = "Numeros al reves: [";
        for(int i = 0;i < numeros.length;i++){
            cadena += numeros[i] + ", ";
        }
        cadena = cadena.substring(0, cadena.length() - 2);
        System.out.println(cadena + "]");
    }
    
        
    
    
    
        
        
    
}
