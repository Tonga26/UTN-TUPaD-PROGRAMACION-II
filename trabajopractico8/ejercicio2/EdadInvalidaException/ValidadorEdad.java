package trabajopractico8.ejercicio2.EdadInvalidaException;

public class ValidadorEdad {

    /**
     * Método que "avisa" (con 'throws') que PUEDE lanzar nuestra excepción.
     *
     * @throws EdadInvalidaException
     */
    public void verificarEdad(int edad) throws EdadInvalidaException {

        if (edad < 0 || edad > 120) {
            // Usamos 'throw' (lanzar) para crear y disparar la excepción
            throw new EdadInvalidaException("La edad " + edad + " está fuera del rango (0-120).");
        }

        // Si no lanza la excepción, todo sigue normal
        System.out.println("Edad " + edad + " válida.");
    }
}