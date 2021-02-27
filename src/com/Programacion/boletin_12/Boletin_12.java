
package com.Programacion.boletin_12;

/**
 * 16/01/2021
 * @author Joel Nunes
 * Programa de xestion dun garaxe
 */
public class Boletin_12 {

    public static void main(String[] args) {
        
        Coche coche1 = new Coche("4587LP");
        Garaxe cliente = new Garaxe(coche1);
        cliente.comprobarPlazasGaraxe(coche1);
        cliente.calcularPrezoAparcamento();
        cliente.amosarFactura();
        Coche coche2 = new Coche("6472MKI");
        cliente.comprobarPlazasGaraxe(coche2);
        cliente.calcularPrezoAparcamento();
        cliente.amosarFactura();
        
    } 
}
