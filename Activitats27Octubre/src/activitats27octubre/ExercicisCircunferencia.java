/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitats27octubre;

import java.util.Scanner;

/**
 *
 * @author Sergi
 */
public class ExercicisCircunferencia {

    public static void main(String[] args) {
        double radi;
        double pi = 3.1415;
        double longitud, area, volum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu el valor del radi que vols:");
        radi = sc.nextDouble();
        while (radi <= 0) {//separam les dues condicions d'entrada al bucle
            if (radi == 0) {//si el radi és zero li ho direm a l'usuari
                System.out.println("El radi introduït és zero.");
                System.out.println(); //per afegir una línea en blanc
                //i estigui més separat
            } else {//aquí només entra si el radi és negatiu, perquè està dins
                //el while perquè o bé el radi era zero, que ho hem tracta abans
                // o bé el radi era negatiu i ho tractam a l'else
                System.out.println("El radi introduït és negatiu.");
                System.out.println(); //per afegir una línea en blanc
                //i estigui més separat
            }
            //Aquesta instrucciól'hem de fer tant si el radi és negatiu com si és zero
            System.out.println("Introdueix un valor positiu i diferent de zero per al radi:");
            radi = sc.nextDouble();
        }
        longitud = 2 * pi * radi;
        area = pi * radi * radi;
        volum = (4 / 3) * pi * radi * radi * radi;
        System.out.println(); //per afegir una línea en blanc
        //i estigui més separat
        System.out.println("El valor de la longitud de la circumferència"
                + " de radi: " + radi + " és: " + longitud);
        System.out.println("L'área del cercle de radi: " + radi + " és: " + area);
        System.out.println("El volum de l'esferea de radi: " + radi + " és: " + volum);
    }

}
