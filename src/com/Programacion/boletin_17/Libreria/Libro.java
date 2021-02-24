
package com.Programacion.boletin_17.Libreria;

public class Libro implements Comparable<Libro>{
    private String titulo;
    private String autor;
    private String ISBN;
    private float prezo;
    private int numeroUnidades;

    public Libro(){
    }

    public Libro(String titulo, String autor, String ISBN, float prezo, int numeroUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.numeroUnidades = numeroUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public void setNumeroUnidades(int numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }

    @Override
    public String toString() {
        return "Libro {" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", numeroUnidades=" + numeroUnidades + '}';
    }

    @Override
    public int compareTo(Libro t) {
        if ((this.titulo.compareToIgnoreCase(t.titulo)) < 0){
            return 1;
        }
        else if ((this.titulo.compareToIgnoreCase(t.titulo)) > 0){
            return -1;
        }
        else {
            return 0;
        }
    }
}