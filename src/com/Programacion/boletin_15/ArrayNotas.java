
package com.Programacion.boletin_15;

import javax.swing.JOptionPane;

/**
 * Clase para trabajar sobre arrays de notas
 */
public class ArrayNotas {
    
    public int [] notas;
    public int [] nomeAlumno;

    /**
     * Metodo para introducir los datos en el array
     * @param notas
     * @param nomeAlumno
     * @return
     */
    public int [] introducirDatos(int [] notas, String [] nomeAlumno){
        for(int i = 0; i < notas.length; i++){
            nomeAlumno[i] = JOptionPane.showInputDialog("Introduce el nombre del alumno"); 
            do{
                notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del alumno"));
            }while (notas[i] < 0 || notas[i] > 10); 
        }
        return notas;
    }

    /**
     * Metodo para visualizar as notas dos alumnos
     * @param notas
     * @param nomeAlumno
     */
    public void visualizarNotas(int [] notas, String [] nomeAlumno){
        int aprobados = 0;
        int suspensos = 0;
        System.out.println("Alumnos aprobados:");
        for(int i = 0; i < notas.length; i++){
            if (notas[i] >= 5){
                aprobados++;
                System.out.println("Alumno: " + nomeAlumno[i] + " ----> Nota final: " + notas[i]);
            }
            else {
                suspensos++;
            }
        }
        System.out.println("\nAprobados ----> " + aprobados + "\nSuspensos ----> " + suspensos);
    }

    /**
     * Metodo para calcular e mostrar a nota media da clase
     * @param notas
     */
    public void notaMediaClase(int [] notas){
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma = (int) (suma + notas[i]);
        }
        int media = suma / notas.length;
        System.out.printf("\n Nota media del curso: " + media);
    }

    /**
     * Metodo para mostrar a nota mais alta
     * @param notas
     * @param nomeAlumno
     */
    public void notaMasAlta(int [] notas, String [] nomeAlumno) {
	int masAlta = 0;
	String alumno = null;
	for (int i = 0; i < notas.length; i++) {
	    if (notas[i] > masAlta) {
		masAlta = notas[i];
		alumno = nomeAlumno[i];
	    }
	}
        System.out.println("\n Nota más alta: " + masAlta + " del alumno " + alumno);
    }

    /**
     * Metodo para buscar a nota dun alumno introducido por teclado
     * @param notas
     * @param nomeAlumno
     */
    public void buscarElementoTeclado(int [] notas, String [] nomeAlumno){
        boolean atopado = true;
        String nome = JOptionPane.showInputDialog("Introduce o nome do alumno que queres buscar");
        for (int i = 0; i < notas.length; i++){
            if (nomeAlumno[i].equalsIgnoreCase(nome)){
                System.out.println("Alumno: " + nomeAlumno[i] + "Nota: " + notas[i]);
                atopado = true;
            }
        }
        if (atopado == false){
            System.out.println("No encontrado");
        }
    }

    /**
     * Metodo para buscar a nota dun alumno introducido como teclado
     * @param notas
     * @param nomeAlumno
     * @param nome
     */
    public void buscarElementoParametro(int [] notas, String [] nomeAlumno, String nome){
        boolean atopado = true;
        for (int i = 0; i < notas.length; i++){
            if (nomeAlumno[i].equalsIgnoreCase(nome)){
                System.out.println("Alumno: " + nomeAlumno[i] + "\n Nota: " + notas[i]); 
                atopado = true;
            }
        }
        if (atopado == false){
            System.out.println("No encontrado");
        }
    }

    /**
     * Metodo para ordenar as notas de menor a maior da clase
     * @param notas
     * @param nomeAlumno
     */
    public void ordenarNotas(int [] notas, String [] nomeAlumno){
        int auxnota;
        String auxnome = null;
        int i, j;
        for (i = 0; i < notas.length - 1; i++) {
            for (j = i +1; j < notas.length; j++) {
                 if (notas[j] < notas[i]) {
                    auxnota = notas[i];
                    notas[i] = notas[j];
                    notas[j] = auxnota;
                    auxnome = nomeAlumno[i];
                    nomeAlumno[i] = nomeAlumno[j];
                    nomeAlumno[j] = auxnome;
                }
            }
        }           
    }
}

