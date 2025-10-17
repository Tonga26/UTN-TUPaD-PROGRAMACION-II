package trabajopractico6.ejercicio2;

public class Main {
    public static void main(String[] args){
        System.out.println("Tarea 1: creando una biblioteca: \n");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional");
        System.out.println("Se ha creado la '" + biblioteca.getNombre() + "'.\n");

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 2: Creando 3 autores...");
        Autor stephenKing = new Autor("A01", "Stephen King", "Estadounidense");
        Autor isabelAllende = new Autor("A02", "Isabel Allende", "Chilena");
        Autor julioCortazar = new Autor("A03", "Julio Cortázar", "Argentino");

        System.out.println("Autores creados: ");
        stephenKing.mostrarInfo();
        isabelAllende.mostrarInfo();
        julioCortazar.mostrarInfo();

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 3: Agregando 5 libros a la biblioteca...\n");
        biblioteca.agregarLibro("978-0307743657", "It (Eso)", 1986, stephenKing);
        biblioteca.agregarLibro("978-0307475357", "La casa de los espíritus", 1982, isabelAllende);
        biblioteca.agregarLibro("978-8466333887", "Rayuela", 1963, julioCortazar);
        biblioteca.agregarLibro("978-0345806789", "El resplandor", 1977, stephenKing);
        biblioteca.agregarLibro("978-9875801217", "Bestiario", 1951, julioCortazar);
        System.out.println("Se agregaron 5 libros.");

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 4: listar todos los libros con su información y su autor:\n");
        biblioteca.listarLibros();

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 5: buscar un libro por su ISBN y mostrar su información.\n");
        biblioteca.mostrarLibroPorIsbn("978-8466333887");

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 6: filtrar y mostrar los libros publicados en un año específico.\n");
        // Caso 1: Buscando libros del año 1986 (debería encontrar "It")
        System.out.println("\nBuscando libros publicados en el año 1986:");
        biblioteca.filtrarLibrosPorAnio(1986);

        // Caso 2: Buscando libros del año 1963 (debería encontrar "Rayuela")
        System.out.println("\nBuscando libros publicados en el año 1963:");
        biblioteca.filtrarLibrosPorAnio(1963);

        // Caso 3: Buscando libros de un año que no existe (ej: 2023)
        System.out.println("\nBuscando libros publicados en el año 2023:");
        biblioteca.filtrarLibrosPorAnio(2023);

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 7: eliminar un libro por su ISBN y listar los libros restantes:\n");
        biblioteca.eliminarLibro("978-0307743657");

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 8: mostrar la cantidad total de libros en la biblioteca:\n");
        biblioteca.obtenerCantidadLibros();

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 9: listar todos los autores de los libros disponibles en la biblioteca:\n");
        biblioteca.mostrarAutoresDisponibles();
    }
}
