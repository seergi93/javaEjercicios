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
public class num5Inversos {
    
    
    //Declaracion de variables y constantes globales
public static int maxPos=5;// fuerzo el programa para que tenga solo 5 numeros
public static int [ ] arrayNnumeros;//declaracion del array
public static String mensaje ;
//constructor
public static void cincoNumerosInveros (){
 int i;
//mensaje="Cuántos números quieres introducir?";
//imprimirMensaje(mensaje);
//maxPos=leerMensaje();
arrayNnumeros=new int [maxPos];//Reserva de memoria de las posiciones que quiere el usuario
for(i=0;i<arrayNnumeros.length; i++){
 mensaje=" Introduce el número: "+(i+1);
 imprimirMensaje (mensaje);
 arrayNnumeros[i]=leerMensaje( );//guarda los valores que introduce el usuario
}

tratarValores( );
}

public static void imprimirMensaje(String sms){
System.out.println(sms);
}
public static int leerMensaje(){
Scanner sc =new Scanner(System.in);
return sc.nextInt( );
}
public static void tratarValores ( ){
int i;
for (i=(maxPos-1);i>=0; i--){
mensaje="El valor introducido en la posición "+(i+1)+" es: "+
arrayNnumeros[i];
imprimirMensaje (mensaje);
}
}
public static void main(String[] args) {
cincoNumerosInveros ();
        
        
    }
    
}
