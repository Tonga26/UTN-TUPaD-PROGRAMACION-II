package trabajo_practico_2;

import java.util.Scanner;
/*
9.  Composición de funciones para calcular costo de envío y total de compra. 
a.  calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete.

Nacional: $5 por kg  
Internacional: $10 por kg 

b. calcularTotalCompra(double precioProducto, double costoEnvio): 
Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.

Desde main(), solicita el peso del paquete, la zona de envío y el precio 
del producto. Luego, muestra el total a pagar. 
*/

public class Ejercicio_9 {
    
    public static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio = 0;
        
        if (zona.equals("Nacional")) {
            costoEnvio = 5 * peso;
        } else if (zona.equals("Internacional")) {
            costoEnvio = 10 * peso;
        }
        return costoEnvio;
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double totalCompra;
        
        totalCompra = precioProducto + costoEnvio;
        return totalCompra;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioProducto, peso, costoEnvio, totalAPagar;
        String zona;
        
        System.out.println("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese la zona de envio (Nacional/Internacional): ");
        zona = input.nextLine();
        
        costoEnvio = calcularCostoEnvio(peso, zona);
        
        totalAPagar = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo del envio es: $ " + costoEnvio);
        
        System.out.println("El total a pagar es: $ " + totalAPagar);
        
    }
}
