package trabajopractico8.ejercicio2.ConversionSegura;

import java.util.Scanner;

public class ConversionSegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número (ej. '123'): ");
        String textoUsuario = scanner.nextLine();

        try {
            // Esta línea puede lanzar NumberFormatException
            int numero = Integer.parseInt(textoUsuario);
            System.out.println("El número ingresado es: " + numero);

        } catch (NumberFormatException e) {
            System.err.println("Error: '" + textoUsuario + "' no es un número entero válido.");
        }

        scanner.close();
    }
}
