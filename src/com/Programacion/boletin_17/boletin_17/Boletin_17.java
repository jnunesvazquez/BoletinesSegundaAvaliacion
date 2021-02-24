
package com.Programacion.boletin_17.boletin_17;

import com.Programacion.boletin_17.Libreria.ExcepcionArray;
import com.Programacion.boletin_17.Libreria.Libro;
import com.Programacion.boletin_17.Libreria.MetodosLibreria;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin_17 {

    public static void main(String[] args) throws ExcepcionArray {
        ArrayList<Libro> listaLibros = new ArrayList();
        String opcion;
        do{
            opcion = JOptionPane.showInputDialog("\tMENU \n 1. Engadir libro\n 2. Vender libro\n 3. Amosar libros dispoñibles\n 4. Consultar un libro\n5. Sair");
            switch(opcion){
                case "1": MetodosLibreria.engadirLibro(listaLibros);
                break;
                case "2": MetodosLibreria.venderLibro(listaLibros);
                break;
                case "3": MetodosLibreria.amosarLibreria(listaLibros);
                break;
                case "4": MetodosLibreria.consultarLibro(listaLibros);
                break;
                case "5": System.exit(0);
            }
        }while(!opcion.equalsIgnoreCase("5"));
    }
}
