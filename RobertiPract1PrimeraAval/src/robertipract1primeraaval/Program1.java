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
Programa en que se pida al usuario dos números enteros. Si la suma es par, debe
ordenar los números entrados de forma creciente y si es impar, los tiene que ordenar de forma
decreciente.
..............................................................................................
 */
public class Program1 {

    private int MAX = 2; // ho inicialitz a 2, però es podria fer per X numeros.
    private int[] arrayNumeros = new int[MAX];// 
    private Llibreria lib = new Llibreria();
    String mensaje;
    private int sum = 0;

    public Program1() {
        try{
        introduirNumerosArray();
                } catch (Exception e) {
                    System.out.println("No has introducido un entero");
                }

        sum = lib.sumarNumerosArray(arrayNumeros);//metode per sumar enters d'un array
        if (sum % 2 == 0) {
            lib.arrayPetitGran(arrayNumeros);// ordenar enters de petit a gran
            lib.imprimirArrayEnters(arrayNumeros);
        } else if (sum % 2 != 0) {
            lib.arrayGranPetit(arrayNumeros);// ordenar enters de gran petit
            lib.imprimirArrayEnters(arrayNumeros);

        }

    }

    private void introducirNumeros() {
        mensaje = "introduce un entero";
        lib.imprimir(mensaje);
        
        lib.llegirEnter();

    }

    private void introduirNumerosArray() {
        for (int i = 0; i < MAX; i++) {
            mensaje = "introdueix enter " + (i + 1);
            lib.imprimir(mensaje);
            arrayNumeros[i] = lib.llegirEnter();

        }

    }

}
