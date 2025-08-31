
package trabajopractico3.ejercicio3;

public class Main {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        
        libro1.setAnioPublicacion(1950);
        System.out.println("Intento inválido de modificación: " + libro1.getAnioPublicacion());
        
        libro1.setAnioPublicacion(1970);
        System.out.println("Intento válido de modificación: " + libro1.getAnioPublicacion());
    }

}
