package trabajopractico5.ejercicio9;

public class Profesional {

    private String nombreProf;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombreProf = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesional{" + "nombre=" + nombreProf + ", especialidad=" + especialidad + '}';
    }

}
