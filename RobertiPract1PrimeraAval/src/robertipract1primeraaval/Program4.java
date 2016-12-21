/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertipract1primeraaval;

/**
 *
 * @author Sergi
 */

/*
**********Enunciat............................................................................
Programa que muestre una matriz por consola con 4 filas (i) enumeradas como
A,B,C,D y 4 columnas (j) enumeradas como 1,2,3,4 donde en cada de las 16 posibles
posiciones (i,j), va a colocar un número del 1 al 16 de manera aleatoria.
..............................................................................................
 */
public class Program4 {

    private int[][] matriu = new int[4][4];// Inicialitzam matriu
    private Llibreria lib = new Llibreria();//Importar llibreria
    private String mensaje;

    /*
    He inicialitzat i declarat directament els arrays per coordeanades
     */
    private char[] arrayLletres = {'A', 'B', 'C', 'D'};
    private int[] arrayNumeros = {1, 2, 3, 4};

    public Program4() {
        construirMatriu();
        imprimirMatriu();
        System.out.println(""
                + "");
    }

    private void construirMatriu() {

        /*
        Faig un for dins un altre for, per així escriure tota la matriu
         */
        for (int i = 0; i < matriu.length; i++) {

            for (int j = 0; j < matriu.length; j++) {
                matriu[i][j] = lib.numerosAleatoris();// Per obtenir numeros aleatoris

            }

        }

    }

    private void imprimirMatriu() {

        /*
        Aquest metode serveix per imprimir la matriu i els arrays de cordenades
         */
        System.out.print("  ");
        for (int i = 0; i < arrayLletres.length; i++) {

            System.out.print("[" + arrayNumeros[i] + "]");
        }

        for (int i = 0; i < matriu.length; i++) {
            System.out.println(" ");
            System.out.print(arrayLletres[i] + " ");
            for (int j = 0; j < matriu.length; j++) {

                System.out.print("[" + matriu[i][j] + "]");

            }

        }

    }

}
