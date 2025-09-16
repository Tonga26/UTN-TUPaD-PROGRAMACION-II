package trabajopractico5.ejercicio4;

public class Cliente {

    private String nombre;
    private String DNI;
    private TarjetaDeCredito tarjeta; // Asociacion bidireccional con TarjetaDeCredito

    public Cliente(String nombre, String DNI, TarjetaDeCredito tarjeta) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.tarjeta = tarjeta;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", DNI=" + DNI + '}';
    }
    
    
}
