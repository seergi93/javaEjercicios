/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;
//import java.util.*;

/**
 *
 * @author Pegea
 */
public class Menu {
//Declaracion var globales

    static Scanner sc = new Scanner(System.in);//para leer teclado
    static boolean salir = true;//para controlar la salida del programa
    static String mensaje="";//para introducir mensaje por pantalla
    
   /**
    * Programa principal que gestionará todo el funcionamiento del proyecto
    * @param args 
    */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        do {
            menu();
            mensaje = "Introduce el número de opcion";
            opcion = leerEntero(mensaje);
            tratarMenu(opcion);
        } while (salir);
    }
/**
 * Método que dada una opción introducida por el usuario
 * @param op te la trata en función del valor introducido
 */
    public static void tratarMenu(int op) {
        int num, n1, n2;
        switch (op) {
            case 1:
                mensaje="Escribe un número y te diré sis es par o no";
                num = leerEntero(mensaje);
                if (evaluarSiEsPar(num)) {
                    System.out.println("El número e spar");
                } else {
                    System.out.println("El número es impar");
                }
                break;
            case 2:
                System.out.println("Escribe dos números y te diré cuál es el mayor");
                mensaje="Escribe num1";
                n1 = leerEntero(mensaje);
                 mensaje="Escribe num2";
                n2 = leerEntero(mensaje);
                mayorDeDos(n1, n2);
                break;
            case 3:
                salir = false;
                break;
            default:
                System.out.println("Fijate en lo que escribes");
                break;

        }
    }
    /**
     * Método que  dado un número entero cualquiera
     * @param num este es el que introduzco
     * @return true si el número ha sido par y false en caso contrario.
     */
    public static boolean evaluarSiEsPar(int num){
        boolean resultado=false;
         if(num%2==0){
             resultado=true;
         }
         else{
             resultado=false;
         }
         return resultado;
    }
    /**
     * Método que dada un mensaje introducido 
     * @param sms
     * @return devuelve el entero que ha escrito el usuario
     */
    public static int leerEntero(String sms){
        int entero;
        System.out.println(sms);
        entero=sc.nextInt();
        return entero;
        
    }
    /**
     * Método que dado dos números cualesquiera 
     * @param num1
     * @param num2 
     * te dice cuál es el mayor de los dos y también te dice si són iguales
     */
    public static void mayorDeDos(int num1, int num2){
        if (num1>num2){
            System.out.println("El numero "+num1+" es mayor que el "+num2);
        }
        else{
            if(num2>num1){
              System.out.println("El numero "+num2+" es mayor que el "+num1);  
            }
            else{
                System.out.println("Los numeros son iguales ");
            }
        }
    }
    
    /**
     * Método para mostrar por pantalla las opciones que tiene el usuario.
     */
    public static void menu() {
        System.out.println("Introduce la opción deseada");
        System.out.println("1.Introduce un número y te diré si es par");
        System.out.println("2.Introduce dos números y te diré cuál es el mayor");
        System.out.println("3.Salir");
    }
    
}
