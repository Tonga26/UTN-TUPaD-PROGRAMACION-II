package trabajopractico6.ejercicio3;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void setProfesor(Profesor p) {
        //si el profesor que llega por parámetro es el mismo profesor que ya tiene asignado el curso, no hacer nada
        if (this.profesor == p) return;

        //si el curso tiene un profesor asignado anteriormente, eliminar dicho profesor
        //(actualiza del lado del profesor)
        if (this.profesor != null){
            this.profesor.eliminarCurso(this);
        }

        //se establece el nuevo profesor para el curso (puede ser uno nuevo o null)
        this.profesor = p;

        // si el profesor no es nulo y si no tiene asignado dicho curso, se le asigna (agrega) a su lista
        if (profesor != null && !profesor.getCursos().contains(this)){
            profesor.agregarCurso(this);
        }

    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void mostrarInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        return "---Curso---\n" +
                "Código: " + codigo + '\n' +
                "Nombre: " + nombre + '\n' +
                "Profesor: " + nombreProfesor;
    }
}
