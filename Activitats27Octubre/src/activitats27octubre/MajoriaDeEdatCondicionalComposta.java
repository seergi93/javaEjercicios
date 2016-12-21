/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitas27octubre;

import java.util.Scanner;

/**
 *
 * @author Toni
 */
public class MajoriaDeEdatCondicionalComposta {
    // Variables
    static final int majoriaEdat=18;
    static int edat;
    /**
     * Metodo mensaje
     */
    public static void imprimirMensaje(){
        System.out.println("Introduce un valor para la edat");
    }
    /**
     * Metodo leer edat
     */
    public static void leerEdat(){
            Scanner sc = new Scanner(System.in);
            edat= (int) sc.nextInt();
    }
    /**
     * Metodo para tratar la edat
     */
    public static void tratarEdat(){
        if(edat>=majoriaEdat){
            imprimirMensajeVotar();
        }else{
            mensajeNoVotar();
        }
    }
    /**
     *Metodo ya puedes votar
     */
    public static void imprimirMensajeVotar(){
        System.out.println("Ya puedes votar");
    }
    /**
     * Metodo no puedes votar
     */
    public static void mensajeNoVotar(){
        System.out.println("No puedes votar");
    }
    /**
     * Metodo 
     */
     public static void imprimirEdad(){
         System.out.println("La edad has introducido es:");
         System.out.println(edat);
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirMensaje();
        leerEdat();
        tratarEdat();
        imprimirEdad();
    }
}
