/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertipract1primeraaval;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sergi
 */
public class Llibreria {

    Scanner sc = new Scanner(System.in);

    public Llibreria() {
    }

    public int llegirEnter() {
        int valor;
        valor = sc.nextInt();
        return valor;
    }

    public int contarString(String paraula) {
        int valor = 0;
        char lletra = '_';
        while (lletra != '.' || lletra != ' ') {
            paraula.charAt(valor);
            valor++;

        }
        return valor;

    }

    public String llegirString() {
        String valor;
        valor = sc.next();
        return valor;
    }

    public void imprimir(String sms) {

        System.out.println(sms);

    }

    public void imprimirArrayEnters(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }

    public int sumarNumerosArray(int[] array) {
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];

        }
        return suma;

    }

    public int[] arrayGranPetit(int[] array) {
        int i = 0;
        int j = array.length - 1;
        int tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
        return array;
    }

    public int[] arrayPetitGran(int[] array) {

        Arrays.sort(array);
        return array;
    }

    public int numerosAleatoris() {
        double valor = Math.random();
        valor = valor * 16;
        int enter = (int) valor;
        return enter + 1;
    }

    public int introduirOpcio() {
        int valor;
        System.out.println("intodueix una opcio:");
        valor = llegirEnter();

        return valor;
    }

    /*
    Volcar el contenido de un array de objectos en pantalla
    
    public void imprimirArray(){
        
        String aux= " ";
        
        
        for (int i = 0; i <array.lenght ; i++) {
            aux += array[i].toString();
        }
        imprimir(aux);
    }
     */
}
