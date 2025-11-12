package trabajopractico8.ejercicio1;

/**
 * Clase principal para probar el sistema de E-commerce. Aquí es donde vemos
 * cómo las clases desacopladas interactúan.
 */
public class ECommerceDemo {

    public static void main(String[] args) {

        System.out.println("--- 1. Creando el Cliente (que es Notificable) ---");
        // Creamos un objeto Cliente.
        // Gracias a la interface, podemos tratarlo como un 'Cliente'
        // o como un 'Notificable'.
        Cliente cliente1 = new Cliente("Gaston Giorgio", "gastongiorgio@gmail.com");

        // Lo asignamos a una variable de tipo Interface.
        // Esto demuestra que 'Pedido' solo verá la parte 'Notificable' de 'Cliente'.
        Notificable notificadorCliente = cliente1;

        System.out.println("\n--- 2. Creando el Pedido ---");
        // Al crear el Pedido, le pasamos el 'notificadorCliente'.
        // El Pedido NO SABE que es un 'Cliente', solo sabe que
        // es 'Notificable'.
        Pedido pedido = new Pedido(notificadorCliente);

        System.out.println("\n--- 3. Creando Productos (que son Pagables) ---");
        // Creamos productos
        Producto laptop = new Producto("Laptop Pro", 150000.0);
        Producto mouse = new Producto("Mouse Inalámbrico", 7500.0);

        // Los agregamos al pedido usando el método 'agregarItem'.
        // Nota: El método espera un 'Pagable', y 'Producto' LO ES.
        pedido.agregarItem(laptop);
        pedido.agregarItem(mouse);

        // Cambiamos el estado del pedido, esto disparará la notificación.
        pedido.setEstado("PROCESANDO");

        System.out.println("\n--- 4. Calculando el Total (usando Polimorfismo) ---");
        // Llamamos a calcularTotal() sobre el 'Pedido'.
        // El Pedido, a su vez, llamará a calcularTotal() de cada 'Producto'.
        double totalPedido = pedido.calcularTotal();
        System.out.println("El total del pedido es: $" + totalPedido);

        System.out.println("\n--- 5. Seleccionando Métodos de Pago ---");
        // Creamos las instancias de los métodos de pago.
        Pago metodoTarjeta = new TarjetaCredito();
        PagoConDescuento metodoPayPal = new PayPal();

        // --- Escenario A: Pagando con Tarjeta (sin descuento) ---
        System.out.println("\n--- Escenario A: Pago con Tarjeta ---");
        // La variable 'montoFinalA' es el total original.
        double montoFinalA = totalPedido;

        // 'metodoTarjeta' solo conoce la interface 'Pago',
        // por lo que solo tiene el método .procesarPago()
        metodoTarjeta.procesarPago(montoFinalA);

        // Avisamos al cliente
        pedido.setEstado("PAGADO (con Tarjeta)");

        // --- Escenario B: Pagando con PayPal (con descuento) ---
        System.out.println("\n--- Escenario B: Pago con PayPal ---");

        // 'metodoPayPal' conoce la interface 'PagoConDescuento',
        // por lo que puede .aplicarDescuento()
        double montoFinalB = metodoPayPal.aplicarDescuento(totalPedido);
        System.out.println("Monto original: $" + totalPedido + " | Monto con descuento: $" + montoFinalB);

        // Y también puede .procesarPago() (porque lo heredó de 'Pago')
        metodoPayPal.procesarPago(montoFinalB);

        // Avisamos al cliente
        pedido.setEstado("PAGADO (con PayPal)");

        System.out.println("\n--- Simulación Finalizada ---");
    }
}
