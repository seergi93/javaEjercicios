/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertirnombres;

import java.util.Scanner;

/**
 *
 * @author Tarda
 */
public class InvertirNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nombreNotes = 5;
        float nota;
        float[] arraynotes = new float[nombreNotes];

        for (int i = 0; i < arraynotes.length; i++) {
            System.out.println("Introdueix nota " + (i + 1));
            nota = sc.nextFloat();
            arraynotes[i] = nota;
        }

        for (int i = nombreNotes - 1; i >= 0; i--) {

            System.out.println("" + arraynotes[i]);

        }

    }

}
