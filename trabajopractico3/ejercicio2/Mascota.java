
package trabajopractico3.ejercicio2;

public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    public void mostrarInfo(){
        String mensaje = String.format("""
        *** Datos de mi mascota ***
        Nombre: %s
        Especie: %s
        Edad actual: %d
        """, nombre, especie, edad);

        System.out.println(mensaje);
    }
    
    public int cumplirAnios( int anios){
        edad += anios;
        return edad;
    }
}
