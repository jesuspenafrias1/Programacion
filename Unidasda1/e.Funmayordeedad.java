/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad1;

import java.util.Scanner;
public class vmayordeedad {
    
      
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar edad");
        int edad = entrada.nextInt();
        
        String resultado = verificarEdad(edad);
        System.out.println(resultado);
    }
    public static String verificarEdad(int edad){
        if (edad>=18) {
            return "Felicidades eres mayor de edad";
        }
        else{
        return "Lo lamento aun eres menor";    
        }
        
    }
}
