package trabajopractico6.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso c){
        //si el curso que llega por parámetro no es nulo y no está asignado
        //al profesor, se agrega a su lista (evita añadir el mismo curso dos veces)
        if (c != null && !cursos.contains(c)){
            cursos.add(c);
            //se evita la recursion infinita
            if (c.getProfesor() != this){
                c.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso c){
        //el profesor elimina el curso recibido por parámetro de su lista (devuelve true si tuvo éxito),
        //y se verifica además si el curso todavía tiene asignado al profesor
        //solo se elimina el curso si realmente era su profesor asignado
        //se mantiene la coherencia: si el profesor borra un curso, el curso debe saber que se quedó sin profesor
        if (cursos.remove(c) && c.getProfesor() == this){
            c.setProfesor(null); //se modifica a null el profesor asignado a ese curso
        }
    }

    public void listarCursos() {
        System.out.println("El profesor " + nombre + " tiene los siguientes cursos:");
        if (cursos.isEmpty()) {
            System.out.println(" (Ninguno por el momento)");
            return;
        }
        for (Curso curso : cursos) {
            // Obtenemos el nombre del profesor de forma segura
            String nombreProfesor = (curso.getProfesor() != null) ? curso.getProfesor().getNombre() : "ERROR: INCONSISTENCIA";

            System.out.println("Código: " + curso.getCodigo());
            System.out.println("Nombre: " + curso.getNombre());
            System.out.println("Profesor según el curso: " + nombreProfesor);
            System.out.println("-".repeat(30));
        }
    }

    public String getId() {return id;}

    public String getNombre() {return nombre;}

    public String getEspecialidad() {return especialidad;}

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    } // devuelve la version de "solo lectura" de la lista para protegerla

    public void mostrarInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "---Profesor---\n" +
                "Id: " + id + '\n' +
                "Nombre: " + nombre + '\n' +
                "Cantidad de Cursos: " + cursos.size();
    }
}
