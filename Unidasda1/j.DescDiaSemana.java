package descuento;

import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // monto de la compra
        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = scanner.nextDouble();
        
        // día de la semana (1 para lunes, 2 para martes, etc.)
        System.out.print("Ingrese el día de la semana (1 para lunes, 2 para martes, etc.): ");
        int diaSemana = scanner.nextInt();
        
        // Calcular descuento y total a pagar
        double descuento = 0.0;
        if (diaSemana == 2 || diaSemana == 4) {
            descuento = 0.15 * montoCompra;
        }
        double totalPagar = montoCompra - descuento;
        
        // Imprimir el descuento y el total a pagar
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Total a pagar: " + totalPagar);
    }
}

