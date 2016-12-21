/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertipract1primeraaval;

/**
 *
 * @author Sergi
 */

/*
**********Enunciat............................................................................
Programa que solicite un valor numérico positivo y muestre todos los valores
pares, comenzando por cero, menores estrictamente que él. Convendria que los valores
aparecieran separados por un espacio en blanco.
..............................................................................................
 */
public class Program2 {

    private int numero = 0, numpar;// Variables
    private Llibreria lib = new Llibreria();//Importar llibreria

    public Program2() {

        System.out.println("Introduce un entero");
        try {
            numero = lib.llegirEnter();
        } catch (Exception e) {
            System.out.println("No has introducido un entero");
        }
        System.out.print("Numeros pares: ");
        while (numpar < numero) {
            System.out.print(numpar + " ");
            numpar += 2;

        }

    }

}
