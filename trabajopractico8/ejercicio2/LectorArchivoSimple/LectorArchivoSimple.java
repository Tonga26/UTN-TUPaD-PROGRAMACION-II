package trabajopractico8.ejercicio2.LectorArchivoSimple;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectorArchivoSimple {

    public static void main(String[] args) {

        File archivo = new File("un_archivo_que_no_existe.txt");

        try {
            // Esta línea puede lanzar una "Checked Exception
            Scanner scannerArchivo = new Scanner(archivo);

            System.out.println("Contenido del archivo:");
            while (scannerArchivo.hasNextLine()) {
                System.out.println(scannerArchivo.nextLine());
            }
            scannerArchivo.close();

        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo '" + archivo.getName() + "' no se encontró.");
        }
    }
}
