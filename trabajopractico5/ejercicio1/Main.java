package trabajopractico5.ejercicio1;

public class Main {

    public static void main(String[] args) {
        // Creamos un objeto pasaporte
        Pasaporte pasaporte = new Pasaporte("A45680", "2025-14-09", "imagen", ".png");

        // Mostramos su informacion (incluyendo el objeto foto)
        pasaporte.mostrarInformacion();

        // Creamos un objeto Titular
        Titular titular = new Titular("Gaston Giorgio", "32876291");

        // Asignación bidireccional
        titular.setPasaporte(pasaporte);

        // Mostrar información del titular
        System.out.println("Titular del pasaporte: " + pasaporte.getTitular().getNombre() + " - DNI: " + pasaporte.getTitular().getDNI());
    }
}
