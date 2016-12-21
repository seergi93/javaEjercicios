package ejercicioscircumferencia;

import java.util.Scanner;

/**
 *
 * @author toshiba
 */
public class EjercicioCircumferencia {

    /**
     * @param args the command line arguments
     */
    //declaracion de variables de ambito global.
    static double radi;
    static final double pi = 3.1415;
    static double longitud, area, volum;

    /**
     * Metodo para leer el valor de un radio intr. por teclado
     */
    static public void leerRadio() {
        try{
            
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu el valor del radi i no nul que vols:");
        radi = sc.nextDouble();
        sc.close();
    }catch(Exception e){
        
    }

    }

    public static void tratarRadio() {

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
            leerRadio();
        }
    }

    public static double calcularLongitud() {
        double resultat;
        resultat = 2 * pi * radi;
        return resultat;

    }

    public static double calcularArea() {
        double resultat;
        resultat = 2 * pi * radi;
        return resultat;

    }

    public static double calcularVolum() {
        double resultat;
        resultat = (4 / 3) * pi * radi * radi * radi;
        return resultat;

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        leerRadio();
        tratarRadio();
        longitud = calcularLongitud();
        area = calcularArea();
        volum = calcularVolum();
        System.out.println(); //per afegir una línea en blanc
        //i estigui més separat
        System.out.println("El valor de la longitud de la circumferència"
                + " de radi: " + radi + " és: " + longitud);
        System.out.println("L'área del cercle de radi: " + radi + " és: " + area);
        System.out.println("El volum de l'esferea de radi: " + radi + " és: " + volum);
    }
}
