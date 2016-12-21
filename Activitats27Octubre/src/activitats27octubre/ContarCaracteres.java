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
public class ContarCaracteres {

    Scanner sc = new Scanner(System.in);
    static int buffer = 1024;
    static char finalDeLinea = '.';

    static char[] linea = new char[buffer];

    static int posicion;
    static char letra;
    static String lineaLeida;

    static public void imprimirMensaje() {
        System.out.println("Introduce una línea de caracteres con "+ finalDeLinea +" al final de linea");
    }

    public static void leerLinea() {
        Scanner sc = new Scanner(System.in);
        lineaLeida = sc.nextLine();
    }

    public static void tratarLinea() {
        int i = 0;
        lineaLeida = lineaLeida.toLowerCase();
        lineaLeida = lineaLeida.replace(" ", "");

        int posUltima = lineaLeida.length() - 1;//declaración de variable con el número de caracteres introducidos -1 para porque son 20 posiciones y la 0 cuenta. entonces 19
        char ultimaPosicion = lineaLeida.charAt(posUltima);//Para coger el último carácter de lo que escribio el usuario.
        if (ultimaPosicion != '!') {
            System.out.println("No has introducido ! al final como te he dicho:");
        } else {
            System.out.println("has introducido :" + (posUltima - 1) + "carácteres");// menos uno para que no cuente el '!'
        }

        // imprimirTotalCaracteres();
    }

    public static String eliminarBlancos(String letras) {
        String valor = letras;
        valor = valor.replaceAll(" ", "");
        return valor;

    }

    public static String convertirMinusculas(String letras) {
        String valor = letras;
        valor = valor.toLowerCase();
        return valor;
    }

    public static void main(String[] args) {

        imprimirMensaje();
        leerLinea();
        tratarLinea();//Imprimiré ¿cuántos caracteres no blancos hay?
        System.out.println("El número total de caracteres introducidos es :" + posicion);

    }

}
