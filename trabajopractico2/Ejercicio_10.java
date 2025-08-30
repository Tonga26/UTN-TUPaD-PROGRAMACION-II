package trabajo_practico_2;

import java.util.Scanner;

/*
10. Actualización de stock a partir de venta y recepción de productos. 
Crea un método actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida), 
que calcule el nuevo stock después de una venta y recepción de productos:

NuevoStock = StockActual ? CantidadVendida + CantidadRecibida 
NuevoStock = CantidadVendida + CantidadRecibida 

Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
cantidad recibida, y muestra el stock actualizado. 
*/

public class Ejercicio_10 {
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock;
        
        nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        
        return nuevoStock;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stockActual, cantidadVendida, cantidadRecibida, nuevoStock;
        
        System.out.println("Ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad recibida: ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

}
