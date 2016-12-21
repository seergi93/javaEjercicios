/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertipractlistapalbras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Sergi
 */
public class Llibreria {

    public Llibreria() {
    }

    public int llegirEnter() {
        /**
         * Metode per llegir enter
         *
         * @return
         */
        Scanner sc = new Scanner(System.in);
        int valor;
        valor = sc.nextInt();
        return valor;

    }

    public int llegirEnterMenu(int valor) {
        Scanner sc = new Scanner(System.in);
        String mensaje = "";

        valor = sc.nextInt();
        return valor;
    }

    public String llegirString() {
        /**
         * Metode per llegir un String.
         *
         * @return
         */
Scanner sc = new Scanner(System.in);
        String valor;
        valor = sc.next();
        return valor;
    }

    public void imprimir(String sms) {
        /**
         * Metode per imprimir en pantalla.
         *
         * @return
         */

        System.out.println(sms);

    }

    public void imprimirArrayEnters(int[] array) {
        /**
         * Metode per imprimir un Array de enters.
         *
         * @return
         */

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }

    //COPIAT A PISSARRA
    public Object treureAPantalla(Object[] array) {
        /**
         * Metode per treure a Pantalla un Array.
         *
         * @return
         */

        String aux = "";
        for (int i = 0; i < array.length; i++) {
            aux = aux + array[i];

        }
        return aux;
    }

    public int sumarNumerosArray(int[] array) {
        /**
         * Metode per sumar enters d'un Array.
         *
         * @return
         */

        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];

        }
        return suma;

    }

    public int[] arrayGranPetit(int[] array) {
        /**
         * Metode per ordenar de Gran a Petit.
         *
         * @return
         */

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
        /**
         * Metode per ordenar de Petit a Gran.
         *
         * @return
         */

        Arrays.sort(array);
        return array;
    }

    public int numerosAleatoris() {
        /**
         * Metode per generar numeros aleatoris.
         *
         * @return
         */
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

    public void afegirStringCoaLlista(ArrayList<String> llistaString) {

        System.out.println("Introdueix String que vols introduir a la llista");
        String paraula = llegirString();
        llistaString.add(paraula);
    }

    public void afegirStringPosicioLlista(ArrayList<String> llistaString) {
        System.out.println("Indica la posicio de memoria");
        int posicio = llegirEnter();
        System.out.println("Introdueix String que vols introduir a la llista");
        String paraula = llegirString();
        llistaString.add(posicio, paraula);
    }

    public void borrarStringLlista(ArrayList<String> llistaString) {
        System.out.println("Introdueix String que vols esborrar de la llista");
        String paraula = llegirString();
        for (int i = 0; i < llistaString.size(); i++) {
            if (paraula.equals(llistaString.get(i))) {
                llistaString.remove(i);
                i--;
            }

        }

    }

    public void borrarStringPosicioLlista(ArrayList<String> llistaString) {
        System.out.println("Indica la posicio de memoria que vols esborrar");
        int posicio = llegirEnter();
        llistaString.remove(posicio);
    }

    public void borrarLlista(ArrayList<String> llistaString) {
        llistaString.clear();
    }

    public boolean llistaEsBuida(ArrayList<String> llistaString) {
        boolean esBuida = llistaString.isEmpty();
        return esBuida;
    }

    public boolean comprovarValorLlista(String valor, ArrayList<String> llistaString) {
        boolean esBuida = llistaString.contains(valor);
        return esBuida;
    }

    /*public void volcarArrayList(ArrayList<String> llistaString) {
        Iterator<String> i = llistaString.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }*/
    public void volcarArrayList(ArrayList<String> llistaString) {
        String paraula = "";
        for (int i = 0; i < llistaString.size(); i++) {
            paraula = llistaString.get(i);
            System.out.print(i + 1 + ". " + paraula + " ");

        }
        System.out.println("");
    }

    // 
    // Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
//nombreArrayList.contains("Elemento");
    /*
    Volcar el contenido de un array de objectos en pantalla
    
    public void imprimirArrayList(){
        
        String aux= " ";
        
        
        for (int i = 0; i <array.lenght ; i++) {
            aux += array[i].toString();
        }
        imprimir(aux);
    }
     */
}
