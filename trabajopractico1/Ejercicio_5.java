/*
5. Escribe un programa que solicite dos números enteros y realice las siguientes
operaciones:  
a. Suma  
b. Resta  
c. Multiplicación  
d. División  
Muestra los resultados en la consola. 
*/
package programación_ii_trabajo_práctico_1;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, suma, resta, multiplicacion; 
        double division;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / (double) num2;
        
        System.out.println("Resultado suma : " + suma);
        System.out.println("Resultado resta: " + resta);
        System.out.println("Resultado multiplicacion: " + multiplicacion);
        System.out.println("Resultado division: " + division);
        
    }

}
