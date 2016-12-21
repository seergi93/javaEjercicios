/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_triangle;

import java.util.Scanner;

/**
 *
 * @author Tarda
 */
public class Area_triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float altura, base, resultat;

        try {
            System.out.println("Escriu altura");
            altura = sc.nextFloat();
            System.out.println("Escriu base");
            base = sc.nextFloat();
            resultat = (base * altura) / 2;
            System.out.println("La Area és de " + resultat);

        } catch (Exception e) {
            System.out.println("Error!!!!");
        }

    }

}
