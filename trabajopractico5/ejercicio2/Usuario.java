package trabajopractico5.ejercicio2;

public class Usuario {

    private String nombre;
    private String DNI;
    private Celular celular;

    public Usuario(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", DNI=" + DNI + "}";
    }
    
    
}
