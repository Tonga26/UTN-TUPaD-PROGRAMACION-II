package trabajopractico7.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Empleado> listaEmpleados = new ArrayList<>();

        EmpleadoPlanta emp1 = new EmpleadoPlanta("Ana López", "P-456", 50000.00);
        listaEmpleados.add(emp1);

        EmpleadoPlanta emp2 = new EmpleadoPlanta("Elena Pérez", "P-234", 72000.00);
        listaEmpleados.add(emp2);

        EmpleadoTemporal emp3 = new EmpleadoTemporal("Carlos Ruiz", "T-101", 350.50, 160);
        listaEmpleados.add(emp3);

        EmpleadoTemporal emp4 = new EmpleadoTemporal("Fabián González", "T-888", 200.00, 100);
        listaEmpleados.add(emp4);

        
        for (Empleado emp : listaEmpleados) {
            double sueldo = emp.calcularSueldo(); 

            System.out.println("----------------------------------------");
            System.out.println("Legajo: " + emp.legajo + " | Nombre: " + emp.nombre);

            if (emp instanceof EmpleadoPlanta) {
                System.out.println("TIPO: Empleado de Planta (Sueldo Fijo)");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("TIPO: Empleado Temporal (Por Horas)");
            }

            System.out.println("SUELDO FINAL: $" + sueldo);
        }

    }

}
