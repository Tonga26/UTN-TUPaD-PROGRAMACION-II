
package trabajopractico5.ejercicio6;

public class Main {

    public static void main(String[] args) {
        // Creamos la Mesa
        Mesa mesa = new Mesa("25", "10");
        
        // Creamos el Cliente
        Cliente cliente = new Cliente("Juan Carlos Sperdutti", "1134657483");

        // Creamos la Reserva 
        Reserva reserva = new Reserva("16-09-2025", "21:00", mesa);
        
        // Asociacion unidireccional
        reserva.setCliente(cliente);
        
        // Mostramos la informacion de la reserva
        reserva.mostrarInformacion();

    }

}
