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
Programa que le pida al usuario una palabra y le diga si es palíndromo o no.
Este programa debe repetirse 10 veces y debe guardar en un array de Strings todas las
palabras que el usuario ha introducido en cada interación. Al acabar las iteraciones el
programador le enseñará al usuario las palabras que ha introducido y le dirá cuántas de ellas
són palíndromos y a continución las mostrará en pantalla y el programa acabará.
..............................................................................................

 */
public class Program3 {

    private String[] arrayParaules = new String[10];// Array de String de paraules
    private String[] arrayPalindroms = new String[10];//Array de String de Palindroms
    private String paraula;// Variable que usarem per tratar la paraula 
    private String mensaje;// Variable per a imprimir
    private Llibreria lib = new Llibreria();// Importació de llibreria personal
    private int contadorPalindroms = 0;
    private boolean fall = false;

    public Program3() {

        netejarArray();//Per netejar els arrays
        introduirStringArray();//Aquí solament introduïm l'array de paraules
        tratarArray();// Més explicat al mètode....
        imprimirArrays();// Imprimir els resultats
        System.out.println("");
        System.out.println(""
                + "-----------------------------------------");

    }

    private void introduirStringArray() {

        for (int i = 0; i < arrayParaules.length || fall; i++) {
            mensaje = "Introdueix String " + (i + 1);
            lib.imprimir(mensaje);
            try{
            arrayParaules[i] = lib.llegirString();
            }catch (Exception e) {
                    System.out.println("No has introducido Correctamente el array");
                    fall = true;
                }

        }

    }

    private void tratarArray() {

        //Mètode per tradar cada posició de l'array de paraules
        int j;// punter principi paraula
        int k;// punter final de paraula
        boolean esPalindrom;// booleà per si és Palindrom
        boolean surtir;// booleà per si no és Palindrom, surtir i tratar la pròxima Paraula
        for (int i = 0; i < arrayParaules.length; i++) {
            esPalindrom = true;
            surtir = true;
            j = 0;
            paraula = arrayParaules[i];
            paraula = paraula.toLowerCase();// posam tot amb minúscula
            k = paraula.length() - 1;// per dirli al punter on ha de començar
            while (j < k && surtir) {
                if (paraula.charAt(j) == paraula.charAt(k)) {

                    //Comprovam si la lletra on apunta el punter és la mateixa lletra
                    j++;// Movem el punter cap al pròxim caràcter
                    k--;// Movem el punter cap l'anterior caràcter
                    surtir = true;

                } else {
                    esPalindrom = false;
                    surtir = false;

                }

            }
            if (surtir) {
                arrayPalindroms[i] = arrayParaules[i];
                contadorPalindroms++;

                /*
                Si és Palindrom, li adjudicarem el mateix valor a la mateixa 
                posició de l'array Paraules a l'array Palindroms
                 */
            }

        }

    }

    private void imprimirArrays() {

        System.out.println("Array de Paraules: ");
        for (int i = 0; i < arrayParaules.length; i++) {
            System.out.print((i + 1) + ": " + arrayParaules[i] + " ");

        }
        System.out.println(" ");
        System.out.println("Array de Palindroms: Hi ha " + contadorPalindroms + " "
                + "Palindroms de les 10 paraules que has introduit");
        for (int i = 0; i < arrayParaules.length; i++) {
            if (arrayPalindroms[i] == "") {
                System.out.print((i + 1) + ": No és palindrom ");
            } else {
                System.out.print((i + 1) + ": " + arrayPalindroms[i] + " ");
            }
        }

    }

    private void netejarArray() {
        for (int i = 0; i < arrayParaules.length; i++) {
            arrayParaules[i] = "";
            arrayPalindroms[i] = "";

        }

    }

}
