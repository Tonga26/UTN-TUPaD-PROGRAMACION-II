package trabajopractico5.ejercicio2;

public class Celular {

    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; // Agregación con Bateria
    }

    public void mostrarInformacion() {
        System.out.println(
                "Datos del celular: \n"
                + "IMEI: " + imei + "\n"
                + "Marca: " + marca + "\n"
                + "Modelo: " + modelo + "\n"
                + "Modelo de bateria: " + bateria.getModelo() + "\n"
                + "Capacidad de bateria: " + bateria.getCapacidad());
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

}
