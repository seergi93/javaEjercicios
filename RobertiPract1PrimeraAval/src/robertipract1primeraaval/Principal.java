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
public class Principal {

    private Llibreria lib = new Llibreria();
    private int op;
    private boolean error = false;

    public Principal() {

        do {
            
            menu();
            if (op > 5) {
                System.out.println("Opció incorrecta, torna-ho a provar");

            } else {
                System.out.println("Introdueix una opció");
            }
            
            tratarMenu(op);
            
        } while (op != 5);
    }
    
    /*
    A aquest metode mostram es menu amb les diferents opcions
    
    */

    private void menu() {

        System.out.println("1. Introdueix dos nombres, si la suma és par, s'ordenaràn"
                + " de forma creixent, si es impar, decreixent");
        System.out.println("2. Introdrodueix un nombre y mostrarà tots els nombres"
                + "pars més petit que ell");
        System.out.println("3. Introduir 10 paraules i saber si són palindroms");
        System.out.println("4. Construir una matriu 4x4 de nombres aleatoris");
        System.out.println("5.Sortir del programa");
        try{
        op = lib.llegirEnter();
        } catch (Exception e) {
                    System.out.println("Opció incorrecta, torna-ho a provar");
                    
                }

    }
    
    /*
    A aquest metode tractam el menu
    */

    private void tratarMenu(int op) {

        switch (op) {
            case 1:
                Program1 p1 = new Program1();

                break;
            case 2:
                Program2 p2 = new Program2();
                break;
            case 3:
                Program3 p3 = new Program3();
                break;

            case 4:
                Program4 p4 = new Program4();
                break;

            case 5:
                System.out.println("ADEU!");
                break;

            default:
                break;

        }

    }
}

//Program1 p1 = new Program1();
//Program2 p2 = new Program2();
//Program3 p3 = new Program3();
//Program4 p4 = new Program4();

