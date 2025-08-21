package trabajo_practico_2;

import java.util.Scanner;

/*
7. Validación de Nota entre 0 y 10 (do-while). 
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
hasta que ingrese un valor válido. 
 */
public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota_usuario;
        
        do {   
            System.out.print("Ingrese una nota (0-10): ");
            nota_usuario = Integer.parseInt(input.nextLine());
            
            if (nota_usuario < 0 || nota_usuario > 10) {
                System.out.println("ERROR. Nota inválida. Ingrese una nota entre 0 y 10.");
            }

        } while (!(nota_usuario >= 0 && nota_usuario <= 10));
        
        System.out.println("Nota guardada correctamente.");
    }

}
