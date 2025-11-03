package trabajopractico7.ejercicio3;

public class EmpleadoTemporal extends Empleado {

    private double valorDeHoraTrabajada;
    private int cantDeHorasTrabajadas;

    public EmpleadoTemporal(String nombre, String legajo, double valorDeHoraTrabajada, int cantDeHorasTrabajadas) {
        super(nombre, legajo);
        this.valorDeHoraTrabajada = valorDeHoraTrabajada;
        this.cantDeHorasTrabajadas = cantDeHorasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return valorDeHoraTrabajada * cantDeHorasTrabajadas;
    }
}
