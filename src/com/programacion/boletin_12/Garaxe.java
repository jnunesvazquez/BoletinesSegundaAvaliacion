
package com.programacion.boletin_12;

import javax.swing.JOptionPane;

/**
 * Clase de tipo garaxe
 */
public class Garaxe {
    
    private int numeroCoches;
    private int tempo;
    private Coche coche;
    public static final int nºMaximoPlazas = 5;
    private double precioEstacionamiento;
    private float cartosRecibidos;
    private float cartosDevoltos;

    public Garaxe(com.programacion.boletin_12.Coche coche) {
        this.coche = coche;
    }

    public int getTempo() {
        return tempo;
    }

    public double getPrecioEstacionamiento() {
        return precioEstacionamiento;
    }

    public float getCartosRecibidos() {
        return cartosRecibidos;
    }

    public float getCartosDevoltos() {
        return cartosDevoltos;
    }
    
    public void comprobarPlazasGaraxe(Coche coche){
        if (numeroCoches < nºMaximoPlazas){
            System.out.println("Plazas disponibles: " + (nºMaximoPlazas - numeroCoches) + "\n");
            numeroCoches++;
        }
        else {
            System.out.println("No hay más plazas disponibles");
        }
    }
    
    public double calcularPrezoAparcamento(){
        if (numeroCoches < nºMaximoPlazas){
            do {
                tempo = Integer.parseInt(JOptionPane.showInputDialog("Canto tempo estivo o cliente estacionado (en horas)?"));
                if (tempo > 0 && tempo <= 3){
                    precioEstacionamiento = 1.5;
                }
                else if (tempo > 3){
                    precioEstacionamiento = (1.5 + 0.2 * (tempo - 3));
                }
                cartosRecibidos = Float.parseFloat(JOptionPane.showInputDialog("Cantos cartos introduciu o cliente?"));
                cartosDevoltos = cartosRecibidos - (float)precioEstacionamiento;
            }while (tempo < 0);
            
        }
        else {
            System.out.println("No se puede calcular el precio del aparcamiento");
        }
        return precioEstacionamiento;
    }
    
    public void amosarFactura(){
        System.out.println("\tFactura" 
                + "\nMatricula: " + coche.toString() 
                + "\nTempo: " + getTempo() 
                + "\nPrecio: " + getPrecioEstacionamiento() 
                + "\nCartos Recibidos: " + getCartosRecibidos() 
                + "\nCartos Devoltos: " + getCartosDevoltos() 
                + "\nGrazas por usar o noso aparcadoiro\n");
    }
}
