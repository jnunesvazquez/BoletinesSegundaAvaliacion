
package com.programacion.boletin_14;

public class ConversorTemperaturas {
    
    public static final float temperaturaMinima = 80;
    
    public double centigradosAFahrenheit(float centigrados) throws TemperaturaErradaExcepcion{
        if (centigrados < temperaturaMinima){
            throw new TemperaturaErradaExcepcion("La temperatura tiene que ser superior a 80ºC");
        }else{
            double fahrenheit = (centigrados * 1.8 + 32.4);
            System.out.println("A solucion seria: " + fahrenheit);
            return fahrenheit;
        }
    }
    
    public void centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion{
         if (centigrados < temperaturaMinima){
            throw new TemperaturaErradaExcepcion("La temperatura tiene que ser superior a 80ºC");
        }else{
            double reamur = (centigrados * 0.8);
            System.out.println("A solucion seria: " + reamur);
        }
    }
}