package trabajopractico8.ejercicio1;

/**
 * Clase Producto Implementa (implements) el contrato de Pagable. Un Producto
 * "ES" Pagable.
 */
public class Producto implements Pagable {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public double calcularTotal() {
        // Para un producto, su total es su precio base.
        return this.precio;
    }
}
