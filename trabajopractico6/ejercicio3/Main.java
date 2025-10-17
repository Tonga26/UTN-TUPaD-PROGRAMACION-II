package trabajopractico6.ejercicio3;

import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("---Tarea 1: crear 3 profesores y 5 cursos---");

        Profesor prof1 = new Profesor("P001", "Alan Turing", "Inteligencia Artificial");
        Profesor prof2 = new Profesor("P002", "Ada Lovelace", "Algoritmos");
        Profesor prof3 = new Profesor("P003", "Grace Hopper", "Compiladores");

        System.out.println("3 profesores creados.");

        Curso curso1 = new Curso("C101", "Programación Orientada a Objetos");
        Curso curso2 = new Curso("C102", "Bases de Datos");
        Curso curso3 = new Curso("C103", "Estructuras de Datos");
        Curso curso4 = new Curso("C104", "Sistemas Operativos");
        Curso curso5 = new Curso("C105", "Redes de Computadoras");

        System.out.println("5 cursos creados.");
        System.out.println("-".repeat(50));

        System.out.println("---Tarea 2: agregar profesores y cursos a la universidad---");
        Universidad universidad = new Universidad("Universidad Tecnológica Nacional");
        System.out.println("Se ha creado la " + universidad.getNombre());
        System.out.println("-".repeat(50));

        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        System.out.println("3 profesores registrados");

        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        System.out.println("5 cursos registrados");
        System.out.println("-".repeat(50));

//        // --- Verificación ---
//        System.out.println("\n--- Reporte Inicial de la Universidad ---");
//        universidad.listarProfesores();
//        System.out.println(); // Un espacio en blanco para separar
//        universidad.listarCursos();
//        System.out.println("-".repeat(50));

        System.out.println("\n--- Tarea 3: Asignando profesores a cursos ---");
        // Asignamos a Ada Lovelace a POO y Estructuras de Datos
        universidad.asignarProfesorACurso("C101", "P002");
        universidad.asignarProfesorACurso("C103", "P002");

        // Asignamos a Grace Hopper a Bases de Datos
        universidad.asignarProfesorACurso("C102", "P003");

        System.out.println("\n--- Tarea 4: Verificando la sincronización bidireccional ---");

        System.out.println("\n*** Lista Detallada de Profesores y sus Cursos: ***");
        universidad.listarProfesores();

        System.out.println("\n*** Lista Detallada de Cursos y sus Profesores: ***");
        universidad.listarCursos();

        System.out.println("-".repeat(50));

        System.out.println("\n--- Tarea 5: Cambiando la asignación de un curso ---");

        // El curso "Bases de Datos" (C102) es de Grace Hopper (P003).
        // Se lo reasignamos a Alan Turing (P001), que no tiene cursos.
        System.out.println("Reasignando el curso 'Bases de Datos' (C102) a Alan Turing (P001)...");
        universidad.asignarProfesorACurso("C102", "P001");

        System.out.println("\n--- Reporte después de la reasignación ---");
        universidad.listarProfesores();
        System.out.println();
        universidad.listarCursos();
        System.out.println("-".repeat(50));

        System.out.println("\n--- Tarea 6: Eliminando un curso del sistema ---");

        // El curso "Estructuras de Datos" (C103) es de Ada Lovelace (P002).
        System.out.println("Eliminando el curso 'Estructuras de Datos' (C103)...");
        universidad.eliminarCurso("C103");

        // Intentamos eliminar un curso que no existe para verificar el manejo de errores.
        System.out.println("\nIntentando eliminar un curso con código incorrecto:");
        universidad.eliminarCurso("C999"); // Este fallará, como se espera.

        System.out.println("\n--- Reporte después de la eliminación del curso ---");
        universidad.listarProfesores();
        System.out.println();
        universidad.listarCursos();
        System.out.println("-".repeat(50));

        System.out.println("\n--- Tarea 7: Eliminando un profesor del sistema ---");

        // Alan Turing (P001) dicta "Bases de Datos" (C102).
        System.out.println("Eliminando al profesor Alan Turing (P001)...");
        universidad.eliminarProfesor("P001");

        System.out.println("\n--- Reporte final después de la eliminación del profesor ---");
        universidad.listarProfesores();
        System.out.println();
        universidad.listarCursos();
        System.out.println("-".repeat(50));

         System.out.println("\n--- Tarea 8: Reporte final de carga de cursos por profesor ---");

        // Obtenemos la lista de los profesores que quedan en la universidad
        List<Profesor> profesoresActuales = universidad.getProfesores();

        if (profesoresActuales.isEmpty()) {
            System.out.println("No hay profesores activos en la universidad.");
        } else {
            System.out.println("Cantidad de cursos por profesor:");
            for (Profesor prof : profesoresActuales) {
                // Para cada profesor, obtenemos su nombre y el TAMAÑO de su lista de cursos
                String nombre = prof.getNombre();
                int cantidadCursos = prof.getCursos().size();

                System.out.println("- " + nombre + ": " + cantidadCursos + " curso(s).");
            }
        }
    }
}
