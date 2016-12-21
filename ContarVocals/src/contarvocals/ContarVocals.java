/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contarvocals;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Tarda
 */
public class ContarVocals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] contador = new int[5]; //contadors
        char[] lletra = new char['a','e','i','o','u'];
        String text;
        System.out.println("Introdueix la seqüència de caractes");
        text = sc.nextLine();
        for (int i = 0; i < args.length; i++) {

            switch (text.charAt(i)) {

                case 'a':
                    contador[0]++;
                    break;
                case 'e':
                    contador[1]++;
                    break;
                case 'i':
                    contador[2]++;
                    break;
                case 'o':
                    contador[3]++;
                    break;
                case 'u':
                    contador[4]++;
                    break;
                case 'A':
                    contador[0]++;
                    break;
                case 'E':
                    contador[1]++;
                    break;
                case 'I':
                    contador[2]++;
                    break;
                case 'O':
                    contador[3]++;
                    break;
                case 'U':
                    contador[4]++;
                    break;
                default:
                    break;

            }

        }
        for (int i = 0; i < contador.length; i++) {
            if (contador) {
                
            }
        }

    }

}
