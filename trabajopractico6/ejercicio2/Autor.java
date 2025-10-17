package trabajopractico6.ejercicio2;

public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public void mostrarInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "\n- Id: " + id + '\n' +
                "- Nombre: " + nombre + '\n' +
                "- Nacionalidad: " + nacionalidad;
    }
}
