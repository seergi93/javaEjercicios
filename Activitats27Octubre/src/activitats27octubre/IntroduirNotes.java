/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitats27octubre;

import java.util.Scanner;

/**
 * Versión1.0
 *
 * @author toshiba
 */
public class IntroduirNotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        float suma = 0, producto = 1, media;
        double nota;
        int totalNotas;
        int contador;

        System.out.println("Cuántas notas vas a introducir");
        totalNotas = sc.nextInt();
        System.out.println();

        for (contador = 0; contador < totalNotas; contador++) {
            System.out.println("Introduce una nota");
            nota = sc.nextDouble();//leer nota
            suma = (float) (suma + nota); //tratar nota
            if (nota <= 0) {
                nota = 1;
            }
            producto = (float) (producto * nota);

        }
        media = suma / totalNotas;
        System.out.println("La suma de las notas es: " + suma + "\n"
                + "el producto es: " + producto + "\n"
                + "y la media es: " + media);

    }

}
