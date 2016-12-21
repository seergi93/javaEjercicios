/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaestudiante;

import Herencia.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Principal {

    private boolean salir = true;
    private Estudiante[] arrayEstudiante = new Estudiante[5];
    private int posicion; //sera la posicion libre dodne insertare el estudiante cada vez.
    //private int numPersona;
    private String nombre, dni;
    private boolean sexo;
    //private Estudiante e;
    private Scanner sc = new Scanner(System.in);
    
    
    
    
    public Principal() {
        
        //System.out.println("Cuantas personas quieres");
        //numPersona= sc.nextInt();
        //arrayPersona = new Persona;
        
        inicializarArray(); //[numPersona];
        do {
            menu();
            tratarMenu();

        } while (salir);

    }
    
    
    private void inicializarArray(){
        for(int i = 0; i < arrayEstudiante.length; i++){
            arrayEstudiante[i] = null;
        }
        
    }
    
    /**
     * Metodo que me va a devolver true si queda alguna posicion vacia
     * @return  false si el array esta lleno.
     */
    
    private boolean siExistenPosicionesLibres(){
        boolean resultado = false;
        boolean control = true;
        
        for (int i = 0; i < arrayEstudiante.length && control; i++){
              if(arrayEstudiante[i].equals(null)){
                resultado = true;
                control = false;
            }  
        }
        return resultado;
    }
    
    private void menu() {
        System.out.println("1.Dar Alta estudiante");
        System.out.println("2.Dar Baja estudiante");
        System.out.println("3.Modificar estudiante");
        System.out.println("4.Consultar estudiante");
        System.out.println("5.Volcar contenido de mi array");
        System.out.println("6.Salir");

    }

    private void tratarMenu() {
        
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                darAlta();
                break;
            case 2:
                darBaja();
                break;
            case 3:
                modificar();
                break;
            case 4:
                consultar();
                break;
            case 5:
                recorridoArray();
                break;
                
            case 6:
                salir = false;
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }

    }
    
    private void pedirDatos(){
        System.out.println("Introduce nombre");
        nombre = sc.next();
        System.out.println("Introduce el DNI");
        dni = sc.next();
        System.out.println("Introduce sexo, TRUE para mujer, FALSE para hombre");
        sexo = sc.hasNextBoolean();
            
    }
    
    
    private void darAlta() {

        if(siExistenPosicionesLibres()){
            pedirDatos();
            Estudiante e = new Estudiante(sexo, nombre, dni);
            arrayEstudiante[posicion] = e;
        }
        else{
            System.out.println("La base de datos esta llena. No se puede dar de alta");
        }
        
        //crearObjeto(); varianle global Estudiante e 
        //almacenarObjeto();
        
    }

    private void darBaja() {
        
        

    }

    private void modificar() {

    }

    private void consultar() {

    }
    
    private void recorridoArray(){
        
    }
    
    
    
    
}
