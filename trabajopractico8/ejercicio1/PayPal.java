package trabajopractico8.ejercicio1;

/**
 * Clase PayPal Implementa la interface avanzada 'PagoConDescuento'.
 */
class PayPal implements PagoConDescuento {

    @Override
    public void procesarPago(double monto) {
        // Lógica de conexión con la API de PayPal
        System.out.println("Procesando pago de $" + monto + " con PayPal.");
    }

    @Override
    public double aplicarDescuento(double montoOriginal) {
        double descuento = montoOriginal * 0.05; // 5% de descuento con PayPal
        double montoFinal = montoOriginal - descuento;
        System.out.println("Descuento de $" + descuento + " aplicado por usar PayPal.");
        return montoFinal;
    }
}
