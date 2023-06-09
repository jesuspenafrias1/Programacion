package edades;

 import java.util.Scanner;

public class CategorizadorEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad <=5 && edad >=1) {
            System.out.println("Infante");
        } else if (edad <=17 && edad >=6) {
            System.out.println("Niño");
        } else {
            System.out.println("Adulto");
        }
        
    }
}
