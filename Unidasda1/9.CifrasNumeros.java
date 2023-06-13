package cibras;

import java.util.Scanner;

public class ContadorCifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int cifras = contarCifras(numero);

        System.out.println("El número " + numero + " tiene " + cifras + " cifras.");
    }

    public static int contarCifras(int numero) {
        int cifras = 0;
        if (numero == 0) {
            cifras = 1;
        } else {
            while (numero != 0) {
                numero = numero / 10;
                cifras++;
            }
        }
        return cifras;
    }
}
