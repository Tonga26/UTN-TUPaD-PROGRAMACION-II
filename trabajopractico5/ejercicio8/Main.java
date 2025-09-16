
package trabajopractico5.ejercicio8;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Gaston Giorgio", "gastongiorgio@gmail.com");
        Documento documento = new Documento("Trabajo Práctico N° 5", "Resolución ejercicios", "FSH23xq4E829a48h7224", "16-09-2025", usuario);
        
        documento.mostrarInformacion();
    }

}
