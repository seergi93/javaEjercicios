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
public class MenorDeLosTres {
    //variables
    static int[] numero= new int [3];
    static int i=0;
    
    /**
     * metodo mensaje introduce un numero
     */
    public static void imprimirMensaje(){
        System.out.println("Introduce un número");
    }
    /**
     * metodo introducir numeros
     */
    public static void introducirNumeros(){
        Scanner sc = new Scanner(System.in);
        try{
        for(i=0;i<numero.length;i++){
            imprimirMensaje();
          numero[i]= sc.nextInt();
            
           
        }
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    /**
     * metodo tratar numero
     */
    public static void tratarNumeros(){
        
        if((numero[0]<=numero[1])&&(numero[0]<=numero[2])){
            System.out.println("El más pequeños es" +numero[0]);
        }else if((numero[1]<=numero[0])&&(numero[1]<=numero[2])){
                System.out.println("El más pequeño es" +numero[1]);
            }else{
                System.out.println("El más pequeño es" +numero[2]);
            }
        }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        introducirNumeros();
        tratarNumeros();
        
    }
}
