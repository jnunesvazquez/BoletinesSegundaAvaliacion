
package com.Programacion.boletin_12;

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

    /**
     * Constructor parametrizado
     * @param coche  Que devuelve el objeto
     */
    public Garaxe(com.Programacion.boletin_12.Coche coche) {
        this.coche = coche;
    }

    /**
     * Getter
     * @return tempo de estacionamento
     */
    public int getTempo() {
        return tempo;
    }

    /**
     * Getter
     * @return precio de estacionamiento
     */
    public double getPrecioEstacionamiento() {
        return precioEstacionamiento;
    }

    /**
     * Getter
     * @return os cartos dados polo cliente
     */
    public float getCartosRecibidos() {
        return cartosRecibidos;
    }

    /**
     * Getter
     * @return a volta que devolve a maquina
     */
    public float getCartosDevoltos() {
        return cartosDevoltos;
    }

    /**
     * Metodo para comprobar as prazas de garaxe
     * @param coche
     */
    public void comprobarPlazasGaraxe(Coche coche){
        if (numeroCoches < nºMaximoPlazas){
            System.out.println("Plazas disponibles: " + (nºMaximoPlazas - numeroCoches) + "\n");
            numeroCoches++;
        }
        else {
            System.out.println("No hay más plazas disponibles");
        }
    }

    /**
     * Metodo para calcular o prezo do aparcamento
     * @return precio de estacionamiento
     */
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

    /**
     * Metodo para mostrar la factura
     */
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
