/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitats27octubre;

import java.util.Scanner;

public class ElMenorDeLosTres {

    static Scanner sc = new Scanner(System.in);

    static int[] numero = new int[3];

    public static void tratarNumeros() {

        if ((numero[0] <= numero[1]) && (numero[0] <= numero[2])) {
            System.out.println("El más pequeño es " + numero[0]);

        } else if ((numero[1] <= numero[0]) && (numero[1] <= numero[2])) {
            System.out.println("El más pequeño es" + numero[1]);

        } else {
            System.out.println("El más pequeño es" + numero[2]);
        }

    }

    public static void introducirNumeros() {

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce número " + i);
            numero[i] = sc.nextInt();

        }
    }

    public static void main(String[] args) {

        introducirNumeros();
        tratarNumeros();//Imprimir mensaje cuál es el menor de los tres

    }
}
