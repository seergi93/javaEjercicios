/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertipractlistapalbras;

/**
 *
 * @author Sergi
 */
import java.util.*;
import java.util.ArrayList;

public class Principal {

    private boolean sortir = false;
    private String mensaje;
    private Llibreria lib = new Llibreria();
    private ArrayList<String> llistaParaules;
    private static int opcio;

    public Principal() {

        llistaParaules = new ArrayList<String>();
        do {

            menu();
            tratarMenu();
        } while (!sortir);
        mensaje = "Adeu!";
        lib.imprimir(mensaje);

    }

    /**
     * Métode que crida desde el constructor per mostrar-li les opcions que té
     * l'usuari
     *
     * 
     */
    private void menu() {

        mensaje = "Tria una opció de les següents \n 1. Afegir una paraula a la llista"
                + " \n 2. Eliminar una paraula de la llista \n 3. Detectar si "
                + "una paraula existeix, i si existeix, quantes vagades apareix \n"
                + " 4. Mostrar tota la llista de paraules \n 5. Sortir del programa";
        lib.imprimir(mensaje);

    }

    /**
     * Métode que tracta les opcions de l'usuari segons hagi clicat en una opció
     * o una altre.
     *
     * 
     */
    private void tratarMenu() {
        opcio = 0;
        try {
            opcio = lib.llegirEnter();
        } catch (Exception e) {
            System.out.println("ERROR");
            opcio = 0;
        } finally {

            switch (opcio) {
                case 1:
                    afegirParaula();
                    break;
                case 2:
                    eliminarParaula();
                    break;
                case 3:
                    consultarParaules();
                    break;
                case 4:
                    consultarLlista();
                    break;
                case 5:
                    sortir = true;
                    break;
                default:

                    mensaje = "Opció no valida!";

                    lib.imprimir(mensaje);
                    break;

            }

        }

    }

    /**
     * Métode que demanará al usuari que introduexi la paraula que vol borrar i
     * borrarà totes les ocurrències d'aquesta paruala dins la llista si aquesta
     * paraula existeix. Si no existeix, informarà al usuari amb el missatge
     * oportú.Aquest mètode serà cridat a través de l opció corresponent del
     * mètode tratarMenu().
     *
     *
     */
    private void afegirParaula() {
        try {
            lib.afegirStringCoaLlista(llistaParaules);
        } catch (Exception e) {
            mensaje = "Error, torna-ho a provar";
            lib.imprimir(mensaje);
        }

    }

    /**
     * Métode que demanará al usuari que introduexi la paraula que vol consultar
     * i li mostrarà amb un missatge les ocurrències que hi ha dins la llista de
     * la paraula que ha introduït. Si no existeix, informarà al usuari amb el
     * missatge oportú.Aquest mètode serà cridat a través de l opció
     * corresponent del mètode tratarMenu().
     *
     *
     */
    private void eliminarParaula() {
        try {
            lib.borrarStringLlista(llistaParaules);
        } catch (Exception e) {
            mensaje = "Error, torna-ho a provar";
            lib.imprimir(mensaje);
        }
    }

    /**
     * Métode que demana al usuari que introduexi la paraula que vol consultar i
     * li mostra amb un missatge les ocurrències que hi ha dins la llista de la
     * paraula que ha introduït. Si no existeix, informa al usuari amb el
     * missatge oportú.Aquest mètode es cridat a través de l opció corresponent
     * del mètode tratarMenu().
     *
     *
     */
    private void consultarParaules() {
        
            String paraula;
            int contador = 0;
            mensaje = "Introdueix la paraula que vols consultar";
            lib.imprimir(mensaje);
            paraula = lib.llegirString();
            for (int i = 0; i < llistaParaules.size(); i++) {
                if (paraula.equals(llistaParaules.get(i))) {
                    contador++;
                }
            }
            if (contador > 0) {
                mensaje = "La paraula '" + paraula + "' existeix dins la llista i apareix " + contador + " vegada/es";
                lib.imprimir(mensaje);
            } else {
                mensaje = "La paraula '" + paraula + "' no está dins la llista";
                lib.imprimir(mensaje);
            }
        
    }

    /**
     * Métode que imprimieix per pantalla el contingut de la llista amb les
     * paraules que hi ha dins la llista i la posició on es troben de la llista.
     * Aquest mètode es cridat a través de l opció corresponent del mètode
     * tratarMenu().
     *
     *
     */
    private void consultarLlista() {
        try {
            if (!lib.llistaEsBuida(llistaParaules)) {
                mensaje = "Contingut de la llista : ";
                lib.imprimir(mensaje);
                lib.volcarArrayList(llistaParaules);

            } else {
                mensaje = "La llista és buida!";
                lib.imprimir(mensaje);

            }

        } catch (Exception e) {
            mensaje = "Error, torna-ho a provar";
            lib.imprimir(mensaje);
        }
    }
}
