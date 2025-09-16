package trabajopractico5.ejercicio1;

public class Pasaporte {

    private String numero;
    private String fechaEmision;
    private Foto foto; // Asociacion con Foto
    private Titular titular; // Asociacion bidireccional con Titular

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); // Composicion con Pasaporte
    }

    public void mostrarInformacion() {
        System.out.println("Pasaporte: " + numero + " - Fecha de emisión: " + fechaEmision + " - Foto: " + foto.getImagen() + foto.getFormato());
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

}
