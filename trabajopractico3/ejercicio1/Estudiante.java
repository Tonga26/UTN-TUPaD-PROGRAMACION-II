package trabajopractico3.ejercicio1;

public class Estudiante {

    String nombre, apellido;
    int curso, calificacion;

    public void mostrarInfo() {
        String mensaje = String.format("""
        *** Datos del Estudiante ***
        Nombre: %s
        Apellido: %s
        Curso: %d
        Calificación: %d
        """, nombre, apellido, curso, calificacion);

        System.out.println(mensaje);
    }

    public int subirCalificacion(int puntos) {
        calificacion += puntos;
        return calificacion;
    }

    public int bajarCalificacion(int puntos) {
        calificacion -= puntos;
        return calificacion;
    }
}
