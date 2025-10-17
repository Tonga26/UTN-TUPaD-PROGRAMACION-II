package trabajopractico6.ejercicio2;

import trabajopractico6.ejercicio1.Producto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros; // coleccion de libros de la biblioteca

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {return nombre;}

    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
    }

    public void listarLibros(){
        if (libros.isEmpty()){
            System.out.println("La biblioteca está vacía.");
        } else {
            for (Libro libro : libros){
                libro.mostrarInfo();
            }
        }
    }

    public Libro buscarLibroPorIsbn(String isnb){
        for (Libro libro : libros){
            if (libro.getIsbn().equals(isnb)){
                return libro;
            }
        }
        return null;
    }

    public void mostrarLibroPorIsbn(String isbn){
        Libro libroEncontrado = this.buscarLibroPorIsbn(isbn);
        if (libroEncontrado != null){
            System.out.println("Se encontró el libro con el ISBN N° " + libroEncontrado.getIsbn()+ ": " + libroEncontrado + "\n");
        } else {
            System.out.println("No se encontró el libro con el ISBN especificado.");
        }
    }

    public void eliminarLibro(String isbn){
        Libro libroEliminado = this.buscarLibroPorIsbn(isbn);
        if (libroEliminado != null){
            System.out.println("Libro eliminado: " + libroEliminado.getTitulo());
            libros.remove(libroEliminado);
        } else {
            System.out.println("No se encontró el libro con ese ISBN.");
        }
        System.out.println("---Libros restantes en la biblioteca---");
        listarLibros();
    }

    public void filtrarLibrosPorAnio(int anio){
        boolean libroEncontrado = false;
        for (Libro libro : libros){
            if (libro.getAnioPublicacion() == anio){
                libroEncontrado = true;
                System.out.println("Se econtró el libro: " + libro.getTitulo());
            }
        }
        if (!libroEncontrado){
            System.out.println("No se encontró ningún libro con el año especificado.");
        }
    }

    public void obtenerCantidadLibros(){
        System.out.println("La Biblioteca nacional tiene una total de " + libros.size() + " libros.");
    }

    public void mostrarAutoresDisponibles(){
        HashSet<Autor> autoresUnicos = new HashSet<>();
        for (Libro libro : libros){
            autoresUnicos.add(libro.getAutor());
        }
        System.out.println("---Autores disponibles en la biblioteca---");
        for (Autor autor : autoresUnicos){
            System.out.println(autor);
            System.out.println("-".repeat(20));
        }
    }

}
