import trabajopractico8.ejercicio2.EdadInvalidaException.EdadInvalidaException;
import trabajopractico8.ejercicio2.EdadInvalidaException.ValidadorEdad;


public static void main(String[] args) {
        ValidadorEdad validador = new ValidadorEdad();

        try {
            // Prueba válida
            validador.verificarEdad(34);

            // Prueba inválida
            validador.verificarEdad(150);

            // Esta línea no se ejecutará si la anterior falla
            validador.verificarEdad(25);

        } catch (EdadInvalidaException e) {
            // Capturamos NUESTRA excepción personalizada por su nombre
            System.err.println("Error de validación: " + e.getMessage());
        }
}
