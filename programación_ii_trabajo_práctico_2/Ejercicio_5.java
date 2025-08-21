
package trabajo_practico_2;

import java.util.Scanner;

/*
5. Suma de Números Pares (while).  
Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados. 
*/

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_usuario;
        int total_suma_pares = 0;
        
        System.out.print("Ingrese un número (0 para terminar): ");
        num_usuario = Integer.parseInt(input.nextLine());
        
        while (num_usuario != 0){
            if (num_usuario % 2 == 0) {
                total_suma_pares += num_usuario;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            num_usuario = Integer.parseInt(input.nextLine());
        }
        
        System.out.println("La suma de los numeros pares es: " + total_suma_pares);
    }

}
