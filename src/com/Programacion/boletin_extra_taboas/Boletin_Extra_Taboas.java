
package com.Programacion.boletin_extra_taboas;

/**
 * 27/02/2021
 * @author Joel Nunes
 * Programa para mostrar a taboa da liga de futbol
 */
public class Boletin_Extra_Taboas {

    public static void main(String[] args) {
        LigaFutbol liga = new LigaFutbol();
        LigaFutbol.crearTablaGoles();
        liga.mostrarMarcador();
        LigaFutbol.calcularGolesTotales();
        liga.ordenarGolesLiga();
        liga.buscarMayorGolesJornada();
        liga.buscarEquipo();
    }
}