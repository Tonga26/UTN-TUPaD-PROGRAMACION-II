package trabajopractico5.ejercicio6;

public class Reserva {

    private String fecha;
    private String hora;
    private Cliente cliente; // asociacion simple con cliente
    private Mesa mesa; // Agregacion con Mesa

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void mostrarInformacion() {
        System.out.println("- Reserva: " + fecha + " " + hora + " hs." + "\n- Cliente que realizó la reserva: " + cliente + "\n- Mesa reservada: " + mesa);
    }

}
