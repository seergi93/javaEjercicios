/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculararearectangulo;

import java.util.Scanner;

/**
 *
 * @author toshiba
 */
public class ProgramaPrincipal {
    
    public void ProgramaPrincipal(){
        float base,altura,resultado;
        
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("Introduce un valor para la base");
        base=sc.nextFloat();//leer base
        base=tratarValor(base);//tratar Base
        
        System.out.println("Introduce un valor para la altura");
        altura=sc.nextFloat();//leer altura
        altura=tratarValor(altura);//tratar altura
        
        resultado=base*altura;
        
        System.out.println("El resultado del área del rectángulo de base:"+base+" i"
        + "altura:"+altura+"es :"+resultado);
        
    }
    
    public float tratarValor(float valor){
    Scanner scAux=new Scanner(System.in);//variable auxiliar local para leer de pantalla
    
    while (valor<=0){
        System.out.println("El valor introducido es erróneo."
                + " Introduzca un nuevo valor");
        valor=scAux.nextFloat();
    }
    
    return valor;
    }
}
