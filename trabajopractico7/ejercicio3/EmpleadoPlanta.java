package trabajopractico7.ejercicio3;

public class EmpleadoPlanta extends Empleado {

    private double sueldoFijo;

    public EmpleadoPlanta(String nombre, String legajo, double sueldoFijo) {
        super(nombre, legajo);
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public double calcularSueldo() {
        return sueldoFijo;
    }
}
