/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Oscar
 */
public class Estudiante extends Persona {
    private boolean sexo; //sera true si mujer, false hombre

    public Estudiante(boolean sexo, String nombre, String dni) {
        super(nombre, dni);
        this.sexo = sexo;
    }

    public boolean isSexo() {
        return sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }


    
}
