package trabajopractico8.ejercicio2.EdadInvalidaException;

/**
 * Esta es nuestra clase de excepción personalizada. 
 * Debe heredar de Exception (para ser "checked") o RuntimeException (para ser "unchecked"). 
 * Generalmente, para reglas de negocio, se usa Exception.
 */
public class EdadInvalidaException extends Exception {

    // Constructor que acepta un mensaje de error
    public EdadInvalidaException(String mensaje) {
        // Llama al constructor de la clase padre (Exception)
        super(mensaje);
    }
}
