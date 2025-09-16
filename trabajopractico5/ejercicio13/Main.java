package trabajopractico5.ejercicio13;

public class Main {
    public static void main(String[] args) {
        // Creamos un Usuario
        Usuario usuario = new Usuario("Gastón Giorgio", "gastongiorgio@mail.com");

        // Creamos un GeneradorQR
        GeneradorQR generador = new GeneradorQR();

        // Usamos el generador para crear el CodigoQR 
        generador.generar("ACXD2398AAD21MNFR", usuario);
    }
}

