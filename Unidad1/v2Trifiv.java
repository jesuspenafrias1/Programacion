/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.EOFException;
import java.io.IOException;

public class v2Trifiv {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int numero;
        int mul3;
        int mul5 = 0;
        BufferedReader butEntrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dame numero");
        numero = Integer.parseInt(butEntrada.readLine());
        mul3 = numero %3;
        mul3 = numero %5;
        if(mul3==0&&mul5==0){
            System.out.println("trifiv");
        }else if (mul3==0){
            System.out.println("tri");
        }else if (mul5==0){
            System.out.println("fiv");
        }
    
    
}
}
