package trabajopractico5.ejercicio7;

public class Motor {

    private String tipo;
    private String nroSerie;

    public Motor(String tipo, String nroSerie) {
        this.tipo = tipo;
        this.nroSerie = nroSerie;
    }

    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo + ", nroSerie=" + nroSerie + '}';
    }

}
