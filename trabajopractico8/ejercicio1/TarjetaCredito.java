package trabajopractico8.ejercicio1;

/**
 * Clase TarjetaCredito Implementa la interface básica 'Pago'.
 */
class TarjetaCredito implements Pago {

    @Override
    public void procesarPago(double monto) {
        // Lógica de conexión con el gateway de pago (ej. Visa)
        System.out.println("Procesando pago de $" + monto + " con Tarjeta de Crédito.");
        // ... (lógica de éxito/fallo)
    }
}
