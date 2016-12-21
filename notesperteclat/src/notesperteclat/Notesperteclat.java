/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notesperteclat;

import java.util.Scanner;

/**
 *
 * @author Tarda
 */
public class Notesperteclat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  
       
        //////////// PROVA MEVA /////////
        
        Scanner sc = new Scanner(System.in);
        int numNotes=1;
        int MAX;
        float suma, acumuladorSumes = 0, producte, mitjana = 0;
        System.out.println("Introdueix numero de notes que introduireu");
        MAX = sc.nextInt();

        while (numNotes < MAX) {
            System.out.println("introdueix nota " + numNotes);
            suma = sc.nextFloat();
            acumuladorSumes = +suma;
            numNotes++;

        }
        mitjana = acumuladorSumes / numNotes;
        System.out.println("La mitjana és de " + mitjana);
        /////////////// FI DE PROVA /////////////    */

        int numNotes;
        float nota, suma = 0, producte = 1, mitjana;
        Scanner sc = new Scanner(System.in);
        float[] arrayNotes;
        System.out.println("Numero de notes que introduireu");
        numNotes = sc.nextInt();
        arrayNotes = new float[numNotes];
        try {
            for (int i = 0; i < arrayNotes.length; i++) {
                System.out.println("Intrudeix nota " + (i + 1));
                nota = sc.nextFloat();
                arrayNotes[i] = nota;
                suma = suma + arrayNotes[i];
                producte = producte * nota;
            }

            for (int i = 0; i < arrayNotes.length; i++) {
                System.out.println("La nota introduida en la posició " + (i + 1) + " és " + arrayNotes[i]);

            }
            mitjana = suma / numNotes;

            System.out.println("La suma és " + suma);
            System.out.println("Productes és " + producte);
            System.out.println("La mitjana és " + mitjana);
        } catch (Exception e) {
            System.out.println("Error!!!!");

        }

    }
}
