
package trabajopractico5.ejercicio11;

public class Main {

    public static void main(String[] args) {
        Artista artista = new Artista("La Renga", "Rock");
        Cancion cancion = new Cancion("El final es donde parti");
        
        // Asociacion unidireccional
        cancion.setArtista(artista);
        
        // Dependencia de uso
        Reproductor.reproducir(cancion);
    }

}
