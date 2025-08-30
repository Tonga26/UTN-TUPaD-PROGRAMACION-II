/*
8. Manejar conversiones de tipo y división en Java. 
a. Escribe un programa que divida dos números enteros ingresados por el
usuario. 
b. Modifica el código para usar double en lugar de int y compara los
resultados. 
*/
package programación_ii_trabajo_práctico_1;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, division;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        division = num1 / num2;
        
        System.out.println("Resultado division: " + division);
    }

}
