import java.util.Scanner;

public class ProgramSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione un programa:");
        System.out.println("1. Programa de calificaciones");
        System.out.println("2. Programa de cajero automático");
        System.out.println("3. Programa de descuento");
        System.out.print("Ingrese el número de programa que desea ejecutar: ");
        int programa = scanner.nextInt();
        
        switch (programa) {
            case 1:
                ejecutarProgramaCalificaciones();
                break;
            case 2:
                ejecutarProgramaCajeroAutomatico();
                break;
            case 3:
                ejecutarProgramaDescuento();
                break;
            default:
                System.out.println("Opción inválida. El programa seleccionado no existe.");
                break;
        }
    }
    
    public static void ejecutarProgramaCalificaciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la calificación: ");
        int calificacion = scanner.nextInt();
        
        String mensaje;
        
        switch (calificacion) {
            case 0:
            case 1:
                mensaje = "Muy mal";
                break;
            case 2:
                mensaje = "Insuficiente";
                break;
            case 3:
                mensaje = "Suficiente";
                break;
            case 4:
                mensaje = "Bien";
                break;
            case 5:
                mensaje = "Notable";
                break;
            case 6:
                mensaje = "Sobresaliente";
                break;
            default:
                mensaje = "Error de calificación";
                break;
        }
        
        System.out.println("Resultado: " + mensaje);
    }
}
        System.out.println("Ejecutando programa de calificaciones...");
    }
    
    public static void ejecutarProgramaCajeroAutomatico() {
        Scanner scanner = new Scanner(System.in);
        double saldo = 15,000.0;
        
        System.out.println("Bienvenido al Cajero Automático");
        
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Opciones disponibles:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar retiro");
            System.out.println("3. Salir");
            System.out.print("Ingresa el número de opción: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: $");
                    double cantidadRetiro = scanner.nextDouble();
                    
                    if (cantidadRetiro > saldo) {
                        System.out.println("Fondos insuficientes. No se puede realizar el retiro.");
                    } else {
                        saldo -= cantidadRetiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    }
                    
                    break;
                case 3:
                    System.out.println("Gracias por utilizar el Cajero Automático. ¡Hasta pronto!");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, ingresa un número válido.");
                    break;
            }
        }
    }

        System.out.println("Ejecutando programa de cajero automático...");
    }
    
    public static void ejecutarProgramaDescuento() {
            Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código: ");
        String codigo = scanner.nextLine();

        System.out.print("Ingrese el precio del artículo: $");
        double precio = scanner.nextDouble();

        double precioConDescuento = 0.0;

        switch (codigo) {
            case "DESC10":
                precioConDescuento = precio * 0.9;
                break;
            case "DESC20":
                precioConDescuento = precio * 0.8;
                break;
            case "DESC30":
                precioConDescuento = precio * 0.7;
                break;
            default:
                System.out.println("Código inválido. No se aplica descuento.");
                return;
        }

        System.out.println("Precio original: $" + precio);
        System.out.println("Precio con descuento: $" + precioConDescuento);
    }
        System.out.println("Ejecutando programa de descuento...");
    }
}
