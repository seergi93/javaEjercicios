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
public class DetectarVocalsDebilIFortesBucleAnnidat {
    //variables
        static String letra;
    /**
     * Metodo mensaje para escribir
     */
        public static void imprimirMensaje(){
            System.out.println("Introduce una letra");
        }
    /**
     * Metodo leer letra
     */
        public static void leerLetra(){
            Scanner sc = new Scanner(System.in);
            letra = sc.next();
        }
    /**
     * Metodo para tratar letra
     */
        public static void tratarLetra(){

            if("i".equals(letra) || "u".equals(letra)){
                System.out.println("La letra que has introducido es una vocal debil");
            }else{
                if("e".equals(letra) || "a".equals(letra) || "o".equals(letra)){
                    System.out.println("La letra que has introducido es una vocal FUERTE");
                }else{
                    System.out.println("La letra que has introducido es una consonante");
                }
            }
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirMensaje();
        leerLetra();
        tratarLetra();
        
    }
      
}
