package trabajopractico5.ejercicio3;

public class Libro {

    private String titulo;
    private String isnb;
    private Autor autor; // Asociacion simple con autor
    private Editorial editorial; // Agregacion con editorial

    public Libro(String titulo, String isnb, Editorial editorial) {
        this.titulo = titulo;
        this.isnb = isnb;
        this.editorial = editorial;
    }

    // Asociacion simple
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarInformacion() {
        System.out.println("- Libro: " + titulo + "\n- Autor: " + autor.getNombre() + "\n- Editorial: " + editorial.getNombre());
    }
}
