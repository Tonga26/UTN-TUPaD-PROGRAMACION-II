package trabajopractico8.ejercicio2.LectorConRecursos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorConRecursos {

    public static void main(String[] args) {
        
        // Esta es la ruta al archivo que queremos leer
        String rutaArchivo = "ruta_archivo.txt"; // Colocar la ruta donde se encuentra el archivo

        /**
         * 5. Uso de try-with-resources 
         * Declaramos el recurso (BufferedReader) DENTRO de los paréntesis del try.
         * El recurso debe implementar la interface 'AutoCloseable'.
         */
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            
            System.out.println("Leyendo el archivo '" + rutaArchivo + "'...");
            String linea;
            
            // Leemos línea por línea
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            
            // No necesitamos el bloque finally aqui
            // Java llamará a br.close() automáticamente al salir del bloque try

        } catch (IOException e) {
            // Capturamos IOException (que es la clase padre de FileNotFoundException)
            // Es una buena práctica manejar la excepción más general de E/S
            System.err.println("Error de E/S: No se pudo leer el archivo.");
            System.err.println("Detalle: " + e.getMessage());
        }
        
        System.out.println("... lectura finalizada.");
    }
}
