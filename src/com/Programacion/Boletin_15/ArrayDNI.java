
package com.Programacion.Boletin_15;

import javax.swing.JOptionPane;

public class ArrayDNI {

    public void introducirDNI(){
        char [] letrasDNI = {'A','B','C','D','E','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
        int [] numeroDNI = {3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};
        String numero;
        do{
            numero = JOptionPane.showInputDialog("Introduce el numero de DNI");
            try {
                int numeroCalculo = Integer.parseInt(numero) % 23;
                for (int i = 0; i < numeroDNI.length; i++){
                    if (numeroDNI[i] == numeroCalculo && numero.length() == 8){
                        System.out.println("Letra: " + letrasDNI[i]);
                    }
                }
            }catch(Exception e) {
                System.out.println("El DNI no es valido: " + e.getMessage());
            }
        }while (numero.length() != 8);
    }
}
