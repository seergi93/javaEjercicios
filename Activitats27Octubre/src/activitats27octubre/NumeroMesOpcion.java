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
public class NumeroMesOpcion {
    //variables
    static int i=0;
    /**
     * Metodo imprimierMensaje
     */
    public static void imprimirMensaje(){
        System.out.println("Introduce un valor númerico de 1 a 12 y te diré que mes es");
    }
    /**
     * Metodo leer valor
     */
    public static void leerValor(){
         Scanner sc = new Scanner(System.in);
         i= sc.nextInt();
    }
    /**
     * Metodo tratar valor
     */
    public static void tratarValor(){
        switch(i){
            case 1:
                System.out.println("Es el mes de Enero");
                break;
            
            case 2:
                System.out.println("Es el mes de Febrero");
                break;
            case 3:
                System.out.println("Es el mes de Marzo");
                break;
            case 4:
                System.out.println("Es el mes de Abril");
                break;
            case 5:
                System.out.println("Es el mes de Mayo");
                break;
            case 6:
                System.out.println("Es el mes de Junio");
                break;
            case 7:
                System.out.println("Es el mes de Julio");
                break;
            case 8:
                System.out.println("Es el mes de Agosto");
                break;
            case 9:
                System.out.println("Es el mes de Septiembre");
                break;
            case 10:
                System.out.println("Es el mes de Octubre");
                break;
            case 11:
                System.out.println("Es el mes de Noviembre");
                break;
            case 12:
                System.out.println("Es el mes de Diciembre");
                break;
            default:
                System.out.println("“El número que has escrito no corresponde a ningún mes.");
            break;   
        }
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirMensaje();
        leerValor();
        tratarValor();
    }
}
