/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trifv4;

import java.io.PrintStream;
import java.util.Scanner;
public class Trifv4 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingresa numero: ");
        numero = entrada.nextInt();
        System.out.println(retornarmultiplo(numero));
    }
    public static String retornarmultiplo(int num){
        
        int mul3;
        int mul5;
        mul3= num % 3;
        mul5= num % 5;
        
        if (mul3 == 0 && mul5==0) {
            return "trifiv";
        }
        else if (mul3 == 0) {
             return "trv";
        }
         else if (mul5 == 0) {
             return "fiv";
        }
        return "ningun caso";
    }

    

   

   
}
