/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitats27octubre;

import java.util.Scanner;

/**
 *
 * @author toshiba
 */
public class MajorEdat {

    /**
     * @param args the command line arguments
     */
  static  int majoriaEdat = 18;
  static  int edat;//es el valor que introducira el usuario
   static String mensaje = "Introduce un valor para la edat";
  public static void imprimirMensaje(String sms) {
        System.out.println(sms);
    }

    public static void leerEdat() {
        Scanner sc = new Scanner(System.in);
        edat = sc.nextInt();

    }

    public static void tratarEdatAlternativo() {
        if (edat >= majoriaEdat) {
            mensaje = "Eres mayor de edad. Por tanto puedes votar";
            imprimirMensaje(mensaje);
        } else {
            mensaje = "No eres mayor de edad.No puedes votar";
            imprimirMensaje(mensaje);
        }

    }

    
    public static int suma(int a, int b) {
        return (a + b);

    }

    //constructor de la classe
    public static void main(String[] args){
        imprimirMensaje(mensaje);
        leerEdat();
        
        tratarEdatAlternativo();
        mensaje = "La edad que has introducido es:" + edat;
        imprimirMensaje(mensaje);

        //System.out.println("La suma de 5 i 2 es:" + suma(5, 2));
    }

  
}


