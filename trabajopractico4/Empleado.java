
package trabajopractico4;

public class Empleado {
    int id;
    String nombre;
    String puesto;
    double salario;
    static int totalEmpleados;
    static int contadorId = 1000;
    
    // Constructor que recibe todos los parametros
    public Empleado(int id, String nombre, String puesto, Double salario){
        totalEmpleados++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    // Constructor que recibe nombre y puesto, y asigna un id a cada empleado y un salario por defecto
    public Empleado(String nombre, String puesto){
        totalEmpleados++;
        this.id = contadorId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000000.00;
    }
    
    // Metodo sobrecargado con salario y porcentaje de aumento
    public double actualizarSalario(double porcAumento){
        this.salario *= (1 + porcAumento / 100);
        return this.salario;
    }
    
    // Metodo sobrecargado con salario y monto fijo
    public double actualizarSalario(int montoFijo){
        this.salario += montoFijo;
        return this.salario;
    }
    
    @Override
    public String toString(){
        return  "\nId: " + this.id +
                "\nNombre: " + this.nombre + 
                "\nPuesto: " + this.puesto +
                "\nSalario: $ " + this.salario +
                "\n";
               
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
}
