import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
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

