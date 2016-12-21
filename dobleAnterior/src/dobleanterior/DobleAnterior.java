/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobleanterior;

import java.util.Scanner;

/**
 *
 * @author Tarda
 */
public class DobleAnterior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nA, nB;
        int numValors;
        System.out.println("Introdueix nombre de valors");
        numValors = sc.nextInt();
        int[] arrayNombres = new int[numValors];
        boolean sonMultiples = false;

        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.println("Introdueix valor " + i);
            nA = sc.nextInt();
            arrayNombres[i] = nA;
            
        }
        for (int i = 1; i < (arrayNombres.length); i++) {

            nA = arrayNombres[i];
            nB = arrayNombres[i - 1];

            if (nA == (nB*0.5)) {
                sonMultiples = true;

            }else{
                sonMultiples = false;
            }
            

        }
        if (sonMultiples = true){
            System.out.println("Són multiples");
        }
        else {
            System.out.println("No són multiples");
        }

    }
}
