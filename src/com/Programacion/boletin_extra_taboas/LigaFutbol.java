
package com.Programacion.boletin_extra_taboas;

import javax.swing.JOptionPane;

/**
 * Clase para manexar a base de datos da liga
 */
public class LigaFutbol {
    
    String [] equipos = {"Barcelona", "Atletico", "R.Madrid", "R.Sociedad", "Sevilla", "Villareal", "Levante", "Betis", "Athletic", "Valencia", "Celta", "Granada", "Osasuna", "Valladolid", "Cadiz", "Alaves", "Eibar", "Elche", "Huesca", "Getafe"};
    static String [] xornadas = new String [38];
    static int [][] golesEquipoJornada = new int [20][38];
    static int [] golesTotales = new int [20];

    /**
     * Metodo para crear a taboa da liga
     * @return taboa de goles
     */
    public static int[][] crearTablaGoles() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 38; j++) {
                golesEquipoJornada[i][j] = (int) (Math.random() * 8 + 1);
            }
        }
        return golesEquipoJornada;
    }

    /**
     * Metodo para mostrar a taboa
     */
    public void mostrarMarcador(){
        String cadena = "Equipo/Jornada\t";
        for (int k = 0; k < xornadas.length; k++){
            xornadas [k] = "X" + (k + 1) + " | ";
            cadena += xornadas [k];
        }
        cadena = cadena.substring(0, cadena.length() - 2);
        System.out.println(cadena);
        for (int j = 0; j < equipos.length; j++) {
            System.out.print("\n" + equipos[j] + "     ");
            for (int k = 0; k < 38; k++) {
                System.out.print(golesEquipoJornada[j][k] + "     ");
            }
        }
    }

    /**
     * Metodo para calcular os goles totales de cada equipo na liga
     * @return goles totales
     */
    public static int [] calcularGolesTotales(){
        int aux;
        for (int i = 0; i < golesEquipoJornada.length; i++){
            aux = 0;
            for (int j = 0; j < golesEquipoJornada[i].length; j++){
                aux += golesEquipoJornada[i][j];
                golesTotales[i] = aux;
            }
        }
        return golesTotales;
    }

    /**
     * Metodo para ordenar a taboa da liga
     */
    public void ordenarGolesLiga(){
        int auxGol = 0;
        String auxEqu;
        System.out.println("\n");
        for (int i = 0; i < golesTotales.length - 1; i++) {
            for (int j = i + 1; j < golesTotales.length; j++) {
                 if (golesTotales[i] > golesTotales[j]) {
                    auxGol = golesTotales[i];
                    golesTotales[i] = golesTotales[j];
                    golesTotales[j] = auxGol;
                    auxEqu = equipos[i];
                    equipos[i] = equipos[j];
                    equipos[j] = auxEqu;
                }
            }
            System.out.println(" El " + equipos[i] + " marco " + golesTotales[i] + " goles");
        }
    }

    /**
     * Metodo para buscar o equipo con maiores goles nunha xornada
     */
    public void buscarMayorGolesJornada(){
        int aux = 0;
        String auxEqu = null;
        System.out.println("\n");
        int xornada = Integer.parseInt(JOptionPane.showInputDialog("Introduce la jornada donde buscar"));
        for (int j = 0; j < 38; j++) {
            if(xornada - 1 == j){
                for (int i = 0; i < 20; i++) {
                    if (aux < golesEquipoJornada[i][j] || aux == golesEquipoJornada[i][j]){
                    aux = golesEquipoJornada[i][j];
                    auxEqu = equipos[j];
                    }
                }
            }
        }
        System.out.println("El equipo que más goles ha marcado en la jornada " + xornada + " ha sido " + auxEqu + " con " + aux + " goles");
    }

    /**
     * Metodo para buscar o numero de goles dun equipo nunha xornada
     */
    public void buscarEquipo(){
        String auxEqu = null, auxX = null;
        int aux = 0;
        String equipo = JOptionPane.showInputDialog("Introduce o equipo que queres buscar");
        int xornada = Integer.parseInt(JOptionPane.showInputDialog("Introduce la jornada donde buscar"));
        for (int i = 0; i < equipos.length; i++) {
            if (equipos[i].equalsIgnoreCase(equipo)){
                for (int j = 0; j < golesEquipoJornada[j][i]; j++){
                    if (xornada == j){
                    aux = golesEquipoJornada[j][i];
                    auxEqu = equipos[i];
                    auxX = xornadas[j];
                    }
                }
                System.out.println("El " + auxEqu + " ha marcado " + aux + " en la jornada " + auxX);
            }
        }
    }
}