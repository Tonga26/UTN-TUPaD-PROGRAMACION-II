package trabajo_practico_2;

import java.util.Scanner;

/*
2. Determinar el Mayor de Tres Números. 
Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.  
 */

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el tercer número: ");
        num3 = Integer.parseInt(input.nextLine());

        int mayor = num1;
        
        if (num2 > mayor) {
            mayor = num2;
        } else if(num3 > mayor) {
            mayor = num3;
        } 
        
        System.out.println("El mayor es: " + mayor);
    }

}
