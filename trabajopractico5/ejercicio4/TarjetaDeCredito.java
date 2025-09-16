package trabajopractico5.ejercicio4;

public class TarjetaDeCredito {

    private String numero;
    private String fechaVencimiento;
    private Banco banco; // agregacion con banco
    private Cliente cliente; // Asociacion bidireccional con cliente

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void mostrarInformacion() {
        System.out.println("Tarjeta de crédito N°: " + numero + "\nBanco: " + banco.getNombre() + "\nCliente: " + cliente.toString());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }
    
    

}
