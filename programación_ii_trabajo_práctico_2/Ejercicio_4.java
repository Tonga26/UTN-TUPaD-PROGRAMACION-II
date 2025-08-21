package trabajo_practico_2;

import java.util.Scanner;

/*
4. Calculadora de Descuento según categoría. 
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C). 
Luego, aplique los siguientes descuentos: 
Categoría A: 10% de descuento 
Categoría B: 15% de descuento  
Categoría C: 20% de descuento 
El programa debe mostrar el precio original, el descuento aplicado y el
precio final 
 */

public class Ejercicio_4 {

    public static void main(String[] args) {
        double precio_final;
        int descuentoCatA = 10, descuentoCatB = 15, descuentoCatC = 20;
        String categoria;
        int descuentoAplicado = 0; 

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio_original = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        categoria = input.nextLine();

        if (categoria.equals("A")) {
            precio_final = precio_original * (1 - descuentoCatA / 100.0);
            descuentoAplicado = descuentoCatA;
        } else if (categoria.equals("B")) {
            precio_final = precio_original * (1 - descuentoCatB / 100.0);
            descuentoAplicado = descuentoCatB;
        } else if (categoria.equals("C")) {
            precio_final = precio_original * (1 - descuentoCatC / 100.0);
            descuentoAplicado = descuentoCatC;
        } else {
            System.out.println("Categoría no válida.");
            return;
        }

        System.out.println("Descuento aplicado: " + descuentoAplicado + " %");
        System.out.println("Precio final: " + precio_final);
    }

}
