/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notesperteclatexamen;

import java.util.Scanner;

/**
 *
 * @author Tarda
 */
public class NotesperteclatExamen {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        /*Mitjançant pseudocodi, fes un programa que demani notes numèriques de 0 a 10
     * amb la possibilitat d’introduir decimals. En el cas de que s’introdueixi un
     * nombre no vàlid, es tornaran a mostrar les instruccions del programa. Una
     * vegada introduïdes l’usuari ha d’introduir la lletra M idesprés es mostrarà
     * la mitjana i la nota amb paraules “Suspens” o “Aprovat” o “Notable” o “Excel·lent”.
     * A més a més, indicarà quina ha estat la major nota i la menor.*/
        Scanner sc = new Scanner(System.in);

        float nGran = 0, nPetit, nota, sumaNotes = 0, mitjana = 0;

        int numNotes;
        float[] arrayNotes;

        System.out.println("Quantes notes vols introduir?");
        numNotes = sc.nextInt();
        arrayNotes = new float[numNotes];
        System.out.println("Introdueix nota 1");
        nota = sc.nextFloat();
        nPetit = nota;

        for (int i = 1; i < arrayNotes.length; i++) {
            System.out.println("Introdueix nota " + (i + 1));
            nota = sc.nextFloat();
            arrayNotes[i] = nota;
            sumaNotes = sumaNotes + arrayNotes[i];
            if (arrayNotes[i] > nGran) {
                nGran = arrayNotes[i];
            } else if (arrayNotes[i] < nPetit) {
                nPetit = arrayNotes[i];
            }

        }
        mitjana = sumaNotes / numNotes + 1;
        if (mitjana < 5) {
            System.out.println("Estàs suspes!");

        } else if (mitjana < 5.5) {
            System.out.println("Aprovat, justet...");

        } else if (mitjana < 7) {
            System.out.println("Aprovat!");
        } else if (mitjana < 9) {
            System.out.println("Notable!");
        } else if (mitjana <= 10) {
            System.out.println("Excelent!");
        }

        System.out.println("nPetit = " + nPetit);
        System.out.println("nGran = " + nGran);
        System.out.println("La mitjana és de " + mitjana);

    }

}
