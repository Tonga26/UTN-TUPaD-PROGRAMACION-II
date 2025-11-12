package trabajopractico8.ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Clase Pedido: tiene una lista de productos, implementa Pagable Un Pedido
 * también "ES" Pagable.
 */
public class Pedido implements Pagable {

    // Un pedido "TIENE" una lista de objetos Pagable.
    // Usamos la interface (Pagable) en lugar de la clase (Producto)
    // para ser más flexibles. 
    private List<Pagable> items;
    private String estado;
    
    // El Pedido AHORA "CONOCE" a un objeto Notificable.
    // Nota: No conoce a "Cliente", solo a "Notificable".
    private Notificable clienteANotificar;

    public Pedido(Notificable cliente) {
        this.items = new ArrayList<>();
        this.estado = "PENDIENTE";
        this.clienteANotificar = cliente;
    }

    public void agregarItem(Pagable item) {
        this.items.add(item);
        System.out.println("Item agregado al pedido.");
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;

        for (Pagable item : this.items) {
            total += item.calcularTotal();
        }

        return total;
    }
    
    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        
        // Al cambiar el estado, usamos el contrato "Notificable"
        // para avisarle al cliente, sin saber que es un "Cliente".
        if (this.clienteANotificar != null) {
            this.clienteANotificar.notificar("El estado de su pedido cambió a: " + nuevoEstado);
        }
    }
}
