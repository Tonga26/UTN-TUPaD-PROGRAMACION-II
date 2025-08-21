
package trabajo_practico_2;

import java.util.Scanner;

/*
8. Cálculo del Precio Final con impuesto y descuento.  
 
Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce. La fórmula es:

PrecioFinal = PrecioBase + (PrecioBase×Impuesto) ? (PrecioBase×Descuento)

Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al método y muestra el precio final. 
*/

public class Ejercicio_8 {
    
    public static double calcularPrecioFinal(double PrecioBase, double Impuesto, double Descuento){
        double PrecioFinal;
        PrecioFinal = PrecioBase + (PrecioBase * (Impuesto / 100.0)) - (PrecioBase * (Descuento / 100.0));
        return PrecioFinal;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double PrecioFinal, PrecioBase, Impuesto, Descuento;
                
        
        System.out.println("Ingrese el precio base del producto: ");
        PrecioBase = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        Impuesto = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el descuento el procentaje Ejemplo: 5 para 5%): ");
        Descuento = Double.parseDouble(input.nextLine());
        
        PrecioFinal = calcularPrecioFinal(PrecioBase, Impuesto, Descuento);
        
        System.out.println("El precio final del producto es: " + PrecioFinal);
    }   
}
