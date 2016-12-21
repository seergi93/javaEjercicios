/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparador_nombres;

import java.util.Scanner;

/**
 *
 * @author Tarda
 */
public class Comparador_nombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nombre;
        int nComparador = 0;
        System.out.println("Escriu un nombre per comparar");
        nombre = sc.nextInt();
        if (nombre < nComparador) {
            System.out.println("El nombre " + nombre + " és més petit que " + nComparador);
        } else if (nombre == nComparador) {
            System.out.println("El nombre " + nombre + " és igual a " + nComparador);
        } else {
            System.out.println("El nombre " + nombre + " és més gros que " + nComparador);

        }

        /* ///////// S'ha de fer amb SWITCH /////////////
        
        switch (nombre) {
            case nombre<0:
                System.out.println("");
                break;
         */
    }

}
