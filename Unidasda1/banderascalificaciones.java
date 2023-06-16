package banderascalificacion;

import java.util.Scanner;

public class banderascalificaciones {
    public static void main(String[] args) {
        int totalCalificaciones = 5;
        int calificacionMinimaAprobatoria = 60;
        int calificacionesReprobatorias = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= totalCalificaciones; i++) {
            System.out.print("Ingrese la calificación " + i + ": ");
            int calificacion = scanner.nextInt();

            calificacionesReprobatorias += (calificacion < calificacionMinimaAprobatoria) ? 1 : 0;
        }

        System.out.println("Cantidad de calificaciones reprobatorias: " + calificacionesReprobatorias);

        if (calificacionesReprobatorias > 0) {
            System.out.println("Hay al menos una calificación reprobatoria.");
        } else {
            System.out.println("Todas las calificaciones son aprobatorias.");
        }

        scanner.close();
    }
}
