
package com.Programacion.Boletin_15;

import javax.swing.JOptionPane;

public class Boletin_15 {

    public static void main(String[] args) {

        //Ejercicio 1
        ArrayNumeros array1 = new ArrayNumeros();
        double [] numeros = array1.crearArray();
        array1.invertirArray(numeros);

        //Ejercicio 2 y 3
        ArrayNotas array2 = new ArrayNotas();
        int numeroNotas = Integer.parseInt(JOptionPane.showInputDialog("Introduce a cantidade de alumnos da clase"));
        int [] notas = new int[numeroNotas];
        String [] alumno = new String[numeroNotas];
        array2.introducirDatos(notas, alumno);
        array2.ordenarNotas(notas, alumno);
        array2.visualizarNotas(notas, alumno);
        array2.buscarElementoTeclado(notas, alumno);
        array2.notaMediaClase(notas);
        array2.notaMasAlta(notas, alumno);

        //Ejercicio 4
        ArrayDNI array3 = new ArrayDNI();
        array3.introducirDNI();
        
    }
}