
package trabajopractico3.ejercicio2;

public class Main {

    public static void main(String[] args) {
        Mascota perro = new Mascota();
        
        perro.nombre = "Lennon";
        perro.especie = "Caniche";
        perro.edad = 5;
        int nuevaEdad;
        
        perro.mostrarInfo();
        
        nuevaEdad = perro.cumplirAnios(1);
        System.out.println("Paso un año. Lennon ahora tiene " + nuevaEdad + " años.");
        nuevaEdad = perro.cumplirAnios(1);
        System.out.println("Paso un año. Lennon ahora tiene " + nuevaEdad + " años.");
        nuevaEdad = perro.cumplirAnios(1);
        System.out.println("Paso un año. Lennon ahora tiene " + nuevaEdad + " años.");
    }

}
