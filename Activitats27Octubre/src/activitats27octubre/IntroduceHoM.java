/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitats27octubre;

import java.util.Scanner;

/**
 *
 * @author Sergi
 */
public class IntroduceHoM {

    public static void main(String[] args) {
        do {
            imprimirMensajeInicio();
            leerMensajeInicio();
            tratarMensajeIncio();
            imprimirMensajeContinuar();
            
            
            tratarMensajeContinuar();
            tratarMensajePorSeparado();
            imprimirMensajeContinuar();
        } while (!continuamos);

    }
    
    static Scanner sc = new Scanner(System.in);

    public static char linea;//guardará el valor de lo que ha introducido el usuario por pantalla
    static boolean continuamos = true;//variable semáforo

    public static void imprimirMensajeInicio() {
        System.out.println("Introduce H si quiere un hombre o M si mujer");
    }

    public static void leerMensajeInicio() {
        linea = sc.next().charAt(0); 
        
    }

    public static void tratarMensajeIncio() {
        if ((linea=='H')||('M'==linea)) {
            System.out.println("Lo has escrito bien");
        } else {
            System.out.println("Lo has escrito mal");
        }
    }

    public static void tratarMensajeContinuar() {
        if ((linea == 'S') || (linea == 's')) {
            continuamos = true;
        } else if ((linea == 'N') || (linea == 'n')) {
            continuamos = false;

        } else {
            System.out.println("Tienes que escribir una S/N si continuar");
        }
    }

    public static void tratarMensajePorSeparado() {
        if (linea == 'H') {
            System.out.println("Eres un hombre");

        } else if (linea == 'M') {
            System.out.println("Eres una mujer");
        } else {
            System.out.println("Lo has escrito mal");
        }
    }

    public static void imprimirMensajeContinuar() {
        System.out.println("Quieres introducir otro mensaje : S/N");
    }

}
