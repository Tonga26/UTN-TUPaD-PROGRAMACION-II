package trabajopractico5.ejercicio12;

public class Impuesto {

    private int monto;
    private Contribuyente contribuyente;

    public Impuesto(int monto) {
        this.monto = monto;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
}
