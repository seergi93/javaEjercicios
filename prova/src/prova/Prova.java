/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author Sergi
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float numero = 4, divisio;
        int residu;
        divisio = numero / 2;
        residu = (int) divisio;
        if (numero >= 0) {
            if (residu == divisio) {
                System.out.println("es parell");
            } else {
                System.out.println("no es parell");
            }

            // TODO code application logic here
        }
    }

}
