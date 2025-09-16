package trabajopractico5.ejercicio9;

public class CitaMedica {

    private String fecha;
    private String hora;
    private Paciente paciente; // Asociacion simple con Paciente
    private Profesional profesional; // Asociacion simple con Profesional

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public void mostrarInformacion() {
        System.out.println("Cita médica: \n"
                + "- Fecha: " + fecha + "\n"
                + "- Hora: " + hora + " hs." + "\n"
                + "- " + paciente + "\n"
                + "- " + profesional);
    }

}
