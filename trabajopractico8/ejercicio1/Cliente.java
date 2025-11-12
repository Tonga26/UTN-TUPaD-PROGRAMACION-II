package trabajopractico8.ejercicio1;

/**
 * La clase Cliente implementa dicha interfaz [cite: 30]
 */
public class Cliente implements Notificable {

    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificar(String mensaje) {
        // Lógica real: enviar un email a this.email
        System.out.println("--- NOTIFICACIÓN PARA " + nombre + " ---");
        System.out.println(mensaje);
        System.out.println("--- (Enviado a " + email + ") ---");
    }
}
