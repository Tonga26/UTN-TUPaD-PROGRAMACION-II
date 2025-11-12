package trabajopractico8.ejercicio1;

/**
 * Interface que hereda de Pago (con 'extends') Agrega una nueva "capacidad":
 * aplicar descuentos.
 */
public interface PagoConDescuento extends Pago {

    // Nuevo método abstracto específico de esta interface
    double aplicarDescuento(double montoOriginal);
}



