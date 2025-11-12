package trabajopractico8.ejercicio2.DivisionSegura;

import java.util.Scanner;

public class DivisionSegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = scanner.nextInt();

            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();

            // Esta línea puede lanzar ArithmeticException
            double resultado = dividendo / divisor;

            System.out.println("El resultado es: " + resultado);

        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir por cero.");
            // e.printStackTrace(); // (Para depuración)
        } finally {
            System.out.println("... cálculo finalizado (con o sin error).");
            scanner.close();
        }
    }
}
