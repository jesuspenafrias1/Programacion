package Unidad1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.EOFException;
import java.io.IOException;

public class v1Trifiv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int numero;
        int mul3;
        int mul5 = 0;
        BufferedReader butEntrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dame numero");
        numero = Integer.parseInt(butEntrada.readLine());
        mul3 = numero %3;
        mul5 = numero %5;
        if(mul3==0){
            System.out.println("tri");
        }
        if(mul5==0){
            System.out.println("fiv");
        }
        
       if(mul3 % 3 == 0 && mul5 % 5 == 0){
            System.out.println("trifiv");
        }
    }
    
}
