
package trabajopractico4;

public class Main {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1003, "Gastón Giorgio", "Ventas", 2000000.00);
        Empleado empleado2 = new Empleado(1004, "Gisel Ogaz", "Marketing", 1500000.00);
        Empleado empleado3 = new Empleado(1005, "Carlos Sánchez", "Administracion", 1800000.00);
        Empleado empleado4 = new Empleado("Martin García", "Recursos Humanos");
        Empleado empleado5 = new Empleado("Roberto Milán", "Ventas");
        Empleado empleado6 = new Empleado("Romina Barrios", "Gerencia");
        
        // Muestra de datos de cada empleado
        System.out.println("---- Datos de empleados ----");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        System.out.println(empleado5.toString());
        System.out.println(empleado6.toString());
        
        System.out.println("-".repeat(50));
        
        System.out.println("---- Empleados con salarios actualizados por porcentaje ----");
        empleado2.actualizarSalario(20.0);
        System.out.println(empleado2.toString());
        
        empleado5.actualizarSalario(10.0);
        System.out.println(empleado5.toString());
        
        System.out.println("---- Empleados con salarios actualizados por monto fijo ----");
        empleado1.actualizarSalario(500000);
        System.out.println(empleado1.toString());
        
        empleado6.actualizarSalario(200000);
        System.out.println(empleado6.toString());
        
        System.out.println("Total de empleados registrados: " + Empleado.totalEmpleados);
        
    }

}
