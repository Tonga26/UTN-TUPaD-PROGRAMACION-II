package trabajo_practico_2;

import java.util.Scanner;

/*
6. Contador de Positivos, Negativos y Ceros (for).  
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros. 
 */

public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_usuario, cont_positivos = 0, cont_negativos = 0, cont_ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            num_usuario = Integer.parseInt(input.nextLine());

            if (num_usuario > 0) {
                cont_positivos++;
            } else if (num_usuario < 0) {
                cont_negativos++;
            } else {
                cont_ceros++;
            }
        }
        
        System.out.println("Resultados: ");
        System.out.println("Positivos: " + cont_positivos);
        System.out.println("Negativos: " + cont_negativos);
        System.out.println("Ceros: " + cont_ceros);
        
    }

}
