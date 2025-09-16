package trabajopractico5.ejercicio9;

public class Main {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Susana Campos", "OSEP");
        Profesional profesional = new Profesional("Maria Laura Stevaccio", "Oftalmología");
        CitaMedica cita = new CitaMedica("21-10-2025", "16:00");

        // Asociamos la cita medica con el paciente y el profesional
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);

        // Mostramos lo datos de la cita medica
        cita.mostrarInformacion();

    }

}
