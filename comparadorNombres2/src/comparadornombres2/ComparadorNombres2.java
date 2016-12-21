/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadornombres2;

import java.util.Scanner;

/**
 *
 * @author Tarda
 */
public class ComparadorNombres2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numValors;
        float nA, nB, nGran, nPetit, nota;
        System.out.println("Escriu els valors que vols comparar ");
        numValors = sc.nextInt();
        float[] arrayNombres = new float[numValors];

        for (int i = 0; i < arrayNombres.length; i++) {
            nota = arrayNombres[i];
            
        }
        
        for (int i = 0; i < arrayNombres.length; i++) {
            float arrayNombre = arrayNombres[i];
            
        }
        
        

        ////////////////PROVA SENSE ARRAY///////////////

        /*Scanner sc = new Scanner(System.in);
        int MAX;
        float nGran = 0, nA, nPetit = 0, nB;
        boolean sonIguals = false;

        System.out.println("Introdueix la cuantitat de nombres que vols comparar");
        MAX = sc.nextInt();
        System.out.println("Escriu nombre 1");
        nA = sc.nextFloat();
        System.out.println("Escriu nombre 2");
        nB = sc.nextFloat();
        
        if (nA > nB) {
                nGran = nA;
                nPetit = nB;

            } else if (nA < nB) {
                nGran = nB;
                nPetit = nA;

            }

        for (int i = 2; i < MAX; i++) {

            System.out.println("Escriu nombre" + (i + 1));
            nB = sc.nextFloat();

            if (nA > nB && (nB>nGran || nB<nPetit)) {
                nGran = nA;
                nPetit = nB;

            } else if (nA < nB && (nB>nGran || nB<nPetit)) {
                nGran = nB;
                nPetit = nA;

            }

        }
        if (nPetit == nGran) {
            System.out.println("Els nombres són Iguals");
        } else {
            System.out.println("El nombre gran és " + nGran);
            System.out.println("El nombre petit és " + nPetit);

        }*/
    }

}
