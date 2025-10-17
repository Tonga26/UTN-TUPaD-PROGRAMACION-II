package trabajopractico6.ejercicio3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p){
        this.profesores.add(p);
    }

    public void agregarCurso(Curso c){
        this.cursos.add(c);
    }

    public void listarProfesores(){
        if (profesores.isEmpty()){
            System.out.println("No hay profesores todavía.");
        } else {
            for (Profesor p : profesores){
                p.mostrarInfo();
            }
        }
    }

    public void listarCursos(){
        if (cursos.isEmpty()){
            System.out.println("No hay cursos todavía.");
        } else {
            for (Curso c : cursos){
                c.mostrarInfo();
            }
        }
    }

    public Profesor buscarProfesorPorId(String id){
        for (Profesor p : profesores){
            if (p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo){
        for (Curso c : cursos){
            if (c.getCodigo().equals(codigo)){
                return c;
            }
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Profesor profEncontrado = buscarProfesorPorId(idProfesor);
        Curso cursoEncontrado = buscarCursoPorCodigo(codigoCurso);
        // Se verifica que ambos no sean nulos antes de asignar
        if (profEncontrado != null && cursoEncontrado != null){
            cursoEncontrado.setProfesor(profEncontrado);
            System.out.println("Se asignó al profesor " + profEncontrado.getNombre() + " al curso " + cursoEncontrado.getNombre());
        } else {
            System.out.println("No existe profesores o cursos para relacionar.");
        }
    }

    public void eliminarCurso(String codigo){
        Curso cursoEncontrado = buscarCursoPorCodigo(codigo);
        if (cursoEncontrado == null){
            System.out.println("No se encontró el curso con el código especificado.");
        } else {
            cursoEncontrado.setProfesor(null);
            cursos.remove(cursoEncontrado);
            System.out.println("Curso eliminado:\n" + cursoEncontrado);
        }
    }

    public void eliminarProfesor(String id){
        Profesor profEncontrado = buscarProfesorPorId(id);
        if (profEncontrado == null){
            System.out.println("No se encontró el profesor con el id especificado.");
        } else {
            // Se crea una copia del array de cursos a eliminar (para evitar errores al modificar la lista mientras la recorremos)
            List<Curso> cursosADesvincular = new ArrayList<>(profEncontrado.getCursos());
            // Se desvincula al profesor de todos sus cursos
            for (Curso c : cursosADesvincular){
                c.setProfesor(null);
            }
            // Se elimina al profesor de la lista de profesores
            profesores.remove(profEncontrado);
            System.out.println("El profesor " + profEncontrado.getNombre() + " con el id " + profEncontrado.getId() + " ha sido eliminado.");
        }
    }

    public String getNombre() {return nombre;}

    public List<Profesor> getProfesores() {
        return Collections.unmodifiableList(profesores);
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    @Override
    public String toString() {
        return "Universidad: " +
                "nombre:" + nombre + '\n';
    }
}
