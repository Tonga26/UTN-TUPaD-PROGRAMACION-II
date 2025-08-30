package trabajo_practico_2;

import java.util.Scanner;

/*
11. Cálculo de descuento especial usando variable global. 
Declara una variable global Ejemplo de entrada/salida: = 0.10. 

Luego, crea un método calcularDescuentoEspecial(double precio) 
que use la variable global para calcular el descuento especial del 10%. 

Dentro del método, declara una variable local descuentoAplicado, almacena
el valor del descuento y muestra el precio final con descuento. 
*/
public class Ejercicio_11 {
    static double descuento = 0.10;
    
    public static double calcularDescuentoEspecial(double precio){
        double descuentoAplicado;
        
        descuentoAplicado = precio * descuento;
        
        return descuentoAplicado;
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioInicial, descuentoEspecial, precioFinal;
        
        System.out.println("Ingrese el precio del producto: ");
        precioInicial = Double.parseDouble(input.nextLine());
        
        descuentoEspecial = calcularDescuentoEspecial(precioInicial);
        
        precioFinal = precioInicial - descuentoEspecial;
        
        System.out.println("El descuento especial aplicado es: " + descuentoEspecial);
        
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

}
