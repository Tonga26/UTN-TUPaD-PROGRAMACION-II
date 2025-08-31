package trabajopractico3.ejercicio1;

public class Main {

    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();

        est1.nombre = " Gastón";
        est1.apellido = " Giorgio";
        est1.curso = 2;
        est1.calificacion = 7;
        
        int puntos = 2;
        int calificacion;
        
        est1.mostrarInfo();
        calificacion = est1.subirCalificacion(puntos);
        System.out.println("Se subió la calificación a: " + calificacion);
        calificacion = est1.bajarCalificacion(puntos);
        System.out.println("Se bajó la calificación a: " + calificacion);
    }
}
