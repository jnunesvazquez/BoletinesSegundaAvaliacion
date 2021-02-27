
package com.Programacion.boletin_18.buzon_correos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Clase buzon de correos
 */
public class Buzon {

    ArrayList<Correo> correosElectronicos = new ArrayList();//Array onde almacenar os correos

    /**
     * Metodo para calcular o numero de correos que hay no buzon
     * @return numero de correos
     */
    public int numeroDeCorreos(){
        int correos = 0;
        for (Correo c:correosElectronicos){
            correos++;
        }
        return correos;
    }

    /**
     * Metodo para dar parametros a un correo
     * @return objeto Correo
     */
    public Correo darParametrosCorreo(){
        String titulo = (JOptionPane.showInputDialog("Titulo do correo: "));
        String contenido = (JOptionPane.showInputDialog("Contenido do correo: "));
        boolean lidos = false;
        Correo c = new Correo(titulo, contenido, lidos);
        return c;
    }

    /**
     * Metodo que engade un correo ao buzon
     * @param c
     */
    public void engade(Correo c){
        c = darParametrosCorreo();
        correosElectronicos.add(c);
    }

    /**
     * Metodo para mostrar se quedan correos por ler
     * @return factor que asegura se foron lidos ou non
     */
    public boolean porLer(){
        boolean correosPorLer = false;
        for (Correo c:correosElectronicos){
            if (c.isLidos() == false){
                correosPorLer = true;
            }   
        }
        return correosPorLer;
    }

    /**
     * Metodo para mostrar o primeiro correo non lido do buzon
     * @return correo non lido
     */
    public String amosarPrimerNoLeido(){
        String correo = null;
        for (Correo c:correosElectronicos){
            if (c.isLidos() == false){
                correo = c.getTitulo() + " no ha sido leido";
                c.toString();
                c.setLidos(true);
                break;
            }
            else {
                correo = "Non quedan correos non lidos";
            }
        }
        return correo;
    }

    /**
     * Metodo que amosa un correo dado por consola
     * @param k a posicion do correo no buzon
     * @return correo
     */
    public String amosa(int k){
        String correo = null;
        k = Integer.parseInt(JOptionPane.showInputDialog("Que correo quere ler?"));
        for (int i = 0; i < correosElectronicos.size(); i++){
            if (i == k){
                correo = correosElectronicos.get(i -1).toString();
                correosElectronicos.get(i - 1).setLidos(true);
            }
            else{
                correo = "Non existe ese correo";
            }
        }
        return correo;
    }

    /**
     * Metodo para eliminar un correo
     * @param k posicion do correo no buzon
     */
    public void eliminar(int k){
        k = Integer.parseInt(JOptionPane.showInputDialog("Que correo quere eliminar?"));
        for (int i = 0; i < correosElectronicos.size(); i++){
            if (i == k){
                System.out.println("Correo '" + correosElectronicos.get(i - 1) + "' eliminado");
                correosElectronicos.remove(correosElectronicos.get(i - 1));
                break;
            }
            else if (correosElectronicos.size() < k){
                System.out.println("Non existe ese correo");
            }
        }
    }
}