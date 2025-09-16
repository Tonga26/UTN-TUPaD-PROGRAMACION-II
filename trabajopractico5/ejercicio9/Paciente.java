package trabajopractico5.ejercicio9;

public class Paciente {

    private String nombrePaciente;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombrePaciente = nombre;
        this.obraSocial = obraSocial;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombrePaciente + ", obraSocial=" + obraSocial + '}';
    }

}
