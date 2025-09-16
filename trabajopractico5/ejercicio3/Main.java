
package trabajopractico5.ejercicio3;

public class Main {

    public static void main(String[] args) {
        // Creamos editorial, autor y libro
        Editorial editorial = new Editorial("Minotauro", "Av. Sin Nombre 123");
        Autor autor = new Autor("Gabriel García Márquez", "Colombia");
        Libro libro = new Libro("Cien años de soledad", "AB988", editorial);
        
        // Asociamos libro con autor
        libro.setAutor(autor);
        
        // Mostramos la informacion del libro con su autor y editorial
        libro.mostrarInformacion();
    }

}
