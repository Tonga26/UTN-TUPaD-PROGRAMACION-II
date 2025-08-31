package trabajopractico3.ejercicio3;

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 1960){
            this.anioPublicacion = anioPublicacion;
        }
    }
}
