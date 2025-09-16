package trabajopractico5.ejercicio4;

public class Main {

    public static void main(String[] args) {
        // Creamos el banco, la tarjeta y el cliente
        Banco banco = new Banco("Francés", "20-36473998-4");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("234561239023722098", "2029-10-15", banco);
        Cliente cliente = new Cliente("Martin Rodriguez", "26783662", tarjeta);

        // Asociacion bidireccional
        tarjeta.setCliente(cliente);

        // Mostramos informacion despues de la asociacion
        System.out.println("\n===Datos de la tarjeta===");
        tarjeta.mostrarInformacion();
    }
}
