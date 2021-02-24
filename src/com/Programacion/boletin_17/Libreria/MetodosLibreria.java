
package com.Programacion.boletin_17.Libreria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class MetodosLibreria {
     public static void engadirLibro(ArrayList<Libro> listaLibros){
        Libro ele = engadirElementos("Añadiendo libro: ");
        listaLibros.add(ele);
    }
    
    public static Libro engadirElementos(String mensaxe){
        String titulo = JOptionPane.showInputDialog("Titulo: ");
        String autor = JOptionPane.showInputDialog("Autor: ");
        String ISBN = JOptionPane.showInputDialog("ISBN: ");
        float prezo = Integer.parseInt(JOptionPane.showInputDialog("Nota: "));
        int numeroUnidades = Integer.parseInt(JOptionPane.showInputDialog("Numero de libros: "));
        Libro l = new Libro(titulo, autor, ISBN, prezo, numeroUnidades);
        return l;
    }
    
    public static void venderLibro(ArrayList<Libro> listaLibros) throws ExcepcionArray{
        if (listaLibros == null){
            throw new ExcepcionArray("Tienes un error: ");
        }else{
            boolean atopado = true;
            String libroVender = JOptionPane.showInputDialog("Introduce el titulo del libro que va a vender");
            Iterator it = listaLibros.iterator();
            while (it.hasNext()){
                Libro l = (Libro)it.next();
                if (l.getTitulo().equalsIgnoreCase(libroVender)){
                    JOptionPane.showMessageDialog(null, "Libro '" + l.getTitulo() + "' vendido");
                    atopado = true;
                    l.setNumeroUnidades(l.getNumeroUnidades() - 1);
                    if (l.getNumeroUnidades() > 0){
                        JOptionPane.showMessageDialog(null, "Quedan " + l.getNumeroUnidades() + " del libro '" + l.getTitulo() + "'");
                    }
                    else {
                        baixaLibro(listaLibros); 
                    }
                }
            }
            if (!atopado){
                System.out.println("No encontrado");
            }
        }
    }
    
    public static void baixaLibro(ArrayList<Libro> listaLibros) throws ExcepcionArray{
        if (listaLibros == null){
            throw new ExcepcionArray("Tienes un error: ");
        }else{
            Iterator it = listaLibros.iterator();
            while (it.hasNext()){
                Libro l = (Libro)it.next();
                if (l.getNumeroUnidades() == 0){
                    JOptionPane.showMessageDialog(null, "El libro '" + l.getTitulo() + "' ha sido eliminado debido a que no quedan unidades");
                    it.remove();
                    break;
                }
            }
        }
    }
    
    public static void consultarLibro(ArrayList<Libro> listaLibros) throws ExcepcionArray{
        if (listaLibros == null){
            throw new ExcepcionArray("Tienes un error: ");
        }else{
            String elemento = JOptionPane.showInputDialog("Introduce el titulo del libro a buscar");
            boolean atopado = true;
            for (Libro l:listaLibros){
                if (elemento.equals(l.getTitulo())){
                    System.out.println(l.toString()); 
                    atopado = true;
                }
            }
            if (!atopado){
                System.out.println("No encontrado");
            }
        }
    }
    
    public static void amosarLibreria(ArrayList<Libro> listaLibros) throws ExcepcionArray{
        if (listaLibros == null){
            throw new ExcepcionArray("Tienes un error: ");
        }else{
            Collections.sort(listaLibros);
            for (Libro l:listaLibros){
                System.out.println(l + "\n");
            }
        }
    }
}
