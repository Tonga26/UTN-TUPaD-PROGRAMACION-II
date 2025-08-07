/*
4. Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego
los muestre en pantalla. Usa Scanner para capturar los datos. 
*/
package programación_ii_trabajo_práctico_1;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.println("Ingresa tu nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Ingresa tu edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("El nombre ingresado es " + nombre + " y la edad es de " + edad + " años.");
    }

}
